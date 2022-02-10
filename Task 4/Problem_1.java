import java.util.*;

public class Task_4_p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size = input.nextInt();
        int[] a = new int[size];
        int dis = 0;
        int tempdis = 0;
        System.out.println("Enter your elements : ");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i <= size - 1; i++) {
            for (int j = i + 1; j < size ; j++) {
                if (a[i] == a[j] ) {

                    tempdis = dis;
                    dis = Math.abs(j - i);

                }
            }
        }
        System.out.println(Math.min(dis, tempdis));

    }

}
