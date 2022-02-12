/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.fine_task_4;

import java.util.*;

public class LibraryFine_Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fine;
        System.out.println(" Returned date day, month and year ");
        int D1 = input.nextInt();
        int M1 = input.nextInt();
        int Y1 = input.nextInt();
        System.out.println(" Due date day, month and year ");
        int D2 = input.nextInt();
        int M2 = input.nextInt();
        int Y2 = input.nextInt();
        if (D1 > D2 && M1 == M2 && Y1 == Y2) {
            fine = Math.abs(D1 - D2) * 15;
        } else if (D1 > D2 && M1 > M2 && Y1 == Y2) {
            fine = Math.abs(M1 - M2) * 500;
        } else if (Y1 > Y2) {
            fine = 10000;
        } else {
            fine = 0;
        }
        System.out.println(fine);
    }

}
