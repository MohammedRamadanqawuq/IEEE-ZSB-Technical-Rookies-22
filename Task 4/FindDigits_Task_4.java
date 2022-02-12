/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.digits_task_4;

import java.util.*;

public class FindDigits_Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter Number of test cases : ");
        int T = input.nextInt();
        int Num, n, d, count = 0;
        for (int i = 1; i <= T; i++) {
            Num = input.nextInt();
            n = Num;

            while (n != 0) {
                d = n % 10;
                if (d != 0) {
                    if (Num % d == 0) {
                        count++;
                    }
                }
                n = n / 10;
            }
            System.out.println(count);
            count = 0;
        }
    }

}
