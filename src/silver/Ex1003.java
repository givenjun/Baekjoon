package silver;

import java.io.*;
import java.util.HashMap;

public class Ex1003 {

    static HashMap<Integer, String> hash = new HashMap<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i <= 40; i++) {
            fibonacci(i);
        }

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(hash.get(num) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void fibonacci(int n) {
        int zero = 0, one = 0;
        if (n == 0) {
            zero++;
            hash.put(0, zero + " " + one);
        } else if (n == 1) {
            one++;
            hash.put(1, zero + " " + one);
        } else {
            String[] n_1 = hash.get(n-1).split(" ");
            String[] n_2 = hash.get(n-2).split(" ");
            int zero_sum = Integer.parseInt(n_1[0]) + Integer.parseInt(n_2[0]);
            int one_sum = Integer.parseInt(n_1[1]) + Integer.parseInt(n_2[1]);
            hash.put(n, zero_sum + " " + one_sum);
        }
    }
}
