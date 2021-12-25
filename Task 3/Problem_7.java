import java.util.*;

public class MigratoryBirds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                t1++;
            }
            if (arr[i] == 2) {
                t2++;
            }
            if (arr[i] == 3) {
                t3++;
            }
            if (arr[i] == 4) {
                t4++;
            }
            if (arr[i] == 5) {
                t5++;
            }
            if (arr[i] == 6) {
                t6++;
            }
            if (arr[i] == 7) {
                t7++;
            }
            if (arr[i] == 8) {
                t8++;
            }
            if (arr[i] == 9) {
                t8++;
            }

        }
        if (t1 >= t2 && t1 >= t3 && t1 >= t4 && t1 >= t5 && t1 >= t6 && t1 >= t7 && t1 >= t8 && t1 >= t9) {
            System.out.println(1);
        } else if (t2 >= t1 && t2 >= t3 && t2 >= t4 && t2 >= t5 && t2 >= t6 && t2 >= t7 && t2 >= t8 & t2 >= t9) {
            System.out.println(2);
        } else if (t3 >= t1 && t3 >= t2 && t3 >= t4 && t3 >= t5 && t3 >= t6 && t3 >= t7 && t3 >= t8 && t3 >= t9) {
            System.out.println(3);
        } else if (t4 >= t1 && t4 >= t2 && t4 >= t3 && t4 >= t5 && t4 >= t6 && t4 >= t7 && t4 >= t8 && t4 >= t9) {
            System.out.println(4);
        } else if (t5 >= t1 && t5 >= t2 && t5 >= t3 && t5 >= t4 && t5 >= t6 && t5 >= t7 && t5 >= t8 && t5 >= t9) {
            System.out.println(5);
        } else if (t6 >= t1 && t6 >= t2 && t6 >= t3 && t6 >= t4 && t6 >= t5 && t6 >= t7 && t6 >= t8 && t6 >= t9) {
            System.out.println(6);
        } else if (t7 >= t1 && t7 >= t2 && t7 >= t3 & t7 >= t4 && t7 >= t5 && t7 >= t6 && t7 >= t8 && t7 >= t9) {
            System.out.println(7);
        } else if (t8 >= t1 && t8 >= t2 && t8 >= t3 && t8 >= t4 && t8 >= t5 && t8 >= t6 && t8 >= t7 && t8 >= t9) {
            System.out.println(8);
        } else if (t9 >= t1 && t9 >= t2 && t9 >= t3 && t9 >= t4 && t9 >= t5 && t9 >= t6 && t9 >= t7 && t9 >= t8) {
            System.out.println(9);
        }

    }

}
