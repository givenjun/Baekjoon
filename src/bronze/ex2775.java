package bronze;

import java.util.*;

public class ex2775 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 14; i++) {
            list1.add(i + 1);
            list2.add(0);
        }
        list3 = list1;
        for (int i = 0; i < cnt; i++) {
            list1 = list3;
            int k = sc.nextInt();
            int n = sc.nextInt();
            // System.out.println("0층: " +list1);
  
            for (int j = 0; j < k; j++) {
                // System.out.println("list1 => " + j+"층: " +list1);
                for (int a = 0; a < 14; a++) {
                    int tmp = 1;
                    for (int b = 1; b <= a; b++) {
                        tmp = list2.get(b-1) + list1.get(b);
                    }
                    list2.set(a, tmp);
                }
                // System.out.println("list2 => "+(j+1)+"층: " +list2);
                // System.out.println();
                list1 = list2;
            }
            if (k == 0) System.out.println(n);
            else System.out.println(list2.get(n - 1)+"");
        }
    }
}
