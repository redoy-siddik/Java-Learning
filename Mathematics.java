import java.util.*;
public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double res = Math.pow(2,3);
        System.out.println("2^3 = " + res);

        double absolute = Math.abs(-19);
        System.out.println("Absolute of -19 = " + absolute);

        double squareRoot = Math.sqrt(16);
        System.out.println("Square root of 16 = " + squareRoot);

        double cubeRoot = Math.cbrt(27);
        System.out.println("Cube root of 27 = " + cubeRoot);

        double round_to_nearest = Math.round(3.1516);
        System.out.println("Round to nearest = " + round_to_nearest);

        double round_up = Math.ceil(3.1516);
        System.out.println("Round up = " + round_up);

        double round_down = Math.floor(3.1516);
        System.out.println("Round down = " + round_down);

        double maximum = Math.max(12.3, 32.5);
        System.out.println("Maximum of 12.3 and 32.5 = " + maximum);

        // hypotenuse
        double a,b,c;
        System.out.print("Enter side a: ");
        a = sc.nextDouble();
        System.out.print("Enter side b: ");
        b = sc.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("Hypotenuse = %.2f cm.", c);

        sc.close();
    }
}
