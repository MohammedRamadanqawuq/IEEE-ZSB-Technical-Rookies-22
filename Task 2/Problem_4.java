import java.util.*;

public class FindAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = input.nextInt();
        }
        int i, j, diff;
        int temp = n;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n - 1; j++) {
                if (arr[i] == arr[j]) {
                    diff = Math.abs(i - j);
                    if (diff < temp) {
                        temp = diff;
                    }
                }

            }

        }
        System.out.println(temp);
    }

}
