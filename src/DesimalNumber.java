import DataStract.Node;

public class DesimalNumber {
    public static int getDesimalNum(Node<Boolean> head){
        System.out.println(head);
        Node<Boolean> runner = head;
        int counter = -1;
        while (runner != null){
            counter++;
            runner= runner.getNext();
        }
        runner = head;
        int sum = 0;
        while (runner != null){
            if (runner.getValue()) {
                sum += Math.pow(2,counter);
            }
            counter--;
            runner=runner.getNext();
        }
        return sum;
    }

    public static int getReversDesimal(Node<Boolean> head){
        Node<Boolean> runner = head;
        int counter = 0;
        int sum = 0;

        while (runner != null) {
            if (runner.getValue()) {
                sum += Math.pow(2,counter);
            }
            counter++;
            runner = runner.getNext();
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("desimal Num");
        Node<Boolean> bin = new Node<>(false,new Node<>(true,new Node<>(false,new Node<>(true,new Node<>(true)))));
//  01011 --> low number
        System.out.println(getDesimalNum(bin));
//  11010 --> high number
        System.out.println(getReversDesimal(bin));
    }
}
