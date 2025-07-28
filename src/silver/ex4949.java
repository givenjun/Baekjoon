package silver;

import java.io.*;

public class ex4949 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {

            String str = br.readLine();
            String mark = "";
            if (str.equals(".")) break;
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '[' || str.charAt(i) == ']' || str.charAt(i) == '.') {
                    mark += str.charAt(i);
                }
            }
            // bw.write(mark+"\n");
            int len = mark.length() / 2;
            int i = 0;
            while(i < len) {
                if (mark.contains("()"))
                    mark = mark.replace("()", "");
                if (mark.contains("[]"))
                    mark = mark.replace("[]", "");
                i++;
                // bw.write(mark+"\n");
                // bw.flush();
            }
            if (mark.charAt(0)=='.') bw.write("yes\n");
            else bw.write("no\n");

        }
        bw.flush();
        bw.close();
    }
}
