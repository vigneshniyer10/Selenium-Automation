package collection;

public class ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]=new int[] {10,20,30,40,50,60,70};
		int b[][]=new int[][] {{1,2},{3,4}};
		Object a[]= new Object[5];
	
		//for(int x:a)
		//{
			//System.out.println(x);
		//}
		for(int x[]:b) 
		{
			for(int z:x)
			{
				System.out.println(z);
			}
						
		}
		for(Object x:a)
		{
			System.out.println(x);
		}
		
	}

}
