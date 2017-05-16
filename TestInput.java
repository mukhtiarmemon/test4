import java.util.Scanner;
/**
 * Write a description of class TestScanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestInput
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TestScanner
     */
    public TestInput()
    {
        // initialise instance variables
        x = 0;
    }


    public void sampleMethod(int y)
    {
        System.out.println("Enter here:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(x);
        // put your code here
        
    }
}
