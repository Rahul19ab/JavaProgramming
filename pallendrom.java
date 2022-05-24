import java.util.Scanner;
public class pallendrom {
	static void isPallendrome(int n)
	{
		int temp = n, rev=0;
		do {
			int rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
			}while(n!=0);
		if (temp==rev)
			System.out.println("number is pallendrom"+" "+temp);
		else
			System.out.println("number is not pallendrom");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isPallendrome(n);
		

		sc.close();
	}

}
