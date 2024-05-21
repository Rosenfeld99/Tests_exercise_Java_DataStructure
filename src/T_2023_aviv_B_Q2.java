import DataStract.Node;

public class T_2023_aviv_B_Q2 {
    public static void balance(Node<Integer> chain) {
        int size = 0;
        int calc = 0;
        Node<Integer> runner = chain;

        while (runner.getNext() != null) {
            size++;
            calc += runner.getValue();

            runner = runner.getNext();
        }

        calc += runner.getValue();
        size++;

        if (size % 2 == 0 && calc == 0) {
            System.out.println(" Chain is perfect");
        } else {
            if (calc > 0) {
                System.out.println("IN part if");
                size++;
                Node<Integer> newNode = new Node<>(calc - calc - calc);
                calc = calc - calc;
                newNode.setNext(null);
                runner.setNext(newNode);
            } else {
                System.out.println("IN part else "+Math.abs(calc));
                Node<Integer> newNode = new Node<>(Math.abs(calc));
                calc = calc + Math.abs(calc);
                newNode.setNext(null);
                runner.setNext(newNode);
                size++;
                runner = runner.getNext();
//                System.out.println(chain);
            }
            if (size % 2 != 0) {
                System.out.println("IN part");
                size++;
                Node<Integer> newNode = new Node<>(0);
                newNode.setNext(null);
                runner.setNext(newNode);
            }
        }
        System.out.println(size);
        System.out.println(calc);

    }

    public static void main(String[] args) {
        System.out.println("T_2023_aviv_B_Q2");

        Node<Integer> lst = new Node<>(2, new Node<>(-4, new Node<>(1, new Node<>(0))));
        System.out.println(lst);
        balance(lst);
        System.out.println(lst);
    }
}
