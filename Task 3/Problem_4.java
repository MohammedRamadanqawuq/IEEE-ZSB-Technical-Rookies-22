
import java.util.*;

public class NumberLineJumps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p1 = input.nextInt();
        int v1 = input.nextInt();
        int p2 = input.nextInt();
        int v2 = input.nextInt();
        int sum1 = p1, sum2 = p2;
        boolean p = false;
        for (int i = 0; i <= 10000; i++) {
            sum1 = sum1 + v1;
            sum2 = sum2 + v2;
            if (sum1 == sum2) {
                p = true;
                break;
            }

        }
        if (p == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
