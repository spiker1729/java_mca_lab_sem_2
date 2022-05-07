import java.util.Scanner;
import java.util.*;


public class mean
{
 
    
    static  float getMean(int[] numbers)
    {
int sum=0;
 for(int i=0;i<5;i++)
            {
            sum=sum+numbers[i];
         
    }
    
     float res=sum/5;
     return(res);
    
 
    }
    public static void main(String[] args)
    {
       
       
        
        int arr[]={1,2,3,4,5};

        
 
      float ans= getMean(arr);
       System.out.println("The mean is ="+ans);  
 
      
 
        
        
    }
}