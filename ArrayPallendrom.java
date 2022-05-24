import java.util.Scanner;
public class ArrayPallendrom {
	static int[] read_disp_array(int n )
	{
		Scanner sc = new Scanner(System.in);
		int a [] = new int[n];
		System.out.println("enter the element of the array");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	static int countPallendrom(int b[])
	{
		int count=0;
		for (int i=0;i<b.length;i++) {
			boolean rs = isPallendrom(b[i]);
			if(rs==true)
				count++;
		}
		return count;
	}
	private static boolean isPallendrom(int x) {
		int temp=x,rev=0;
		do {
			int rem = x%10;
			rev = (rev*10)+rem;
			x=x/10;
			
		}while(x!=0);
		
		return temp==rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int c[] =read_disp_array(n);
		System.out.println("array elements");
		for (int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		int result = countPallendrom(c);
		System.out.println("total pallendrom inside the array is :"+" "+result);
		sc.close();
	}
	

}
