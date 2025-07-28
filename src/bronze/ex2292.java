package bronze;

import java.util.Scanner;

public class ex2292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 0;
        while (true) {
            // System.out.print(num + "-" + (i * 6) + "=");
            num -= i * 6;
            // System.out.println(num);
            if (num <= 1) {
                i++;
                break;
            }
            i++;
        }
        System.out.println(i);

    }
}
