package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex10814 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(bf.readLine());
        int min=201, max=0;
        int[] age_list = new int[n];
        String[] name_list = new String[n];
        
        for (int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(" ");
            age_list[i] = Integer.parseInt(line[0]);
            name_list[i] = line[1];

            if (age_list[i] < min) min = age_list[i];
            if (age_list[i] > max) max = age_list[i];
        }
        if (min > age_list[n-1]) min = age_list[n-1];
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < n; j++) {
                if (age_list[j] != i) continue;

                bw.write(i + " " + name_list[j]);
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
