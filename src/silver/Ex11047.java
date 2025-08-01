package silver;

import java.io.*;

public class Ex11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int K = Integer.parseInt(num[1]);
        int[] val = new int[N];
        int q = 0;
        int r = 0;

        for (int i = 0; i < N; i++) {
            val[i] = Integer.parseInt(br.readLine()); 
        }
        for (int i = N - 1; i >= 0; i--) {
            q += K / val[i];
            r = K % val[i];
            K = r;
            if (r == 0) break;
        }
        bw.write(q + "");
        bw.flush();
        bw.close();
    }
}
