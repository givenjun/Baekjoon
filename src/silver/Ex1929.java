package silver;

import java.io.*;

public class Ex1929 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);


        for (int i = M; i <= N; i++) {

            boolean isNotPrime = false;
            
            if (i == 1) isNotPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (!isNotPrime) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
