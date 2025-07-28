package bronze;

import java.util.Scanner;

public class ex2869 {
    public static void main(String[] args) {

        int A, B, V;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        V = sc.nextInt();
        
        int day = (int)Math.ceil((V - A) * 1.0 / (A - B)) + 1;
        
        System.out.println(day);
    }
}
