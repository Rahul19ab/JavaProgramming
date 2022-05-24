import java.util.Scanner;
public class SortingArray {

	static int[] Sort(int a[])
	{
		for (int i=0;i<a.length;i++)
		{ 
			for (int j=i+1;j<a.length;j++)
			{
				int temp =0;
 				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		for (int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]+" ");}
		return a;
	}
	
	static int [] Read_disp_Array(int n)
	{
		Scanner sc = new Scanner(System.in);
		int b[]=new int[n];
		System.out.println("enter the elements of array");
		for (int i=0;i<b.length;i++)
		{
			b[i] =sc.nextInt();
			
		}
		return b;
	}
	
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c[]=Read_disp_Array(n);
		int d[]=Sort(c);
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]+" ");
		}
		sc.close();
	
	}
}


