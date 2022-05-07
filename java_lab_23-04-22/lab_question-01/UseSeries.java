import java.util.Scanner;

/**
 * Write a description of class UseSeries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UseSeries
{
    public static void printSeries(Series a, int howmany,int increment,int StartingValue){

       System.out.println("The starting value is equal to ="+StartingValue);
        
       System.out.println();
       System.out.println("The required series is :-");

       System.out.println();

        for (int i=0;i<howmany;i++){
            System.out.println("Next number in Series: "+a.getNext(increment));
        }
    }
    
    public static void main(String[] args){

        int howmany;
        System.out.println("enter how many number you want to print");
        Scanner sc=new Scanner(System.in);
        howmany=sc.nextInt();
        System.out.println("Enter the value that you want the series  to be incremented by");
        int increment=sc.nextInt();
          System.out.println("Enter the starting value of series");
        int StartingValue=sc.nextInt();
        //ByTwos bt = new ByTwos();
        //ByThrees bth = new ByThrees();
        ByIncrement bthh=new ByIncrement();
         // Series s1 = bt;
        //Series s2=bthh;
        bthh.setStart(StartingValue);
        bthh.getNext(increment);
        //  printSeries(bt,howmany);
         // printSeries(bth, howmany);
       printSeries(bthh, howmany,increment,StartingValue);



    }
}