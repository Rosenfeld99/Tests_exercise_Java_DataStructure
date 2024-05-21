package DataStract;


public class Main {


    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.addLast(5);
        l.removeFirst();

        l.addLast(7);
        System.out.println(l);
    }
}
