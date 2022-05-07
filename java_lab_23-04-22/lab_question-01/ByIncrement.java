class ByIncrement implements Series {

    private int start;
    private int val;
public ByIncrement()
{
    start=0;
    val=0;
}
@Override
public int getNext(int x) {

val+=x;

    return val-x;
}

@Override
public void reset() {
    
    val = start;
    
}

@Override
public void setStart(int x) {
  
    start = x;
    val = x;
}



    
}
