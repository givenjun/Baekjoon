package silver;

import java.io.*;
import java.util.*;

public class Ex17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        HashMap<String, String> hash = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] info = br.readLine().split(" ");
            hash.put(info[0], info[1]);
        }
        for (int i = 0; i < M; i++) {
            String url = br.readLine();
            bw.write(hash.get(url) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
