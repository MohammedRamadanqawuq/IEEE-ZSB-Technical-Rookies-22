import java.util.Scanner;
public class DrawingBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int f = p / 2, b = (n / 2) - f;
        int result = Math.min(f, b);
        System.out.println(result);
    }
}
