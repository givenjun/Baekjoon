package bronze;

import java.util.Scanner;

public class ex10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        char[] arr = new char[alpha.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = alpha.charAt(i);
            if (word.indexOf(arr[i]) >= 0) {
                result += word.indexOf(arr[i]) + " ";
            }
            else result += "-1 ";
        }
        System.out.println(result);
    }
}