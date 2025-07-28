package bronze;

import java.util.Scanner;

public class ex14626 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ISBN = sc.next();
        String[] a = ISBN.split("");

        int index = ISBN.indexOf("*");
        int m = Integer.parseInt(a[ISBN.length() - 1]);
        int sum = 0;
        int x = 0;
        // sum => *와 m을 제외한 ISBN의 총합
        //ISBN의 총합을 구합니다 단, *와 m은 제외
        for (int i = 0; i < ISBN.length() - 1; i++) {
            if (i == index) continue;
            int num = Integer.parseInt(a[i]);
            // 홀수면 그대로 짝수면 3을 곱한 값 더하기
            sum += (i % 2 == 0) ? 
            num : num * 3;
        }
        // 문제에 m = 10 - (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) mod 10가 주어짐
        // (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) mod 10 = (10 - n) 이다.
        // * 자리에 0부터 9까지 대입하면서 반복
        for (int i = 0; i < 10; i++) {
            // total => m을 제외한 ISBN의 총함
            int total = sum;
            // 위에서 구한 *의 위치가 홀수면 그대로 짝수면 3을 곱한 값 더하기
            total += (index % 2 == 0) ?
            i : i * 3;
            // (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) mod 10 = 0 이면 m = 0이다.
            if (total % 10 == 0 && m == 0) {
                x = i;
                break;
            }
            // (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) mod 10 = (10 - n) 이다.
            else if (total % 10 == 10 - m) {
                x = i;
                break;
            }
        }

        System.out.println(x);

    }
}
