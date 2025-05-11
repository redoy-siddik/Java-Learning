import java.util.*;
public class Area_of_Square {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
        System.out.print(ANSI_CYAN);
        Scanner sc = new Scanner(System.in);
        double height, width;
        System.out.print("Enter the height of the rectangle: ");
        height = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextDouble();
        double area = height * width;
        System.out.println("The area of the square is: " + area + " cm²."); // to do cm² num lock on then alt + type 0178
        sc.close();
    }
}
