package silver;

import java.io.*;
import java.util.*;


public class ex11866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> seq = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            queue.add((i % N) + 1);
        }

        while (true) {

            if (seq.size() == N) break;

            if ((cnt + 1) % K != 0) {
                int i = queue.poll();
                queue.add(i);
            }
            else if ((cnt + 1) % K == 0) seq.add(queue.poll());

            cnt++;
        }

        bw.write("<");
        for (int i = 0; i < seq.size() - 1; i++) {
            bw.write(seq.get(i) + ", ");
        }
        bw.write(seq.get(seq.size() - 1) + ">");

        bw.flush();
        bw.close();

    }
}