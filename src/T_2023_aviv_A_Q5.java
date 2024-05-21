import DataStract.Node;

public class T_2023_aviv_A_Q5 {
//    Part A
    public static int distance(Node<Integer> lst, int num) {
        int startCounter = 0;
        int endCounter = 0;
        boolean flagOfNum = false;

        Node<Integer> runner = lst;

        while (runner != null) {
            if (runner.getValue() == num) {
                flagOfNum = true;
                runner = runner.getNext();
                break;
            } else {
                startCounter++;
                runner = runner.getNext();
            }
        }
        if (!flagOfNum) return -1;
        else {
            while (runner != null) {
                if (runner.getValue() == num) {
                    endCounter = 0;
                } else {
                    endCounter++;
                }
                runner = runner.getNext();
            }
        }
        return startCounter + endCounter;
    }
//    Part B
    public static int minDistanceValue(Node<Integer> lst) {
        Node<Integer> runner = lst;
        int smallerSpace = distance(runner, runner.getValue());
        int value = runner.getValue();
        while (runner != null) {
            int res = distance(runner, runner.getValue());
            if (res < smallerSpace) {
                value = runner.getValue();
                smallerSpace = res;
            }
            runner = runner.getNext();
        }
        return value;
    }
//    Part C --> what is complicate of Part A abd Part B
//    answer --> Part A is complicate of o(n) --> Part B is o(n2)

    public static void main(String[] args) {
        System.out.println("T_2023_aviv_A_Q5");
// Node list of --> 4 9 3 7 9 9 7 7 2 9
        Node<Integer> n = new Node<>(4, new Node<>(9, new Node<>(3, new Node<>(7, new Node<>(9, new Node<>(9, new Node<>(7, new Node<>(7, new Node<>(2, new Node<>(9))))))))));
        System.out.println("List : " + n);
//        System.out.println(distance(n, 3));
        System.out.println(minDistanceValue(n));
    }
}
