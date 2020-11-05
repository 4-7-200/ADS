public class Linear_Search
{
	public static void linear(int a[], int R)
	{
		int size = a.length;
		for (int i=0; i<a.length-1; i++)
		{
			if(a[i]==R)
				{
				System.out.println("Element found index number is in :"+ i);
         		}
         	else
         		{
            	System.out.println("Element not found!!");
				}
		}
	}
	public static void main(String[] args)
	{
		int a[]={1,0,3,5,4,6,8,38,7,4};
		int R= 7;
		linear(a,R);

		
	}


}