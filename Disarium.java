import java.util.Scanner;
public class Disarium {
	static int count_digit(int no)
	{
		int count=0;
		do
		{
			count++;
			no=no/10;
		}while(no!=0);
		return count;
	}
		
	
	static boolean isDisarium(int n )
	{
		int c = count_digit(n);
		int temp = n,sum=0;
		do {
			int rem = n%10;
			sum = sum+pow(rem,c);
			c--;
			n=n/10;	
		}while(n!=0);
		return temp==sum;
	}
	static int pow(int r,int c)
	{
		int prod =1;
		for (int i =1;i<=c;i++)
		{
			prod =prod*r;
		}
		return prod;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		boolean rs = isDisarium(n);
		if (rs==true)
			System.out.println("entered number is Disarium number"+" "+n);
		else 
			System.out.println("entered number is not Disarium number"+" "+n);
		sc.close();
	
	

}
}