class stack{
	// INSTANCE VARIABLES
	private int maxSize;
	private char[] sArr;
	private int topPtr;
	private boolean isFull;
	boolean isEmpty;
	
	// Constructors.
	public stack(int n){        // n = Max Size of the stack.
		this.maxSize = n;
		this.sArr = new char[n];
		this.topPtr = 0;
		this.isEmpty = true;
		this.isFull = false;
	}
	
	// Methods.
	public void push(char c){
		
                if(this.isFull)
                throw new OverFlowException(sArr.length);
           
          
           /* OverFlowException S=new OverFlowException();
            S.OverFlowException(sArr.length);*/
			System.out.println("STACK OVERFLOW, the character "+c+" cannot be pushed in the stack.");
			return;
		
		this.isEmpty = false;
		this.sArr[this.topPtr] = c;
		this.topPtr++;
		if(this.topPtr >= this.maxSize){
			this.isFull = true;
		}
	}
	
	public void printStack(){
		for(int i = 0; i < this.topPtr; i++){
			System.out.print(sArr[i]+" ");
		}
		System.out.println("");
	}
	
	public char pop(){
		char c = '\0';
		{
           
                if(this.isEmpty)
                throw new UnderFlowException(sArr.length);
           
           
       /*     UnderFlowException S=new UnderFlowException();
         S.UnderFlowException(sArr.length);*/
			
			return c;
		}
		this.isFull = false;
		this.topPtr--;
		c = this.sArr[this.topPtr];
		if(this.topPtr == 0){
			this.isEmpty = true;
		}
		return c;
	}
}