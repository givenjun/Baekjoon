package silver;

import java.io.*;
import java.util.Stack;

public class ex10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());    
            if (n != 0) {
                stack.push(n);
            }
            else {
                stack.pop();
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
            
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}
