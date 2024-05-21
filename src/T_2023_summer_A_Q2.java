import DataStract.BinNode;

public class T_2023_summer_A_Q2 {
    public static void order(BinNode<Integer> chain) {
        BinNode<Integer> runner = chain;
        BinNode<Integer> binOdd = null;
        BinNode<Integer> binEven = null;

        while (runner.getRight() != null) {
            if (runner.getValue() % 2 == 0) {
                binOdd.setValue(runner.getValue());
                binOdd.setRight(null);
            } else {
                binEven.setValue(runner.getValue());
            }
            runner.setValue(null);
        }

    }

    public static void main(String[] args) {
        System.out.println("T_2023_summer_A_Q2 run");
    }
}
