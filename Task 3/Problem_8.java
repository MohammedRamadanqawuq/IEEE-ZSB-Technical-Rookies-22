package sales.by.match;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Halawany
 */
public class SalesByMatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A = input.nextInt();

        int[] arr = new int[A];
        for (int j = 0; j < A; j++) {
            arr[j] = input.nextInt();
        }
        System.out.println(SockMerchant(A, arr));
    }

    public static int SockMerchant(int l, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < l; i++) {
            int ele = arr[i];
            if (set.contains(ele)) {
                set.remove(ele);
                count++;
            } else {
                set.add(ele);
            }
        }
        return count;
    }

}
