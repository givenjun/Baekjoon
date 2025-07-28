package bronze;

import java.util.Scanner;

public class ex2609 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = (a < b) ? a : b;
        int j = 1;
        int min = 0, max = 0;

        while (true) {
            if (a % n == 0 && b % n ==0) {
                min = n;
                n = 1;
                break;
            }
            n--;
        }
        System.out.println(min);
        while (true) { 
            int a_mul = a * n;
            while (true) { 
                int b_mul = b * j;
                // System.out.println(b_mul + "<=>" + a_mul);
                if (b_mul > a_mul) break;
                if (b_mul == a_mul) {
                    max = b_mul;
                    n = 0;
                    break;
                }
                j++;
            }
            if (n == 0) break;
            n++;
        }
        System.out.println(max);
    }
}
