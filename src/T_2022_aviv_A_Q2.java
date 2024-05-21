import DataStract.Stack;

public class T_2022_aviv_A_Q2 {
    public static void spitStackByAvg(Stack<Integer> stk){

        Stack<Integer> newStack = stk;
        Stack<Integer> lessFromAvg = new Stack<>();
        Stack<Integer> bigFromAvg = new Stack<>();

        int counter = 0;
        int sum = 0;

        while (!newStack.isEmpty()){
            int temp = newStack.pop();
            counter++;
            sum += temp;
            lessFromAvg.push(temp);
        }

        int avg = sum / counter;
        System.out.println("avg for stack is : " +avg);
        while (!lessFromAvg.isEmpty()){
            int temp = lessFromAvg.pop();
            if (temp > avg) {
                bigFromAvg.push(temp);
            }else {
                newStack.push(temp);
            }
        }
        while (!bigFromAvg.isEmpty()){
            newStack.push(bigFromAvg.pop());
        }
    }
    public static void main(String[] args) {
        System.out.println("T_2022_aviv_A_Q2");
        Stack<Integer> stk = new Stack<>();
        stk.push(6);
        stk.push(12);
        stk.push(2);
        stk.push(10);
        stk.push(7);
        stk.push(5);

        System.out.println(stk);
        spitStackByAvg(stk);

        System.out.println("\nstack after split by average");
        System.out.println(stk);
    }
}
