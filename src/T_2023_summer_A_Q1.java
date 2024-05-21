import DataStract.Queue;

public class T_2023_summer_A_Q1 {
    public static int putInPlace(Queue<Integer> q, int num) {
        Queue<Integer> lessFromNum = new Queue<>();
        Queue<Integer> bigOrEvenFromNum = new Queue<>();

        int indexResults = 1;

        while (!q.isEmpty()) {
            int current = q.remove();
            if (current < num) {
                lessFromNum.insert(current);
                indexResults++;
            } else {
                bigOrEvenFromNum.insert(current);
            }
        }
        while (!lessFromNum.isEmpty()) {
            q.insert(lessFromNum.remove());
        }
        q.insert(num);
        while (!bigOrEvenFromNum.isEmpty()) {
            q.insert(bigOrEvenFromNum.remove());
        }
        return indexResults;
    }

    public static void moveToFront(Queue<Integer> q, int k) {
        Queue<Integer> newQ = new Queue<>();
        Queue<Integer> evenFromK = new Queue<>();
        int size = 0;

        while (!q.isEmpty()) {
            newQ.insert(q.remove());
            size++;
        }
        while (size != k) {
            evenFromK.insert(newQ.remove());
            size--;
        }
        while (!evenFromK.isEmpty()){
            newQ.insert(evenFromK.remove());
        }
        System.out.println("newQ : " + newQ);
    }

    public static void main(String[] args) {
        System.out.println("T_2023_summer_A_Q1 run");

        Queue<Integer> q = new Queue<>();
        q.insert(2);
        q.insert(10);
        q.insert(12);
        q.insert(3);
        q.insert(7);
        q.insert(4);
        q.insert(1);

        System.out.println(q);
//        System.out.println(putInPlace(q, 9));
//        System.out.println(q);

        moveToFront(q, 5);
    }
}
