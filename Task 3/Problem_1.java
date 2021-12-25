import java.util.Scanner;

public class VolumAndCapacity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int volum = 0, capacity = 0;
        int temp;
        int arr[][] = new int[n][2];
        int len = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            volum = volum + arr[i][0];
        }
        for (int i = len; i > len - 2; i--) {
            capacity = capacity + arr[i][1];
        }
        if (volum > capacity) {
            System.out.println("No");
        } else if (volum <= capacity) {
            System.out.println("Yes");
        }

    }
}
