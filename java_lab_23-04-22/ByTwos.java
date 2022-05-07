/**
 * Write a description of class ByTwos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ByTwos implements Series
{
    private int start;
    private int val;
    
    public ByTwos(){
        start = 0;
        val = 0;
    }
    
    public int getNext(){
        val +=2;
        return val;
    }
    
    public void reset(){
        val = start;
    }
    
    public void setStart(int x){
        start = x;
        val = x;
    }
    
}