package silver;

import java.io.*;
import java.util.*;

public class Ex1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            
            String[] N_str = br.readLine().split(" ");
            String[] M_str = br.readLine().split(" ");

            int len = Integer.parseInt(N_str[0]);
            int first = Integer.parseInt(N_str[1]);
            int c = 0;

            Queue<Integer> M = new ArrayDeque<>();
            Queue<Integer> seq = new ArrayDeque<>();
            int[] list = new int[len];

            for (int j = 0; j < len; j++) {
                M.add(Integer.valueOf(M_str[j]));
                seq.add(j);
                list[j] = (Integer.parseInt(M_str[j]));
            }
            
            Arrays.sort(list);

            int j = 0;
            while (true) {
                int M_peek = M.peek();
                int seq_peek = seq.peek(); 
                if (M_peek < list[list.length - j - 1]) {
                    M.add(M_peek);
                    M.poll();
                    seq.add(seq_peek);
                    seq.poll();
                }
                else {
                    c++;
                    j++;
                    M.poll();
                    int result = seq.poll();
                    if (result == first) break;
                }
            }
            bw.write(c + "\n");
        }
        bw.flush();
        bw.close();
    }
}
