package silver;

import java.io.*;

public class Ex11723 {

    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[20];

        for (int i = 0; i < N; i++) {
            String[] com = br.readLine().split(" ");
            int num = 0;
            if (com.length > 1) num = Integer.parseInt(com[1]);

            if (com[0].equals("add")) add(num, list);
            else if (com[0].equals("remove")) remove(num, list);
            else if (com[0].equals("check")) bw.write(check(num, list));
            else if (com[0].equals("toggle")) toggle(num, list);
            else if (com[0].equals("all")) all(list);
            else if (com[0].equals("empty")) empty(list);
        }
        bw.flush();
        bw.close();
    }

    public static void add (int n, int[] list) {
        list[n-1] = n;
    }
    public static void remove (int n, int[] list) {
        list[n-1] = 0;
    }
    public static String check (int n, int[] list) {
        if (list[n-1] == n) return "1\n";
        else return "0\n";
    }
    public static void toggle (int n, int[] list) {
        if (list[n-1] == n) list[n-1] = 0;
        else list[n-1] = n;
    }
    public static void all (int[] list) {
        for (int i = 1; i <= 20; i++) {
            list[i-1] = i;
        }
    }
    public static void empty (int[] list) {
        for (int i = 1; i <= 20; i++) {
            list[i-1] = 0;
        }
    }
}