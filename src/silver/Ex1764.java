package silver;

import java.io.*;
import java.util.*;

public class Ex1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num_list = br.readLine().split(" ");
        int N = Integer.parseInt(num_list[0]);
        int M = Integer.parseInt(num_list[1]);
        HashSet<String> N_set = new HashSet<>();
        HashSet<String> M_set = new HashSet<>();
        

        for (int i = 0; i < N; i++) {
            N_set.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            M_set.add(br.readLine());
        }
        N_set.retainAll(M_set);
        int len = N_set.size();
        String[] list = new String[len];

        int i = 0;
        for (String str : N_set) {
            list[i] = str;
            i++;
        }
        Arrays.sort(list);

        bw.write(list.length + "\n");
        for (String str : list) {
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}
