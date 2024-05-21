import DataStract.Node;

public class Q5 {
    public static int distance(Node<Integer> lst, int num) {
        int start = 0;
        int end = 0;
        boolean isFound = false;
        Node<Integer> runner = lst;
        while (runner.getNext() != null) {
            if (runner.getValue() == num) {
                isFound = true;
                break;
            } else {
                start++;
            }
            runner=runner.getNext();
        }

        while (runner.getNext() != null) {
            if (runner.getValue() == num) {
                end = 0;
                isFound = true;
            } else end++;
            runner=runner.getNext();
        }
//        check last node
        if (runner.getValue() == num) end=0;
        else end++;

        return isFound ? start + end : -1;
    }

    public static int minDistanceValue(Node<Integer> lst){
        Node<Integer> runner = lst;
        int min = distance(lst,runner.getValue());
        int result = runner.getValue();
        runner=runner.getNext();

        while (runner.getNext() != null){
            int temp = distance(lst, runner.getValue());
            if (temp < min ) {
                min = temp;
                result = runner.getValue();
            }
            runner=runner.getNext();
        }
        return result;
    }
//    the complicad for A patr is o(n) && for part B is o(n^2);

    public static void main(String[] args) {
        System.out.println("Q5 is run");
        Node<Integer> n = new Node<>(4, new Node<>(9, new Node<>(3, new Node<>(7, new Node<>(9, new Node<>(9, new Node<>(7, new Node<>(7, new Node<>(2, new Node<>(9))))))))));
        System.out.println(n);
        System.out.println(distance(n,7));
        System.out.println(minDistanceValue(n));
    }
}