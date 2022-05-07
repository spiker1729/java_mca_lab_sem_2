public class ByIncrement implements Series
{
	private int increment;// new
	private int start;
	private int val;

	public ByIncrement(){ //class name
	start = 0;
	val = 0;
	increment = 1;
	}

	public int getNext(){
	val +=increment;
	return val;
	}

	public void reset(){
	val = start;
	increment = 1;
	}

	public void setStart(int x){
	start = x;
	val = x;
	}
	public void setIncrement(int i){
	reset();	
	increment = i;		
	}
    
}
