/**
 * Write a description of class ByThrees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ByThrees implements Series
{
    private int start;
    private int val;
    
    public ByThrees(){
        start =;
        val = 0;
    }
    
    public int getNext(int x){
        val +=3;
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