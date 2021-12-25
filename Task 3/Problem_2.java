import java.util.*;

public class BetweenTwoSets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = in.nextInt();
        }

        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            boolean ok = true;
            for (int j = 0; j < n && ok; j++) {
                if (i % A[j] != 0) {
                    ok = false;
                }
            }
            for (int j = 0; j < m && ok; j++) {
                if (B[j] % i != 0) {
                    ok = false;
                }
            }
            if (ok) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
