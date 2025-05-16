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

        System.out.println(add(5.6, 8.4));
        System.out.println(add(5.6, 8.4, 9.89));

        String pizza = bakePizza("Flat bread");
        System.out.println(pizza);

        sc.close();
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + name + "!");
        System.out.println("You are " + age + " years old!");
        System.out.println("Happy Birthday to you!\n");
    }

    //  Method overload = Method that shares the same name,
    //                    but different perameters
    //                    signature = name + parameter
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }

    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }

}
