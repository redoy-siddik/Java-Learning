import java.util.*;

public class Variables {
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        System.out.print(ANSI_CYAN);
        Scanner sc = new Scanner(System.in);
        int n = 5;
        double d = 40.79;
        char c = 'Z';
        String s = "Hello World";
        boolean flag = true;
        System.out.println(n);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
        System.out.println(flag);

        String fav = "I like chocolate";
        String str = "It's my all time favorite";
        String temp = "Can't believe it's ";
        String temp2 = " degree celsius.";
        System.out.println(fav + ". " + str + "!");
        System.out.println(temp + d + temp2);

        String name = "Bro Code";
        int length = name.length();
        char latter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

        System.out.println("Length of string: " + length);
        System.out.println("First latter: " + latter);
        System.out.println("Index of 'o': " + index);
        System.out.println("Last index of 'o': " + lastIndex);

        // name = name.toUpperCase();
        // System.out.println(name);
        // name = name.trim();
        // System.out.println(name);

        name = name.replace("o", "a");
        System.out.println(name);

        name = name.replace("a", "o");
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Bro"));

        System.out.println(name.equals("Hey Bro Code"));
        System.out.println(name.equals("Code"));
        System.out.println(name.equals("Bro Code"));
        System.out.println(name.equalsIgnoreCase("BRO CODE"));

        // Substring Method

        String email = "Bro123@gmail.com";
        String userName = email.substring(0, 6);
        String domain = email.substring(7);
        System.out.println("User name of user 1: " + userName);
        System.out.println("Domain of user 1: " + domain);

        System.out.print("Enter user 2 email: ");
        String email_2 = sc.nextLine();
        int at = email_2.indexOf('@');
        int dot = email_2.indexOf('.');
        if (email_2.isEmpty()) {
            System.out.println("Email is empty");
        }
        else if (at == -1 || at == 0 || at == email_2.length() - 1 || dot == -1 || dot == 0
                || dot == email_2.length() - 1) {
            System.out.println("Email is invalid");
        }
        else {
            userName = email_2.substring(0, email_2.indexOf('@'));
            domain = email_2.substring(email_2.indexOf("@") + 1);
            System.out.println("User name of user 2: " + userName);
            System.out.println("Domain of user 2: " + domain);
        }

        // Reference data types: arrays, objects, strings
        // arrays
        String[] fruits = { "Apple", "Banana", "Mango", "Jackfruit" };
        System.out.println("Fruit array: "+fruits); // prints the reference of the array object
                                                    // does not print the elements
        System.out.println("Only one fruit: "+fruits[2]);

        System.out.println("Number of fruits: " + fruits.length);

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
            // for (int i = 0; i < fruit.length(); i++) {
            // System.out.print(fruit.charAt(i) + " ");
            // }
            // System.out.println();
        }
        System.out.println();

        Arrays.sort(fruits);

        System.out.println("fruits: " + Arrays.toString(fruits));

        Arrays.fill(fruits, "Cherry");
        System.out.println("fruits: " + Arrays.toString(fruits));

        System.out.print("Enter number of foods do you want: ");
        int num = sc.nextInt();
        sc.nextLine(); // consume the newline character

        String[] foods = new String[num];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food : ");
            foods[i] = sc.nextLine();
        }

        System.out.print("Enter target food: ");
        String target = sc.nextLine();

        boolean isFound = false;
        int i;

        for ( i=0; i < foods.length; i++) {
            if(foods[i].equals(target)){
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Found " + target + " at index " + i);
        }
        else {
            System.out.println(target + " not found");
            
        }

        // 2D array

        // String[] fruits_2 = { "Apple", "Banana", "Mango", "Jackfruit" }; // 1D array
        // String[] vegetables = { "Carrot", "Potato", "Tomato", "Onion" }; // 1D array
        // String[] meats = { "Chicken", "Beef", "mutton", "Fish" }; // 1D array

        // String[][] groceries = { fruits_2, vegetables, meats }; // 2D array

        String[][] groceries = { { "Apple", "Banana", "Mango", "Jackfruit" },
                                 { "Carrot", "Potato", "Tomato", "Onion" },
                                  { "Chicken", "Beef", "mutton", "Fish" } };

        groceries[0][0] = "Change kore disi";

        // System.out.println("Groceries: " + groceries[0][0]);
        System.out.println("Groceries: ");
        for(String[] food:groceries){
            // System.out.println(food); // prints the reference of the array object
            // System.out.println(Arrays.toString(food));
            for(String item:food){
                System.out.print(item + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}