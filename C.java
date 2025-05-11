import java.util.*;
class C{
	public static void main(String [] a)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.print("Enter name:");
		name = sc.next();
		System.out.print("Enter age:");
		age = sc.nextInt();
		if(age>0 && age<=10)
		{
			System.out.println(name + ", you are little.");
		}
		else if(age>10 && age<=19)
		{
			System.out.println(name + ", you are teen.");
		}
		else if(age>19 && age<=30)
		{
			System.out.println(name + ", you are grown.");
		}
		else if(age>30 && age<=50)
		{
			System.out.println(name + ", you are adult.");
		}
		else if(age>50 && age<=80)
		{
			System.out.println(name + ", you are blown.");
		}
		else
		{
			System.out.println(name + ", sorry.");
		}
		sc.close();
	}
}