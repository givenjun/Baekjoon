package bronze;

import java.util.Scanner;

public class ex2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 카드 개수
        int m = sc.nextInt(); // 목표 숫자
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int max = 0;

        // 중복되지 않게 i < j < k 순서로 3중 루프
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= m && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
