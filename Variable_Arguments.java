import java.util.*;
public class Variable_Arguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // varargs allows a method to accept a variable number of arguments
        // Doesn't need overloaded methods

        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


        System.out.println(average(1, 2.5, 3.5, 4));
        System.out.println(average(1, 2, 3.7, 4, 5, 6, 7.8));
        System.out.println(average(1, 2.2, 3, 4.9, 5, 6, 7.2, 8, 9.1, 10));



        sc.close();
    }
    static int add(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
