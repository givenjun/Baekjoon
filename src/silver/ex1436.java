package silver;

import java.util.Scanner;

public class ex1436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = 666;
        int cnt = 0;

        while(true) {
            
            String str = Integer.toString(n);
            if (str.contains("666")) {
                cnt++;
            }
            
            if (cnt == N) break;
            n++;

        }
        System.out.println(n);
    }
}
