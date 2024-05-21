import DataStract.Node;

public class FibonacciNode {
    public static Node<Integer> createFibonacci(int num) {
        if (num == 0) return null;
        int a = 0,b = 1;

        Node<Integer> fibonacci = new Node<>(1);
        Node<Integer> head = fibonacci;

        for (int i = 0; i < num - 1; i++) {
            Node<Integer> newNode = new Node<>(b + a,null);
            fibonacci.setNext(newNode);
            fibonacci = fibonacci.getNext();
            a = b;
            b = newNode.getValue();

        }
        return head;
    }


    public static void main(String[] args) {
        System.out.println("Fibonacci Node run");
        System.out.println(createFibonacci(15));
    }
}
