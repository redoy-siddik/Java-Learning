import java.util.Scanner;

public class Condition_and_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age <= 0) {
            // System.out.println("Ain't born yet😁"); // To use emoji win+;
            System.out.println("Ain't born yet"); // To use emoji win+;
        } else if (age <= 2) {
            System.out.println("Infant");
        } else if (age <= 5) {
            System.out.println("Toddler");
        } else if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        // Enhanched Switch (Java 14 feature)
        // Replaces many else if statements

        System.out.print("Enter the day of the week: ");
        String day = sc.next();

        switch (day) {
            // case "Monday" -> System.out.println("It's a week day");
            // case "Tuesday" -> System.out.println("It's a week day");
            // case "Wednesday" -> System.out.println("It's a week day");
            // case "Thursday" -> System.out.println("It's a week day");
            // case "Friday" -> System.out.println("It's a week day");
            // case "Saturday" -> System.out.println("It's the weekend");
            // case "Sunday" -> System.out.println("It's the weekend");
            // default -> System.out.println(day + " is not a valid day");

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                    -> System.out.println("It's a week day");
            case "Saturday", "Sunday"
                    -> System.out.println("It's the weekend");
            default 
                    -> System.out.println(day + " is not a valid day");
        }

        // Logical Operators
        // && (and), || (or), ! (not)

        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();
        boolean isSunny = true;

        if(temp <= 30 && temp >=0 && isSunny)
        {
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside!");
        }
        else if(temp <= 30 && temp >=0 && !isSunny)
        {
            System.out.println("The weather is good!");
            System.out.println("It is cloudy outside!");
        }
        else if(temp > 30 || temp <0)
        {
            System.out.println("The weather is bad!");
        }

        sc.nextLine();

        // While Loop

        String name = "";

        while(name.isEmpty())
        {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello " + name);

        sc.close();
    }
}
