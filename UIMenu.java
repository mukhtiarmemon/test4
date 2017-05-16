import java.util.Scanner;
/**
 * Example to test of try-catch
 * 
 * @author (Kis Boisen Hansen) 
 * @version (2007.11.20, 2010.11.27)
 */
public class UIMenu
{
    
 public void mainMenuStart()
   {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            int choise = writeMainMenu();
            switch (choise)
            {
                case 1:
                    testInputNumber();
                    break;  
                case 2:
                    testInputText();
                    break;
                case 3:
                    testCustomerExc();
                    
                    break;
                case 4:
                    exit = true;
                    break;
           
    
            }//end switch
                
        }//end while
    }//end start

     private int writeMainMenu()
    {       
            // creates a keyboard object to read input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" (1) Test input of a number");
            System.out.println(" (2) Test input of text");
            System.out.println(" (3) Read customer number ");
            System.out.println(" (4) Stop prg.");
            System.out.print("\n Make your choise: ");
            
            int choise = keyboard.nextInt();
            
            return choise;
    }
    private void testInputNumber()
    {
        long id = UIInPut.inputLong("Type id only numbers");
    }
     private void testInputText()
    {
        String name = UIInPut.inputText("Type name");
    }
    private void testCustomerExc()
    {        
        try{
            testException();
        }
        catch(CustomerNumberException ke)
        {
         System.out.println(ke);
         Scanner keyboard = new Scanner(System.in);
         String wait = keyboard.next();
        }
   
    }
    private void testException() throws CustomerNumberException
    {
        long id = UIInPut.inputLong("Type customer number");
        CustomerNumberException exCustomer = new CustomerNumberException(id);
        if (!exCustomer.customerOK()){
           throw exCustomer;
        }
     }
        
}
