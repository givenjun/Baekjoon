package silver;

import java.io.*;
import java.util.*;

public class Ex2108 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        int[] cnt = new int[8001];
        int sum = 0, avg, mid, fre = 0, ran;

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
            sum += list[i];
            cnt[list[i] + 4000]++;
        }

        int[] copy = cnt.clone();
        Arrays.sort(cnt);
        int max = cnt[8000];

        int first = -4001, second = -4001;
        for (int i = 0; i < 8001; i++) {
            if (copy[i] == max) {
                if (first == -4001)
                    first = i - 4000;
                else
                    second = i - 4000;
            }
            if (second != -4001)
                break;
        }

        Arrays.sort(list);
        avg = Math.round(((float) sum / N));
        mid = list[Math.round(N / 2)];
        fre = (second == -4001) ? first : second;
        ran = list[N - 1] - list[0];

        bw.write(avg + "\n");
        bw.write(mid + "\n");
        bw.write(fre + "\n");
        bw.write(ran + "\n");
        bw.flush();
        bw.close();
    }
}
