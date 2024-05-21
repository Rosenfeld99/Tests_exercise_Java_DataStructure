import DataStract.Node;

public class T_2023_aviv_B_Q5 {

    public static boolean isSuper(Node<Integer> n) {
        Node<Integer> runner = n;
        int sum = 0;
        while (runner != null) {
            if (sum > runner.getValue()) {
                return false;
            }
            sum += runner.getValue();
            runner = runner.getNext();
        }
        return true;

    }

    public static boolean addToSuper(Node<Integer> n, int num){
        Node<Integer> runner = n;
        int sum = 0;

        while (runner != null){
            sum += runner.getValue();;
            if (num > sum && num > runner.getValue() && num < runner.getNext().getValue()) {
                Node<Integer> newNode = new Node<>(num);
                newNode.setNext(runner.getNext());
                runner.setNext(newNode);
                return true;
            }
            runner = runner.getNext();
        }
        return false;
    }
//     סיבוכיות בסיעיפים א וב הינה (n)O
//    כיוון שבכל מצב אנו עוברים על הרשימה בכל איטרציה פעם אחת בלבד

    public static void main(String[] args) {
        System.out.println("T_2023_aviv_B_Q5");

        Node<Integer> lst = new Node<>(1, new Node<>(3, new Node<>(6, new Node<>(13, new Node<>(27, new Node<>(300, new Node<>(600)))))));
        System.out.println("lst before actions : " +lst);
//        System.out.println(isSuper(lst));
        System.out.println(addToSuper(lst,60));
        System.out.println("lst after action addToSuper : " +lst);

    }
}
