package bronze;

import java.util.*;

public class ex1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        int max = Collections.max(list);
        // System.out.println(list);
        // System.out.println(max);
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i) + "/"+ max);
            sum += list.get(i) * 100.0 / max;
            
        }
        // System.out.println(list);
        double avg = sum / n;

        System.out.println(avg);
    }
}
