package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        String[] N_M = new String[N];
        String[] B_plate = new String[N];
        String[] W_plate = new String[N];
        char B = 'B';
        char W = 'W';
        int[] B_cnt = new int[(N-7)*(M-7)];
        int[] W_cnt = new int[(N-7)*(M-7)];
        for (int i = 0; i < 8; i++) {
            B_plate[i] = "";
            W_plate[i] = "";
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    B_plate[i] += B;
                    W_plate[i] += W; 
                }
                else if (i % 2 == 0 && j % 2 == 1) {
                    B_plate[i] += W;
                    W_plate[i] += B; 
                }
                else if (i % 2 == 1 && j % 2 == 0) {
                    B_plate[i] += W;
                    W_plate[i] += B; 
                }
                else {
                    B_plate[i] += B;
                    W_plate[i] += W;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            N_M[i] = st2.nextToken();
        }
        int num = 0;
        for (int k = 0; k < N-7; k++) {
            for (int h = 0; h < M-7; h++) {
                for (int i = k; i < 8+k; i++) {
                    for (int j = h; j < 8+h; j++) {
                        char c = N_M[i].charAt(j);
                        char c1 = B_plate[i-k].charAt(j-h);
                        char c2 = W_plate[i-k].charAt(j-h);
                        if (c != c1) B_cnt[num]++;
                        if (c != c2) W_cnt[num]++;
                    }
                }
                num++;
            }
        }
        Arrays.sort(B_cnt);
        Arrays.sort(W_cnt);
        int cnt = (B_cnt[0] > W_cnt[0]) ? W_cnt[0] : B_cnt[0];

        // for (int i = 0; i < B_cnt.length; i++){
        //     bw.write(B_cnt[i] + ", ");
        // }
        // bw.newLine();
        // bw.newLine();
        // for (int i = 0; i < B_cnt.length; i++){
        //     bw.write(W_cnt[i] + ", ");
        // }
        // bw.write("==============================");
        // bw.newLine();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}


// package silver;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.util.StringTokenizer;

// public class ex1018 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         StringTokenizer st1 = new StringTokenizer(br.readLine());

//         int N = Integer.parseInt(st1.nextToken());
//         int M = Integer.parseInt(st1.nextToken());
//         String[] N_M = new String[N];
//         char B = 'B';
//         char W = 'W';

//         for (int i = 0; i < N; i++) {
//             StringTokenizer st2 = new StringTokenizer(br.readLine());
//             N_M[i] = st2.nextToken();
//             if (N_M[i].length() != M) break;
//         }
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < M; j++) {
//                 char c = N_M[i].charAt(j);
//                 char c1 = (j == 0) ? N_M[i].charAt(M-1) : N_M[i].charAt(j-1);
//                 char c2 = (j == M-1) ? N_M[i].charAt(0) : N_M[i].charAt(j+1);
//                 char c3 = (i == 0) ? N_M[N-1].charAt(j) : N_M[i-1].charAt(j);
//                 char c4 = (i == N-1) ? N_M[0].charAt(j) : N_M[i+1].charAt(j);
//                 if (c == 'B' && c1 == c2 && c2 == c3 && c3 == c4 && c == c1) {
//                     N_M[i] = N_M[i].substring(0, j) + W + N_M[i].substring(j + 1);
//                 }
//                 else if (c == 'W' && c1 == c2 && c2 == c3 && c3 == c4 && c == c1) {
//                     N_M[i] = N_M[i].substring(0, j) + B + N_M[i].substring(j + 1);
//                 }
//             }
//         }
//         bw.write("==============================");
//         bw.newLine();
//         for (int i = 0; i < N; i++) {
//             bw.write(N_M[i]);
//             bw.newLine();
//         }
//         bw.flush();
//         bw.close();
//     }
// }
