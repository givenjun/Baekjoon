package bronze;

import java.util.Scanner;

public class ex2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {

            int repeat = sc.nextInt();
            String str = sc.nextLine();
            String[] str_repeat = str.split("");

            for (int j = 1; j < str_repeat.length; j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(str_repeat[j]);
                }
            }
            System.out.println();

        }

    }
}
