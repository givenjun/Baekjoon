package silver;

import java.io.*;
import java.util.*;

public class Ex1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        HashMap<String, Integer> alpha_key = new HashMap<>();
        HashMap<Integer, String> digit_key = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            alpha_key.put(name, i);
            digit_key.put(i, name);
        }
        
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (str.charAt(0) > '9') {
                bw.write(alpha_key.get(str) + "\n");
            }
            else {
                bw.write(digit_key.get(Integer.valueOf(str)) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
