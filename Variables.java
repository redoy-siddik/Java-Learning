public class Variables {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String [] args){
        System.out.print(ANSI_CYAN);
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
    }
}
