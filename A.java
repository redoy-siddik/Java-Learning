import java.util.*;
class A{
	public static void main(String [] a)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter no:");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}