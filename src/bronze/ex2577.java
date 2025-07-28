package bronze;

import java.util.Scanner;

public class ex2577 {
    public static void main(String[] args) {
        
        int a, b, c, sum;
        int[] count = new int[10];
        String str;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sum = a * b * c;

        str = String.valueOf(sum);
        String[] num = str.split("");

        for (int i = 0; i < num.length; i++) {
            switch (num[i]) {
                case "0": count[0]++; break;
                case "1": count[1]++; break;
                case "2": count[2]++; break;
                case "3": count[3]++; break;
                case "4": count[4]++; break;
                case "5": count[5]++; break;
                case "6": count[6]++; break;
                case "7": count[7]++; break;
                case "8": count[8]++; break;
                default: count[9]++; break;
            }
        }
        
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }

    }

    

}
