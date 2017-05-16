import java.lang.Exception;
import java.lang.ArithmeticException;

public class ExceptionSolution{  

    public ExceptionSolution(){
    }
    public void testArithmaticException(int x, int y) throws ArithmeticException{
        try {
            int data=x/y;    //may throw exception  
            System.out.println("result =" + data);
        }

        catch(ArithmeticException ae){
            //System.out.println(ae);
            ae.printStackTrace();
            //System.out.println("exception found, TYPE: arithmatic exception");
            System.out.println(ae);

        }
        finally {

            System.out.println("Hint: Check input values please");
        }

    }

    public void testMultipleExceptions(int x, String y) throws NumberFormatException,ArithmeticException {

        try {
            int integerY = Integer.parseInt(y);
            int data=x/integerY;    //may throw exception  
            System.out.println("result =" + data);
        }                
        catch(ArithmeticException ae){
            System.out.println(ae);
            System.out.println("exception found, TYPE: Arithmatic Exception");

        }

        catch(NumberFormatException nfe){
            System.out.println(nfe);
            System.out.println("exception found, TYPE: NumberFormat Exception");

        }
    }

    public void testArrayOutOfBoundsException(int index, int value)throws ArrayIndexOutOfBoundsException{

        try {
            int arr[] = new int[5];
            arr[index] = value;    //may throw exception  

            System.out.println("result =" + arr[index]); 
        }

        catch(ArrayIndexOutOfBoundsException aiob){

            System.out.println(aiob);
            System.out.println("exception found, TYPE: ArrayIndexOutOfBoundsException");

        }    

        finally {

            System.out.println("Hint: array index please");
        }
    } 

    public void testNullPointerException(String str) throws NullPointerException{ 

        //enter null not ""
        try { 
            System.out.println("result =" + str.length());  //may throw exception  
        }

        catch(NullPointerException npe){

            System.out.println(npe);

        }

        finally {

            System.out.println("Hint: check string length please");
        }

    } 
    public void testNumberFormatException(String number) throws NumberFormatException{     
        try {
            int i=Integer.parseInt(number);     //NumberFormatException  
            System.out.println("result =" + i);
        }

        catch(NumberFormatException nfe){

            System.out.println(nfe);

        }    
    } 
} 