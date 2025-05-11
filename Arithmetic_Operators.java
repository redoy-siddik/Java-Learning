import java.util.*;
class Arithmetic_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter number b: ");
        double b = sc.nextDouble();
        System.out.print("Enter arithmetic operators (+,-,*,/,%): ");
        char ch = sc.next().charAt(0);

        double res = a;

        if(ch == '+'){
            res += b;
            System.out.println("a " + ch+ " b = " + res);
            //System.out.println("a " + ch+ " b = " + (a + b));
        }
        else if(ch == '-'){
            res -= b;
            System.out.println("a " + ch + " b = " + res);
            // System.out.println("a " + ch + " b = " + (a - b));
        }
        else if(ch == '*'){
            res *= b;
            System.out.println("a " + ch + " b = " + res);
            // System.out.println("a " + ch + " b = " + (a * b));
        }
        else if(ch == '/'){
            res /= b;
            System.out.println("a " + ch + " b = " + res);
            // System.out.println("a " + ch + " b = " + (a / b));
        }
        else if(ch == '%'){
            res %= b;
            System.out.println("a " + ch + " b = " + res);
            // System.out.println("a " + ch + " b = " + (a % b));
        }
        else{
            System.out.println("Invalid operator!");
        }

        // Order of operations P E M D A S
        // Parentheses, Exponents, Multiplication and Division (left to right), Addition and Subtraction (left to right)
        res = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("3 + 4 * (7 - 5) / 2.0 = " + res);

        sc.close();
    }
}