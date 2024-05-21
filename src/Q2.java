import DataStract.LinkedList;
import DataStract.Node;

public class Q2 {
    //    part A
    public static int numDigits(Node<Integer> nodes) {
        int countDidit = 1;

        while (nodes.getValue() > 10) {
            nodes.setValue(nodes.getValue() / 10);
            countDidit += 1;
        }
        return countDidit;
    }

    //    part B
    public static int compare(Node<Integer> n1, Node<Integer> n2) {
        System.out.println("n1 = "+n1.getValue()+" n2 = " + n2.getValue());

        if (n1.getValue() > n2.getValue()) {
            return 1;
        } else if (n1.getValue() < n2.getValue())
            return 2;
        return 0;
    }
//    part C
//    the complicates is o(1) because the length is constant

    public static void main(String[] args) {
        System.out.println("Q2 main run");
        LinkedList<Integer> nodes = new LinkedList<>();
        LinkedList<Integer> nodes2 = new LinkedList<>();

        nodes2.add(2);

        nodes.add(2);
        nodes.add(3);
        nodes.add(2);
        nodes.add(1);
        nodes.add(4);
        nodes.add(1);
        nodes.add(8);

        System.out.println(nodes);
//        part A
//        System.out.println(numDigits(nodes.getHead()));
//        part B
        System.out.println(compare(nodes.getHead(), nodes2.getHead()));

    }
}
