/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate.feast._task_4;

import java.util.*;

public class ChocolateFeast_Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of test cases : ");
        int T = input.nextInt();
        int mony, N, totalChoco, price, wrappers, rest;
        for (int i = 1; i <= T; i++) {
            mony = (int) input.nextLong();
            price = (int) input.nextLong();
            wrappers = (int) input.nextLong();
            int count = mony / price;
            rest = count;
            while (rest >= wrappers) {
                int bouns = rest / wrappers;
                count += bouns;
                rest = bouns + rest % wrappers;
            }
            System.out.println(count);
        }

    }

}
