//Two Sigma

public class PowerofFour {

	//good solution
	//check if num is positive, check if it only has one bit activated, and check that it's an odd bit that is activated//
	public boolean isPowerOfFour(int num)
	{
        return (num>0) && ((num & (num-1)) == 0) && ((num & 0x55555555)==num); 
	}
	/* bad solution
    public boolean isPowerOfFour(int num) {
        double temp = 0;
        int i = 0;
        while (temp < num)
        {
            temp = Math.pow(4,i);
            if (temp == num)
                return true;
            i++;
        }
        return false;   
    }*/
}
