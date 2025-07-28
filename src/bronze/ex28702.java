package bronze;

import java.util.Scanner;

public class ex28702 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        int idx = -1;
        int n = 0, num = 0;

        for (int i = 0; i < 3; i++) {
            str[i] = sc.next();
            if (str[i].equals("FizzBuzz") || str[i].equals("Fizz") || str[i].equals("Buzz"))
                continue;
            n = Integer.parseInt(str[i]);
            idx = i;
            break;
        }

        switch (idx) {
            case 0:
                num = n + 3;
                break;
            case 1:
                num = n + 2;
                break;
            default:
                num = n + 1;
                break;
        }

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        }
        else if (num % 3 != 0 && num % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(num);
        }
    }
}
