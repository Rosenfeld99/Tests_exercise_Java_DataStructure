import DataStract.Node;

public class T_2022_summer_B_Q2 {
    public static int numNodesFollowing(Node<Integer> lst) {
        Node<Integer> head = lst;
        Node<Integer> runner = head;

        int counter = 0;
        while (runner != null) {
            counter++;
            runner = runner.getNext();
        }
        ;
        return counter;
    }

    public static boolean isSection(Node<Integer> lst) {
        Node<Integer> head = lst;
        Node<Integer> runner = head;

        while (runner != null) {
            if (runner.getValue() > numNodesFollowing(runner)) {
                return false;
            }
            runner = runner.getNext();
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("T_2022_summer_B_Q2");
        Node<Integer> lst = new Node<>(2, new Node<>(3, new Node<>(2, new Node<>(1, new Node<>(-4, new Node<>(1, new Node<>(0)))))));
        System.out.println(numNodesFollowing(lst));
        System.out.println(isSection(lst));
    }
}
