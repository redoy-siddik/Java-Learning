import java.util.*;
public class Random_Numbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt();
        System.out.println("Random Number: " + number);

        int rand_number = rand.nextInt(15, 35);
        // 15 to 34, first number is inclusive, second is exclusive
        System.out.println("Random Number between 15 to 35: " + rand_number);

        boolean coin = rand.nextBoolean();
        if(coin)
        {
            System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }
        
        sc.close();
    }
}
