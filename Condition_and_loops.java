import java.util.Scanner;
public class Condition_and_loops {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <=0)
        {
            System.out.println("Ain't born yet😁"); //To use emoji win+;
        }
        else if(age <= 2)
        {
            System.out.println("Infant");
        }
        else if(age <= 5)
        {
            System.out.println("Toddler");
        }
        else if(age <= 12)
        {
            System.out.println("Child");
        }
        else if(age <= 19)
        {
            System.out.println("Teenager");
        }
        else if(age <= 59)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Senior");
        }
        sc.close();
    }
}
