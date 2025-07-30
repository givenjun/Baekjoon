package silver;

import java.io.*;
import java.util.*;

public class Ex1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[N + 1];
        int memory = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (i == 0) {
                for (int j = 0; j < num; j++) {
                    stack.push(j + 1);
                    // bw.write("+\n");
                    str.append("+\n");
                }
                memory = stack.pop();
                visited[memory] = true;
                // bw.write("-\n");
                str.append("-\n");
            }
            else {
                if (memory < num) {
                    for (int j = memory; j < num; j++) {
                        if (visited[j + 1]) continue;
                        stack.push(j + 1);
                        // bw.write("+\n");
                        str.append("+\n");
                    }
                    memory = stack.pop();
                    visited[memory] = true;
                    // bw.write("-\n");
                    str.append("-\n");
                }
                else if (memory > num) {
                    if (!stack.isEmpty() && stack.peek() == num) {
                        memory = stack.pop();
                        visited[memory] = true;
                        str.append("-\n");
                    } else {
                        str.append("NO\n");
                    }
                }
            }
            // for (Integer l:list) {
            //     bw.write(l + " ");
            // }
            // bw.newLine();
            // for (Integer s:stack) {
            //     bw.write(s + " ");
            // }
            // bw.newLine();     
        }
        String s = str.toString();
        if (!s.contains("NO")) bw.write(s);
        else bw.write("NO");

        bw.flush(); 
        bw.close();
    }
}
