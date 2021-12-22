import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter your name : ");
        String name = input.next();
        String x = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            x += name.charAt(i);
        }
        if (name.equals(x)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        //  System.out.println("The Reverse of "+name+" "+x);
    }

}
