public class UseStack{
	public static void main(String[] args){
		StackSLL mystack = new StackSLL();
		System.out.println("Pushing elements from one to five: ");
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
		System.out.println();
		
		System.out.print("Printing Elements: ");
       	mystack.print();
			System.out.println();
        	System.out.println("Pop from stack: " + mystack.pop());
        	System.out.println("Pop from stack: " + mystack.pop());
        	System.out.println("Pop from stack: " + mystack.pop());
		System.out.print("Printing Elements: ");
			System.out.println();
		mystack.print();
	}
}