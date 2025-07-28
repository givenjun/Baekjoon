package bronze;

import java.util.Scanner;

public class ex1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        String str = sc.nextLine();
        String[] str_split;

        if (str.equals("") || str.equals(" ") || str.equals("\n")) {
            count = 0;
        }
        else {
            str_split = str.split(" ");
            count = str_split.length;
            if (str_split[0].equals("")) {
                count--;
            }
        }
        
        System.out.println(count);
    }
}
