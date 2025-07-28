package bronze;

import java.util.Scanner;

public class ex15829 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        long hash = 0;
        long r = 1;
        int M = 1234567891;

        for (int i = 0; i < n; i++) {
            int num = str.charAt(i) - 'a' + 1;
            hash = (hash + num * r) % M;
            r = (r * 31) % M; // r^i 값을 매번 구하되, 중간중간 %M 처리
        }

        System.out.println(hash);
    }
}
