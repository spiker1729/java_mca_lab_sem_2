public class UseMyComparable {

   
    
public static void main(String[] args){

    Card c1=new Card(0, 8);
    Card c2=new Card(3, 10);
    Card c3=new Card(1, 5);
    Card c4=new Card(3, 3);
    Card c5=new Card(3, 2);
 
    MyComparable[] list=new MyComparable[] { c1, c2, c3, c4, c5};
    System.out.println("before sorting the values are =");
    for(int i=0;i<list.length;i++)
    {
        Card card =(Card)list[i];
        System.out.println("the suit number is ="+card.suit()+"the card number is"+card.rank());
    }
    System.out.println("after  the sorting result is =");
    System.out.println();
    MyComparable[] sorting=sortObjects(list);

    System.out.println();

    for(int i=0;i<list.length;i++)
    {

        Card card = (Card) sorting[i];
        System.out.println("the suit  no is "+card.suit() + " the card number is " + card.rank());
        
    }


}
    

public static MyComparable[] sortObjects(MyComparable[] list)
{
    int compareto;
    int numberOfElements=list.length;
    
    
  for(int i=1;i<numberOfElements;i++)  

  {
    MyComparable next=list[i];
    int previous=i-1;
  

    while(true)
    {
        compareto=list[previous].compareTo(next);        
        if(compareto<-1)
        {
            return null;
        }

        if(previous>0&&compareto==1)
        {
            list[previous+1]=list[previous];
           previous=previous-1;

        }
        else
        {
            break;

        }
        
     list[previous+1]=next;

  }
    
}

return list;

}



}






