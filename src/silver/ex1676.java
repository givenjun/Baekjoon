package silver;

import java.util.Scanner;

public class ex1676 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {

            if(i % 5 == 0) cnt++;

        }
        System.out.println(cnt);

    }
    
}
