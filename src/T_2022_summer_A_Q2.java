import DataStract.Stack;

public class T_2022_summer_A_Q2 {
    public static boolean checkStk(Stack<Integer> stk) {
        Stack<Integer> temp = new Stack<>();
        while (!stk.isEmpty()){
            temp.push(stk.pop());
        }
        int sum = 0;

        while (!temp.isEmpty()) {
            int curr = temp.pop();
            System.out.println(curr + " curr : " + sum + " sum : ");
            if (curr < sum) {
                return false;
            }
            sum += curr;
        }
//        must be true
        return true;
    }

    public static void main(String[] args) {
        System.out.println("T_2022_summer_A_Q2");

        Stack<Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(8);
        stk.push(90);
        stk.push(120);
        stk.push(820);

        System.out.println(checkStk(stk));
    }
}
