import java.util.Scanner;
import java.util.InputMismatchException;
// Eksempel med anvendelse af exception 
// dette er static metoder

public class UIInPut
{   
    //constructor which does nothing
    public UIInPut()
    {
       
    }
    
  
    public static long inputLong(String text)
    {     
        Scanner keyboard = new Scanner(System.in);
        boolean ok = false;
        long id = 0;
        while(!ok)
        {
          try{ 
              System.out.println(text + " ");
               id = keyboard.nextLong();
               ok = true;
            }
          catch (InputMismatchException ie)
          {   System.out.println("It has to be a number");
              String wait = keyboard.nextLine();
            }
          
            //altervatively this can be used, which high level exception class
          catch(Exception e)
          {
              System.out.println("It has to be a number try again ");
              String vent = keyboard.nextLine();
            }
        }//end while    
        return id;
    }
    
    public static String inputText(String text)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean ok = false;
        String name = null;
        while(!ok)
        {
          try{ 
              System.out.println(text + " ");
               name = keyboard.nextLine();
               ok = true;
            }
         
          catch(Exception e)
          {
              System.out.println("Put in some text ");
              String vent = keyboard.nextLine();
            }
        }//end while    
         return name;
    }
   
}