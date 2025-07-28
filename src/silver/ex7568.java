package silver;

import java.util.Scanner;

public class ex7568 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] height = new int[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
            rank[i] = 1; // 기본 등수는 1
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (weight[i] < weight[j] && height[i] < height[j]) {
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
        System.out.println();
    }
}
