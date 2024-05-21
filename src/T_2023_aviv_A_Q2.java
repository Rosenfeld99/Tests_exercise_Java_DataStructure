import DataStract.Node;

public class T_2023_aviv_A_Q2 {
    //    Part A
    public static int numDigits(Node<Integer> n) {
        int counter = 0;
        Node<Integer> runner = n;
        while (runner != null) {
            counter++;
            runner = runner.getNext();
        }
        return counter;
    }

    //    Part B
    public static int compare(Node<Integer> n1, Node<Integer> n2) {
        Node<Integer> runner1 = n1;
        Node<Integer> runner2 = n2;
        int sumOfN1 = 0;
        int sumOfN2 = 0;
        while (runner1 != null) {
            sumOfN1 += runner1.getValue();
            runner1 = runner1.getNext();
        }
        while (runner2 != null) {
            sumOfN2 += runner2.getValue();
            runner2 = runner2.getNext();
        }

        if (sumOfN1 > sumOfN2) return 1;
        else if (sumOfN1 < sumOfN2) return 2;

        return 0;
    }

//    Part C --> what is complicate of func compare ?
//    answer : the complicate is o(n)

    public static void main(String[] args) {
        System.out.println("T_2023_aviv_A_Q2");

        Node<Integer> list = new Node<>(2, new Node<>(3, new Node<>(2, new Node<>(1, new Node<>(4, new Node<>(1, new Node<>(8)))))));
        Node<Integer> list2 = new Node<>(1, new Node<>(3, new Node<>(2, new Node<>(1, new Node<>(4, new Node<>(1, new Node<>(8)))))));
        System.out.println("List : " + list);
//        System.out.println(numDigits(list)); // --> part one
        System.out.println(compare(list, list2));
    }
//    checking --> 799 | 888
}
