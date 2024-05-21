import DataStract.Node;

public class T_2022_aviv_A_Q1 {
    public static void first(Node<Integer> chain) {
        Node<Integer> runner = chain;

        while (runner != null) {
            Node<Integer> newNode = new Node<>(runner.getValue());

            newNode.setNext(runner.getNext());
            runner.setNext(newNode);

            runner = runner.getNext().getNext();
        }

    }

    public static void second(Node<Integer> lst) {
        Node<Integer> current = lst;
        Node<Integer> newList = lst;
        Node<Integer> secondPart = lst;
//        Node<Integer> head = newList;

        while (newList.getNext() != null) {
            newList = newList.getNext();
        }
        System.out.println("part");

        while (current != null) {
            Node<Integer> newNode = new Node<>(secondPart.getValue());
            newNode.setNext(null);
            newList.setNext(newNode);
            newList= newList.getNext();
            secondPart = secondPart.getNext();
            current = current.getNext().getNext();
        }
//        System.out.println(head);
    }

    public static void main(String[] args) {
        System.out.println("T_2022_aviv_A_Q1");

        Node<Integer> lst = new Node<>(1, new Node<>(2, new Node<>(3, new Node<>(4))));
        System.out.println(lst);
//        first(lst);
        second(lst);
        System.out.println(lst);
    }
}
