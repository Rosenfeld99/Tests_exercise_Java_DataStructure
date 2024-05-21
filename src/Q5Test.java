import DataStract.Node;

public class Q5Test {
    public static int distance(Node<Integer> lst, int num) {
        Node<Integer> runner = lst;
        int start = 0;
        int end = 0;
        boolean found = false;

        while (runner.getNext() != null) {
            if (runner.getValue() != num) {
                start += 1;
            } else if (runner.getValue() == num) {
                found = true;
                break;
            }
            runner = runner.getNext();
        }
        while (runner.getNext() != null) {
            if (runner.getValue() != num) {
                end += 1;
            } else if (runner.getValue() == num) {
                found = true;
                end = 0;
            };
            runner = runner.getNext();
        }
        return found ? start + end + 1 : -1;
    }

    public static int minDistanceValue(Node<Integer> lst) {
        Node<Integer> runner = lst;
        int min = distance(lst, runner.getValue());
        runner = runner.getNext();
        int numRes = runner.getValue();

        while (runner != null) {
            int res = distance(lst, runner.getValue());
            if (res < min) {
                min = res;
                numRes = runner.getValue();
            }
            runner = runner.getNext();
        }
        System.out.println(lst);
        return numRes;
    }

    public static void main(String[] args) {
        System.out.println("Q5 test run");
        Node<Integer> n = new Node<>(4,
                new Node<>(9,
                        new Node<>(3,
                                new Node<>(7,
                                        new Node<>(9,
                                                new Node<>(9,
                                                        new Node<>(7,
                                                                new Node<>(7,
                                                                        new Node<>(2,
                                                                                new Node<>(9))))))))));


        System.out.println(distance(n, 7));
        System.out.println(n);
        System.out.println(minDistanceValue(n));
    }
}
