import DataStract.Queue;

public class T_2021_summer_A_Q2 {
    public static Queue<Integer> buildNewQueue(Queue<Integer> q) {
        Queue<Integer> newQ = new Queue<>();
        Queue<Integer> temp = new Queue<>();
        Queue<Integer> runner = q;

        while (!q.isEmpty()) {
            int counter = 0;
            int curr = q.remove();
            while (!runner.isEmpty()) {
                int runnerTemp = runner.remove();
                if (curr == runnerTemp) {
                    counter++;
                } else {
                    temp.insert(runnerTemp);
                }
            }
            while (!temp.isEmpty()) runner.insert(temp.remove());
            if (counter >= 2) {
                newQ.insert(curr);
            }
        }
        return newQ;
    }

    public static void main(String[] args) {
        System.out.println("T_2021_summer_A_Q2");
        Queue<Integer> q = new Queue<>();
        q.insert(2);
        q.insert(5);
        q.insert(5);
        q.insert(7);
        q.insert(2);
        q.insert(4);
        q.insert(1);
        q.insert(3);
        q.insert(2);
        q.insert(5);
        q.insert(5);
        q.insert(1);

        System.out.println(q);
        System.out.println(buildNewQueue(q));
    }
}
