import DataStract.Node;

public class T_2022_summer_A_Q1 {
    public static Node<Integer> differenceList(Node<Integer> head) {
        Node<Integer> runner = head;
        Node<Integer> newList = new Node<>(runner.getValue() > runner.getNext().getValue() ? runner.getValue() - runner.getNext().getValue() : runner.getNext().getValue() - runner.getValue(), null);
        Node<Integer> headRunner = newList;
        runner = runner.getNext();

        while (runner.getNext() != null) {
            Node<Integer> newNode = new Node<>(runner.getValue() > runner.getNext().getValue() ? runner.getValue() - runner.getNext().getValue() : runner.getNext().getValue() - runner.getValue());
            newNode.setNext(null);
            newList.setNext(newNode);
            newList = newList.getNext();

            runner = runner.getNext();
        }

        return headRunner;

    }

    public static void theSurvives(Node<Integer> n) {
        System.out.println(n);
        Node<Integer> res = differenceList(n);
        System.out.println(res);

        while (res.getNext() != null) {
            System.out.println(res);
            res = differenceList(res);
        }

        System.out.println(res);

    }

    public static void main(String[] args) {
        System.out.println("T_2022_summer_A_Q1 run");
//        5 20 9 6 5 8 2 --> checking for list;
        Node<Integer> node = new Node<>(5, new Node<>(20, new Node<>(9, new Node<>(6, new Node<>(5, new Node<>(8, new Node<>(2)))))));
//        System.out.println(differenceList(node));

        theSurvives(node);
    }
}
