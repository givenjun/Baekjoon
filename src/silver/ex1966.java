package silver;

import java.io.*;
import java.util.*;

public class ex1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            Queue<Integer> N = new ArrayDeque<>();

            String[] N_str = br.readLine().split(" ");
            String[] M_str = br.readLine().split(" ");

            int len = Integer.parseInt(N_str[0]);
            int num = Integer.parseInt(N_str[1]);

            for (int j = 0; j < len; j++) {
                if (Integer.parseInt(M_str[num]) <= Integer.parseInt(M_str[j])) N.add(Integer.valueOf(M_str[j]));
            }

            bw.write(N.size()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
