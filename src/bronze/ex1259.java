package bronze;

import java.util.Scanner;

public class ex1259 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) { 
            
            String str = sc.next();

            if (str.equals("0")) break;

            // System.out.println(str.length());
            // System.out.println(str.length() - 1);
            for (int i = 0; i < str.length(); i++) {

                if (i >= str.length() / 2) {
                    System.out.println("yes");
                    break;
                }
                if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                    System.out.println("no");
                    break;
                }
                
                // System.out.println(str.charAt(i) + " <-> " + str.charAt(str.length() - (i + 1)));

            }

        }

    }
}
