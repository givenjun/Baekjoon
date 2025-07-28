package bronze;

import java.util.*;

public class ex3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> remain_list = new ArrayList();
        boolean same = false;

        for (int i = 0; i < 10; i++) {
            
            int num = sc.nextInt();
            int remain = num % 42;

            for (int j = 0; j < remain_list.size(); j++) {
                same = false;
                if (remain == remain_list.get(j)) {
                    same = true;
                    break;
                }
            }
            if (same == false) remain_list.add(remain);
        }
        System.out.println(remain_list.size());

    }
}
