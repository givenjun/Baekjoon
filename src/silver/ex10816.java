package silver;

import java.io.*;
import java.util.*;

public class ex10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] N_list = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        
        int M = Integer.parseInt(br.readLine());
        String[] M_list = br.readLine().split(" ");
        int[] list = new int[M];
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(N_list[i]);
            if (map.containsKey(num)) {
                map.replace(num, map.get(num)+1);
                continue;
            }
            map.put(num, 1);
        }

        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(M_list[i]);
            list[i] = (map.get(n)) != null ? (int)map.get(n) : 0;
            
            bw.write(list[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
