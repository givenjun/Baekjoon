package bronze;

import java.util.Scanner;

public class ex11050 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int K_fac = 1;
        int N_minus_K_to_N = 1;

        for (int i = 1; i <= K; i++) {
            K_fac *= i;
        }
        for (int j = N; j > N - K; j--) {
            N_minus_K_to_N *= j;
        }

        int Combination = N_minus_K_to_N/K_fac;

        // System.out.println(N_minus_K_to_N);
        // System.out.println(K_fac);
        System.out.println(Combination);

    }
}
