import java.util.*;
public class Ternary_Operator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int score = 75;

        // String result = (score >= 56)? "Pass" : "Fail";

        // System.out.println("Result: " + result);

        System.out.println("Result: " + ((score >= 56)? "Pass" : "Fail"));

        int num = 11;

        System.out.println("The number is " + ((num%2==0)? "even" : "odd") + ".");

        int income = 66000;

        System.out.println("Your tax rate is " + ((income >= 40000)? 0.25 : 0.15) + ".");

        sc.close();
    }
}
