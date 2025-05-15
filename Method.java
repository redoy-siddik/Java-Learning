import java.util.*;
public class Method {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(ANSI_CYAN);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter how many times you want to wish: ");
        int num = sc.nextInt();

        System.out.print(ANSI_RED);
        System.out.println();

        for(int i = 0; i < num; i++) {
            happyBirthday(name, age);
        }

        sc.close();
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + name + "!");
        System.out.println("You are " + age + " years old!");
        System.out.println("Happy Birthday to you!\n");
    }
}
