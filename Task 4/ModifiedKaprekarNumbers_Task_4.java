/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modified.kaprekar.numbers_task_4;

import java.util.*;

public class ModifiedKaprekarNumbers_Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower number : ");
        int p = input.nextInt();
        System.out.println("Enter upper number : ");
        int q = input.nextInt();
        long num, remender, squar, sum;
        for (int i = p; i <= q; i++) {
            num = i;
            squar = (long) Math.pow(num, 2);
            sum = 0;
            while (squar != 0) {
                remender = squar % 10;
                sum = sum + remender;
                squar = squar / 10;

            }
            if (sum == num) {
                System.out.println(i);
            }
        }
    }

}
