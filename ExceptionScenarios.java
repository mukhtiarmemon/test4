public class ExceptionScenarios{  
    
      
    public ExceptionScenarios(){
    
    }
    
    public void testArithmaticException(int x, int y){
        
      int data=x/y;    //may throw exception  
      System.out.println("result =" + data); 
    
    }
    
     public void testArrayOutOfBoundsException(int index, int value){
        
         int arr[] = new int[5];
         arr[index] = value;    //may throw exception  
        
         System.out.println("result =" + arr[index]); 
    
    } 
    
    public void testNullPointerException(String str){ 
      
        //enter null not ""
         System.out.println("result =" + str.length());  //may throw exception  
    
    } 
    
    public void testNumberFormatException(String number){     
       
        int i=Integer.parseInt(number);		//NumberFormatException  
        System.out.println("result =" + i);
    
    } 

} 