package silver;

import java.util.*;

public class ex1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 처리
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, (s1, s2) -> {
            if (s1.length() != s2.length()) return s1.length() - s2.length();
            return s1.compareTo(s2);
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}
