import DataStract.Queue;

public class T_2023_aviv_B_Q1 {
    public static Queue<Integer> arrangeData(Queue<Integer> marks) {
        int counter = 0;
        Queue<Integer> tests = new Queue<>();
        Queue<Integer> head = tests;
        Queue<Integer> tempQ = new Queue<>();

        while (!marks.isEmpty()) {
            int cuur = marks.remove();
            if (cuur != -1) {
                counter++;
                tempQ.insert(cuur);
            } else {
                tests.insert(counter);
                counter = 0;
            }
        }
        while (!tempQ.isEmpty()) {
            marks.insert(tempQ.remove());
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println("T_2023_aviv_B_Q1");

        Queue<Integer> lst = new Queue<>();
        lst.insert(80);
        lst.insert(90);
        lst.insert(100);
        lst.insert(-1);
        lst.insert(75);
        lst.insert(96);
        lst.insert(-1);
        lst.insert(100);
        lst.insert(100);
        lst.insert(97);
        lst.insert(96);
        lst.insert(-1);
        lst.insert(-1);
        lst.insert(88);
        lst.insert(94);
        lst.insert(-1);

        System.out.println("lst before : " + lst);
        System.out.println("lst new test : " + arrangeData(lst));
        System.out.println("lst after : " + lst);
    }
}
