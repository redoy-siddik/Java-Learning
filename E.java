import java.util.*;
class E{
	public static void main(String [] a)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter no: ");
		n = sc.nextInt();
		if(n==2)
		{
			System.out.println(n+" is prime");
		}
		else if(n<=1||((n>2)&&(n%2==0)))
		{
			System.out.println(n+" is not prime");
		}
		else
		{
			boolean isPrime = true;
			for(int i=3;i*i<=n;i+=2)
			{
				if(n%i==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(n+" is prime");
			}
			else
			{
				System.out.println(n+" is not prime");
			}
		}
		sc.close();
	}
}