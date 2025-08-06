package silver;

import java.io.*;
import java.util.Arrays;

public class Ex11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] list = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            cnt += list[i] * (N - i);
            // bw.write(list[i] + " * " + (N - i) + " = " + (list[i] * (N - i)) +"\n");
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}
