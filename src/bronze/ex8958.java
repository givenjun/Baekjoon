package bronze;

import java.util.Scanner;

public class ex8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;

            String str = sc.next();

            String[] cnt = str.split("X");

            for (int j = 0; j < cnt.length; j++) {
                int num = (cnt[j].length() * (cnt[j].length() + 1)) / 2;
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
