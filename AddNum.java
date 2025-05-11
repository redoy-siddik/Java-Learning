import java.util.*;
class AddNum{
	public static void main(String [] a)
	{
		int x,y,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x:");
		x = sc.nextInt();
		System.out.print("Enter y:");
		y = sc.nextInt();
		sum = x + y;
		System.out.println("The sum of " + x + " and " + y + " = " + sum);
		sc.close();
	}
}
