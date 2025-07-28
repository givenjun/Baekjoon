package silver;

import java.io.*;
import java.util.*;

public class ex10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] str = s.split(" ");
            // bw.write(str[0] + " ");
            if (str.length == 2 && str[0].equals("push")) {
                stack.push(str[1]);
            }
            if (str[0].equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    bw.write(stack.pop()+"");
                    bw.newLine();
                }
            }
            if (str[0].equals("size")) {
                bw.write(stack.size() + "");
                bw.newLine();
            }
            if (str[0].equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                }
                else {
                    bw.write("0");
                    bw.newLine();
                }
            }
            if (str[0].equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    String pop = stack.pop();
                    stack.push(pop);
                    bw.write(pop+"");
                    bw.newLine();
                }
            }
            // for (int j = 0; j < stack.size(); j++) {
            //     bw.write(stack.get(j) + " ");
            // }
            // bw.write(" => ");
            // bw.flush();
        }
        bw.flush();
        bw.close();
    }
}
