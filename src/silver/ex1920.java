package silver;

import java.io.*;
import java.util.*;

public class ex1920 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        String[] array1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(array1[i]));
        }

        int m = Integer.parseInt(br.readLine());
        String[] array2 = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            boolean con = set.contains(Integer.parseInt(array2[i]));
            if (con) bw.write("1\n");
            else bw.write("0\n");
        }

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

// public class ex1920 {
//     public static void main(String[] args) throws IOException{

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = Integer.parseInt(br.readLine());
//         String[] array1 = br.readLine().split(" ");

//         int m = Integer.parseInt(br.readLine());
//         String[] array2 = br.readLine().split(" ");

//         int max = (n > m) ? n : m;
//         int[] list = new int[max];

//         for (int i = 0; i < array2.length; i++) {
//             for (int j = 0; j < array1.length; j++) {
//                 if (array2[i].equals(array1[j])) {
//                     list[i] = 1;
//                     break;
//                 }
//                 list[i] = 0;
//             }
//         }

//         for (int i = 0; i < list.length; i++) {
//             bw.write(list[i]+"");
//             bw.newLine();
//         }
//         bw.flush();
//         bw.close();

//     }
// }
