import java.util.Scanner;
 
public class matrixmul
{
   public static void main(String args[])
   {
      int n1, n2, n3, n4, sum = 0;
 
      Scanner integer = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix");
      n1 = integer.nextInt();
      n2 = integer.nextInt();
 
      int first[][] = new int[n1][n2];
 
      System.out.println("Enter elements of first matrix");
 
      for (int i = 0; i < n1; i++)
         for (int j = 0; j < n2; j++)
            first[i][j] = integer.nextInt();
 
      System.out.println("Enter the number of rows and columns of second matrix");
      n3 = integer.nextInt();
      n4 = integer.nextInt();
 
      if (n2 != n3)
         System.out.println("The matrices can't be multiplied with each other.");
      else
      {
         int second[][] = new int[n3][n4];
         int multiply[][] = new int[n1][n4];
 
         System.out.println("Enter elements of second matrix");
 
         for (int i = 0; i< n2; i++)
            for (int j = 0; j < n3; j++)
               second[i][j] = integer.nextInt();
 
         for (int i = 0; i < n1; i++)
         {
            for (int j = 0; j < n4; j++)
            {  
               for (int k = 0; k < n2; k++)
               {
                  sum = sum + first[i][k]*second[k][j];
               }
 
               multiply[i][j] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of the matrices:");
 
         for (int i = 0; i < n1; i++)
         {
            for (int j = 0; j < n4; j++)
               System.out.print(multiply[i][j]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}