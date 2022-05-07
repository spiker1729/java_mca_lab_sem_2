class Node{
private int val;
private Node next;

//Constructors
public Node(int v){
	val = v;
	next = null;
}

public Node(int v, Node n){
	val = v;
	next = n;
}

public void setNext(Node n){
	
	this.next = n;
	
}
public Node getNext(){
	
	return this.next;
	
}

public int getVal(){
	return val;
}

public int sum(){
	if (next == null)
		return val;
	else
	return val+next.sum();
}
@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(!super.equals(obj))
		return false;
		System.out.println("this object class name is"+this.getClass());
		System.out.println("this object class name is"+obj.getClass());

		if(obj==null||this.getClass()!=obj.getClass())
		{
			
			return false;
		}
		Node other = (Node)obj;

		
		if(this.val==other.val)
		return true;
	
		
		
		return true;
	
	}



}