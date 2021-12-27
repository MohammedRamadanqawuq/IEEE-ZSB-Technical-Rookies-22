package counting.valleys;

import java.util.Scanner;

public class CountingValleys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int L = input.nextInt();

        String path = input.next();
        System.out.println(CountValleys(L, path));

    }

    public static int CountValleys(int L, String path) {
        int valleys = 0, sum = 5, N = 0;
        char[] a = path.toCharArray();
        for (char c : a) {
            if (c == 'U') {
                N = 1;
            } else if (c == 'D') {
                N = -1;
            }
            sum = sum + N;
            if (sum == 5 && c == 'U') {
                valleys++;
            }
        }
        return valleys;
    }

}
