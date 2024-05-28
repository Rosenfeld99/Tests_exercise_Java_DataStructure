import DataStract.Queue;
import DataStract.Stack;

public class T_2023_aviv_A_Q_10 {
    public static boolean isPerfect(Queue<Stack<Integer>> q) {
        int lengthOfCurrStack = 0;
        int lengthOfLastStack = 0;
        int headOfStack = 0;
        int lastValueCurrStack = 0;

        int sum = 0;
        while (!q.isEmpty()) {
            System.out.println(sum += 1);
            Stack<Integer> runner = q.remove();
            if (lastValueCurrStack != headOfStack) {
                System.out.println("line 15 lastValueCurrStack != headOfStack : , lastValueCurrStack :" + lastValueCurrStack + "headOfStack : " + headOfStack);
                return false;
            }
            headOfStack = runner.top();
            while (!runner.isEmpty()) {
                int currRunner = runner.pop();
                if (headOfStack > currRunner) {
                    System.out.println("line 22 headOfStack > currRunner");
                    return false;
                }
                lengthOfCurrStack++;
                lastValueCurrStack = currRunner;
            }
            if (lengthOfLastStack == 0) {
                lengthOfLastStack = lengthOfCurrStack;
            } else {
                if (lengthOfLastStack > lengthOfCurrStack) {
                    System.out.println("line 32 lengthOfLastStack > lengthOfCurrStack");
                    return false;
                } else {
                    lengthOfLastStack = lengthOfCurrStack;
                    lengthOfCurrStack = 0;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("T_2023_aviv_A_Q_10");

        Stack<Integer> lst1 = new Stack<>();
        lst1.push(800);
        lst1.push(700);
        lst1.push(500);
        lst1.push(300);
        lst1.push(200);
        lst1.push(180);
        lst1.push(130);
        lst1.push(150);

        Stack<Integer> lst2 = new Stack<>();
        lst2.push(115);
        lst2.push(112);
        lst2.push(118);
        lst2.push(100);
        lst2.push(90);
        lst2.push(80);
        lst2.push(70);

        Stack<Integer> lst3 = new Stack<>();
        lst3.push(70);
        lst3.push(65);
        lst3.push(60);
        lst3.push(36);
        lst3.push(20);
        lst3.push(15);

        Stack<Integer> lst4 = new Stack<>();
        lst4.push(15);
        lst4.push(14);
        lst4.push(12);
        lst4.push(10);
        lst4.push(7);

        Stack<Integer> lst5 = new Stack<>();
        lst5.push(7);
        lst5.push(3);
        lst5.push(2);

        Queue<Stack<Integer>> q = new Queue<>();

        q.insert(lst5);
        q.insert(lst4);
        q.insert(lst3);
        q.insert(lst2);
        q.insert(lst1);

//        System.out.println(q);
        System.out.println("results : " + isPerfect(q));
        ;
    }
}
