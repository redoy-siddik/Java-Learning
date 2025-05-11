import java.util.*;
public class User_Input {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
        System.out.print(ANSI_CYAN);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next(); // only reads the first word
        System.out.println("Your name is "+name+".");

        sc.nextLine(); // consume the newline character left by next()
        
        System.out.print("Tell us more about yourself: ");
        String str = sc.nextLine(); // reads the entire line with spaces
        System.out.println(str);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is "+age+".");

        System.out.print("Enter your CG: ");
        double cg = sc.nextDouble();
        System.out.println("Your CG is "+cg+" which is ok.");

        System.out.print("Are you stupid? (true/false): ");
        boolean flag = sc.nextBoolean();
        if(!flag){
            System.out.println("You are stupid.");
        } else {
            System.out.println("You are not stupid.");
        }
        sc.close();
    }
}
