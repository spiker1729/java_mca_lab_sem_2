class UseSLL{
	public static void main(String[] args){
		SLL myList = new SLL();

		myList.insertAtBegin(10);
		myList.insertAtBegin(20);
		myList.insertAtBegin(30);
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
		
	}

}