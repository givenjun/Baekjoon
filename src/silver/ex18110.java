package silver;

import java.io.*;
import java.util.Arrays;

public class ex18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            int n = Integer.parseInt(br.readLine());
            int ratio = ((n * 15) % 100 >= 50) ? (n * 15) / 100 + 1 : (n * 15) / 100;
            int sum = 0;
            int[] list = new int[n];

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(br.readLine());
                list[i] = num;
                sum += num;
            }
            
            Arrays.sort(list);

            for (int i = 0; i < ratio; i++) {
                sum -= list[i];
            }
            for (int i = n - ratio; i < n; i++) {
                sum -= list[i];
            }

            int divide = (ratio == 0) ? n : (n - (2 * ratio));
            int avg = ((sum * 100 / divide) % 100 >= 50) ? sum / divide + 1 : sum / divide;

            bw.write(avg + "");
            bw.flush();
            bw.close();
        }
        catch (ArithmeticException e) {
            bw.write("0");
            bw.flush();
            bw.close();
        }
    }

}
