import java.util.*;

public class ManyExceptions{
    public void sayHello(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        int c;
        try{
        
          System.out.println("The third argument is "+args[2]);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("fIRST EXCEPTION ");
            System.out.println("Index out of bounds\n");
        }
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        
      try {
         c = a/b;
         System.out.println("The result of the division is "+c+"\n");
      } catch (ArithmeticException e) {
        System.out.println("SECOND EXCEPTION ");
        System.out.println("c= a/b is bypassed ..enter b as non zero\n");
      }  
        
      try {
        sc.close();
        int d = sc.nextInt();
    } catch (Exception e) {
        System.out.println(" THIRD EXCEPTION "+e.getMessage());
        System.err.println("SCANNER CLOSED \n");
       
    } 
        
        try {
            int d = sc.nextInt();
        } catch (IllegalStateException e) {
            System.out.println("FOURTH EXCEPTION ");
            System.err.println("IllegalStateException caught! \n");
           
        }
       
        ManyExceptions me=new ManyExceptions();
        me = null;
        try {
            me.sayHello();
           
        } catch (NullPointerException e) {
            System.out.println("FIFTH NullPointerException caught!  \n");
           
        }
  
        
        
    }
}