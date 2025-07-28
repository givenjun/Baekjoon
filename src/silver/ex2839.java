package silver;

import java.io.*;
import java.util.Arrays;

public class ex2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        int[][] List = new int[N/3+1][2];
        int[] sum = new int[N/3+1];

        for (int i = 0; i < N/3+1; i++) {
            if (((N-5*i) % 3) == 0 && (N-5*i) > -1) {
                List[i][0] = (N-5*i)/3;
                if (((N-3*List[i][0]) % 5) == 0 && (N-3*List[i][0]) > -1) {
                    List[i][1] = (N-3*List[i][0])/5;
                }
            }
            else List[i][0] = 5000;
            sum[i] = List[i][0] + List[i][1];
        }
        Arrays.sort(sum);
        
        // for (int i = 0; i < N/3+1; i++) {
        //     if (List[i][0] != 5000) {
        //         bw.write(List[i][0] + " \t " + List[i][1] + " => " + sum[i]);
        //         bw.newLine();
        //     }
        // }
        if (sum[0] == 5000) bw.write("-1");
        else bw.write(sum[0]+"");
        bw.flush();
        bw.close();
    }
}
