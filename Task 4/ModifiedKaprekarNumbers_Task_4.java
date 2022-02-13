import java.util.Scanner;
public class JavaApplication12 {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int p = scan.nextInt();
    int q = scan.nextInt();
    boolean found = false;
    for(long i = p; i <= q; i++) {
        String sqr = Long.toString(i * i);
        int d = sqr.length() - Long.toString(i).length();
        int r = 0, l = 0;
        if(d >= 0)
            r = Integer.parseInt(sqr.substring(d));
        if(d > 0)
           l = Integer.parseInt(sqr.substring(0, d));
        if(r + l == i) {
            found = true;
            System.out.print(i + " ");
        }   
    }

    if(!found)
        System.out.println("INVALID RANGE");
     }
}
