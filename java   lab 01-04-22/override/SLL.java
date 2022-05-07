

class SLL{
	private Node head;

	//Constructors
	public SLL(){
		head = null;
	}
	
	public SLL(SLL s)
	{
		while (s.head != null)
		{
			this.head = new Node(s.head.getVal());
			s.head=s.head.getNext();
		}
	}
	

	
	//Methods
	public void insertAtBegin(int v){
		Node s = new Node(v);
		if (head == null){
			head = s;
		}
		else{
			
			s.setNext(head);
			head = s;
		}
		System.out.println("Inserted "+this.head.getVal()+" at begin");
		System.out.println();
	}

	public int deleteAtBegin()
	{
		int val = this.head.getVal();
		head = head.getNext();
		return val;
	}

	public int findMax(){
		if (head == null){
			return -1;
		}
		return findMaxHelper(this.head, -99999);
	}

	private int findMaxHelper(Node n, int max)
	{
		if (n == null)
		{
			return max;
		}		
		else if (n.getVal() > max)
		{
			return findMaxHelper(n.getNext(), n.getVal());
		}
			
		else
			return findMaxHelper(n.getNext(), max);
	}
	

	public int getSum(){
		return head.sum();
	}


	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		
	System.out.println("this object class name is"+this.getClass());
	System.out.println("this object class name is"+obj.getClass());
System.out.println();

		if(obj==null||this.getClass()!=obj.getClass())
		{
			
			return false;
		}
		SLL other = (SLL)obj;
		Node lista=this.head;
		Node listb=other.head;
		
		while(lista!=null&&listb!=null)
		{
			if(lista.getVal()!=listb.getVal())
			{
				return false;
			}

			lista=lista.getNext();
			listb=listb.getNext();
		}

		if(lista!=null||listb!=null)
		{
			return false;

		}
		
		System.out.println("the two lists are equal :=");

		
		return true;
	
	}


}



		


