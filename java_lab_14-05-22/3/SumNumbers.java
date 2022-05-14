
import java.io.*;

public class SumNumbers{
    public static void main(String args[]) throws IOException{
         int arr[]=new int[10],sum=0;
          System.out.println("Enter the numbers");
    try {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    for(int j=0;j<10;j++){
           arr[j] = Integer.parseInt(br.readLine());
          
    }
        System.out.println("the entered numbers are =");
       for(int j=0;j<10;j++){
           System.out.println(""+arr[j]);
          sum+=arr[j];
    }
     System.out.println("the sum is =");
     System.out.println(""+sum);
    
  
} catch(IOException e) {
    e.printStackTrace();
}
    }
}
 
