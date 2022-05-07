
/**
 * Write a description of class UseSeries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UseSeries
{
    public static void printSeries(Series a, int howmany){
        for (int i=0;i<howmany;i++){
            System.out.println("Next number in Series: "+a.getNext());
        }
    }
    
    public static void main(String[] args){
        ByIncrement by_inc = new ByIncrement();
        Series s1 = by_inc;
        System.out.println("\n\nCreating series with inc 2: ");
        s1.setStart(30);
	by_inc.setIncrement(2);
        printSeries(s1,10);
	s1.reset();
	
	System.out.println("\n\nCreating series with inc 5: ");
        s1.setStart(10);
	by_inc.setIncrement(5);
        printSeries(s1,10);
	s1.reset();

	System.out.println("\n\nCreating series with inc 3: ");
        s1.setStart(20);
	by_inc.setIncrement(3);
        printSeries(s1,10);
	s1.reset();

        //printSeries(bth, 20);
    }
}
