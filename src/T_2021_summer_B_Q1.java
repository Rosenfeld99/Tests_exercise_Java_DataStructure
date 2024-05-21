import DataStract.Queue;

public class T_2021_summer_B_Q1 {
    public static Queue<Integer> createN(int n) {
        Queue<Integer> q = new Queue<>();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                q.insert(i);
            }
        }
        return q;
    }

    public static boolean isN(int num, Queue q) {
        Queue<Integer> q2 = createN(num);

        while (!q.isEmpty() || !q2.isEmpty()) {
            if (q.remove() != q2.remove()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("T_2021_summer_B_Q1");
//        System.out.println(createN(4));
        Queue<Integer> q = createN(4);
//        System.out.println(q);
        System.out.println(isN(9,q));
    }
}
