import java.util.Scanner;
public class ArmStrongNumber {
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
		
	static boolean isArmstrong(int num )
	{
//		int count=0;
//		do
//		{
//			count++;
//			n=n/10;
//		}while(n!=0);
		int c = count_digit(num);
		int temp = num,sum=0;
		do {
			int rem = num%10;
			sum = sum+pow(rem,c);
			num=num/10;	
		}while(num!=0);
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
		boolean rs = isArmstrong(n);
		if (rs==true)
			System.out.println("entered number is Armstrong number"+" "+n);
		else 
			System.out.println("entered number is not Armstrong number"+" "+n);
		
		sc.close();
	}

}
