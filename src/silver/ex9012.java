package silver;

import java.io.*;


public class ex9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int open = 0, close = 0;
            String str = br.readLine();
            boolean TF = (str.length() % 2 == 0);

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') open++;
                if (str.charAt(j) == ')') close++;
                if (open < close) {
                    TF = false;
                    break;
                }
            }
            // bw.write(open+" "+close+" ");
            if (open != close) TF = false;

            if (TF) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.flush();
        bw.close();

    }
}
