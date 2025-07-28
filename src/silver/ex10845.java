package silver;

import java.io.*;
import java.util.*;

public class ex10845 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String last = "";
        Queue<String> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] com = br.readLine().split(" ");

            if (com[0].equals("push")) {
                queue.add(com[1]);
                last = com[1];
            }
            if (com[0].equals("pop")) {
                if (!queue.isEmpty()) bw.write(queue.poll()+"\n");
                else bw.write("-1\n");
            }
            if (com[0].equals("size")) {
                bw.write(queue.size()+"\n");
            }
            if (com[0].equals("empty")) {
                if (queue.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            if (com[0].equals("front")) {
                if (!queue.isEmpty()) bw.write(queue.element()+"\n");
                else bw.write("-1\n");
            }
            if (com[0].equals("back")) {
                if (!queue.isEmpty()) bw.write(last+"\n");
                else bw.write("-1\n");
            }
            // bw.write("<");
            // bw.write(queue.toString());
            // bw.write(">\n");
            // bw.flush();
        }
        bw.flush();
        bw.close();
    }
}
