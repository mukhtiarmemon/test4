//
//Exception is throw if the customer number is less than min and greater than max


public class CustomerNumberException extends Exception
{
    private int min;
    private int max;
    private long number;
    
    public CustomerNumberException(long no)
    {
        min = 1000;
        max = 2000;
        this.number = no;
    }
   public long getNo()
    {
        return number;
    }
    public int getMin()
    {
        return min;
    }
    public int getMax()
    {
        return max;
    }
    
    public boolean customerOK()
    {
        if((number < min) ||  (number > max)){
            return false;
        }
        else{
            return true;
        }
    }
    public String toString()
    {
        return "Customer number has to be greater than " + min +
               " and less than " +  max;
    }
}

