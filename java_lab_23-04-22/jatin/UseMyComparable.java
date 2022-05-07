public class UseMyComparable{
	public static MyComparable[] sortObjects(MyComparable[] list)
	{
		int cmp;
		int n = list.length;
		//Loop over the elements
		for (int i = 1; i < n; i++)
		{
			MyComparable k = list[i];
			int j = i - 1;
			while (true)
			{
				//System.out.println(j);
				cmp = list[j].compareTo(k);
				if (cmp < -1)
					return null;
				if (j>=0 && cmp == 1)
				{
					list[j+1] = list[j];
					j = j - 1;
				}
				else{
					break;				
				}
			}
			list[j+1] = k;
		}
		return list;
	}
	public static void main(String[] args)
	{
		Card a0 = new Card(0, 1);		
		Card a1 = new Card(1, 8);
		Card a2 = new Card(2, 5);
		Card a3 = new Card(3, 1);
		Card a4 = new Card(0, 12);
		Card a5 = new Card(0, 13);
		Card a6 = new Card(1, 9);
		Card a7 = new Card(3, 6);
		Card a8 = new Card(0, 10);
		Card a9 = new Card(2, 11);
		
		MyComparable[] list = new MyComparable[] {a0, a1, a2, 
							a3, a4, a5,
							a6, a7, a8, a9};
		MyComparable[] sorted = sortObjects(list);
		for (int i = 0; i < sorted.length; i++)
		{
			System.out.println(sorted[i]);
		}
		
	}
}