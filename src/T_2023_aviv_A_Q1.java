import DataStract.Queue;

public class T_2023_aviv_A_Q1 {
//    Part A
    public static Queue<Double> averageQueue(Queue<Integer> marks,
                                             Queue<Integer> tests) {

        Queue<Double> qAvg = new Queue<>();

        while (!tests.isEmpty()){
            int currTests = tests.head();
            double sumAvg = 0;
            while (currTests != 0){
                sumAvg += marks.remove();
                currTests--;
            }
            qAvg.insert(sumAvg / tests.remove());
            sumAvg = 0;
        }

        return qAvg;
    }
// Part B --> what is complicate of averageQueue ?
//    answer : the complicate is o(n2) ,because we run on marks by tests and we run on all tests;
    public static void main(String[] args) {
        System.out.println("T_2023_aviv_A_Q1");

        Queue<Integer> marks = new Queue<>();
        marks.insert(94);
        marks.insert(88);
        marks.insert(96);
        marks.insert(97);
        marks.insert(100);
        marks.insert(100);
        marks.insert(96);
        marks.insert(75);
        marks.insert(100);
        marks.insert(90);
        marks.insert(80);

        Queue<Integer> tests = new Queue<>();
        tests.insert(2);
        tests.insert(4);
        tests.insert(2);
        tests.insert(3);

        System.out.println("marks : " + marks);
        System.out.println("tests : " + tests);
        System.out.println("average Queue : " + averageQueue(marks,tests));
    }

}
