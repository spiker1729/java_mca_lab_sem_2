import java.util.Scanner;
import java.util.*;



public class isEven
{
      static boolean isEven(int number)
	{
            	if(number%2==0)
            {
            System.out.println("even number");
            return true;
            }
            else
            {
            System.out.println("odd number");
            return false;
            
            }
          
            
 }

	

public static void main(String[] args)

	{
Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number");
		int num=sc.nextInt();	
	boolean p=isEven(num);
	System.out.println(""+p);
		
		    
		
	}

}