/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distinct;

/**
 *
 * @author Mohammed Ramadan
 */
import java.util.*;

public class Distinct {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int counter = 0;
        while (num != 6174) {
            int n, r = 0, asc = 0;
            int x = String.valueOf(num).length();
            if (x < 4) {
                num = num * (int) (Math.pow(10, (4 - x)));
            }

            int desc = 0;
            for (int i = 9; i >= 0; i--) {
                int tmp = num;
                while (tmp > 0) {
                    int digit = tmp % 10;
                    
                    if (digit == i) {
                        desc *= 10;
                        desc += digit;
                    }
                    tmp /= 10;
                }
            }
            n = desc;
            while (n > 0) {
                r = n % 10;
                n = n / 10;
                asc = (asc * 10) + r;
            }
            num = desc - asc;
            counter++;
        }
        System.out.println(counter);
    }

}
