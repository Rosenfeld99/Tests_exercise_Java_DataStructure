import DataStract.Node;

public class T_2023_summer_A_Q5 {
    public static void buildFreqList(Node<Integer> chain) {
        Node<Integer> current = chain;

        while (current != null) {
            int counter = 0;
            Node<Integer> runner = current;
            while (runner.getNext() != null){
                if (runner.getNext().getValue().equals(current.getValue())) {
                    counter++;
                    runner.setNext(runner.getNext().getNext());
                }else {
                    runner = runner.getNext();
                }
            }
            Node<Integer> newNode = new Node<>(counter + 1);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            current = current.getNext().getNext();
        }
        System.out.println(chain);
    }
    public static int mostPopularNumber(Node<Integer> chain){
        int countNum = chain.getNext().getValue();
        int results = chain.getValue();
        int index = 1;

        while (chain.getNext() != null){
            index++;
            if (index %2 == 0 && chain.getNext().getValue() > countNum) {
                    results = chain.getValue();
            }
            chain = chain.getNext();
        }
        return results;

    }


    public static void main(String[] args) {
        Node<Integer> list = new Node<>(100,
                new Node<>(40,
                        new Node<>(20,
                                new Node<>(100,
                                        new Node<>(100,
                                                new Node<>(20,
                                                        new Node<>(30,
                                                                new Node<>(20, new Node<>(20)))))))));

        System.out.println("Original list:");
        System.out.println(list);

        System.out.println("\nList Frequency:");
        buildFreqList(list);


        System.out.println("\nmostPopularNumber : " + mostPopularNumber(list));

    }
}
