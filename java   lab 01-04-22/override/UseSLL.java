


class UseSLL{
	public static void main(String[] args){
		SLL myList = new SLL();
		SLL myList2 =new SLL();
		
		


		myList.insertAtBegin(30);
		myList.insertAtBegin(40);
		myList.insertAtBegin(50);

		myList2.insertAtBegin(30);
		myList2.insertAtBegin(40);
		myList2.insertAtBegin(50);

		


			System.out.println();
		System.out.println("Total sum of values in list is "+myList.getSum());
			System.out.println();
		System.out.println("Find max "+myList.findMax());
		System.out.println("Delete at the  begginning"+myList.deleteAtBegin());
			System.out.println();
		System.out.println("Total sum of values in list is "+myList.getSum());
			System.out.println();
		System.out.println("Find max "+myList.findMax());
		System.out.println("Delete at begin "+myList.deleteAtBegin());
			System.out.println();
		System.out.println("Total sum of values in list is "+myList.getSum());
		System.out.println("Find max "+myList.findMax());

		SLL  b=new SLL(myList);
	
		SLL  c=new SLL(myList2);
		
		
		System.out.println(""+b.equals(c));
	


		
	}

}