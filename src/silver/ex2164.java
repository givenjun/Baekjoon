package silver;

import java.io.*;
import java.util.*;


public class ex2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            q.add(i+1);
        }

        for (int i = 0; i < N-1; i++) {
            q.remove();
            q.add(q.poll());
        }
        bw.write(q.poll()+"");
        bw.flush();
        bw.close();
    }
}


// package silver;

// import java.io.*;

// public class ex2164 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
//         int N = Integer.parseInt(br.readLine());
//         int cnt = 0;
//         int[] List = new int[N];
//         for (int i = 0; i < N; i++) {
//             List[i] = i + 1;
//         }
        
//         if (N != 1)
//         for (int i = 0; i < N - cnt; i++) {
//             // bw.newLine();
//             for (int j = 0; j < N - 1 - cnt; j++) {
//                 List[j] = List[j+1];
//             }
//             int tmp = List[0];
//             // for (int k = 0; k < N; k++) {
//             //     bw.write(List[k]+"\t");
//             // }
//             // bw.newLine();
//             for (int j = 0; j < N - 1 - cnt; j++) {
//                 List[j] = List[j+1];
//             }
//             cnt++;
//             List[N-1-cnt] = tmp;
//             // for (int k = 0; k < N; k++) {
//             //     bw.write(List[k]+"\t");
//             // }
//             // bw.newLine();
//             // // bw.write("================================");
//         }
//         // for (int k = 0; k < N; k++) {
//         //     bw.write(List[k]+"\t");
//         // }
//         if (N == 1) bw.write("1");
//         else bw.write(List[1]+" ");
//         bw.newLine();
//         bw.flush();
//         bw.close();
//     }
// }
