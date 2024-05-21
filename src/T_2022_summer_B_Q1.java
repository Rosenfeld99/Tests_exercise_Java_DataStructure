import DataStract.Stack;

public class T_2022_summer_B_Q1 {
    public static boolean equalSums(Stack<Integer> stk) {
        Stack<Integer> tempStk = new Stack<>();
        int size = 0;
        while (!stk.isEmpty()) {
            size++;
            tempStk.push(stk.pop());
        }
        if (size % 2 == 0 || tempStk.isEmpty()) return false;


        for (int i = 0; i < size / 2; i++) {
            stk.push(tempStk.pop());
        }

        int centerItem = tempStk.pop();

        while (!tempStk.isEmpty()) {
            if (tempStk.pop() + stk.pop() != centerItem) {
                return false;
            }
        }
        System.out.println("size : " + size + "centerItem : " + centerItem);

        return true;
    }

    public static void main(String[] args) {
        System.out.println("T_2022_summer_B_Q1");
        Stack<Integer> stk = new Stack<>();
        stk.push(7);
        stk.push(22);
        stk.push(10);
        stk.push(12);
        stk.push(21);
        stk.push(25);
        stk.push(4);
        stk.push(13);
        stk.push(15);
        stk.push(3);
        stk.push(18);
        System.out.println(equalSums(stk));
    }
}
