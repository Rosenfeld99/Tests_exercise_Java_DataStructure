import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Queue<Integer> marks = new LinkedList<>();
        marks.add(80);
        marks.add(90);
        marks.add(100);
        marks.add(75);
        marks.add(96);
        marks.add(100);
        marks.add(100);
        marks.add(97);
        marks.add(96);
        marks.add(88);
        marks.add(94);

        Queue<Integer> tests = new LinkedList<>();
        tests.add(3);
        tests.add(2);
        tests.add(4);
        tests.add(2);

        Queue<Double> average = averageQueue(marks, tests);

        System.out.println(average);
    }

    public static Queue<Double> averageQueue(Queue<Integer> marks, Queue<Integer> tests) {
        Queue<Double> averages = new LinkedList<>();

        // Calculate average for each student
        while (!marks.isEmpty() && !tests.isEmpty()) {
            int totalMarks = 0;
            int numTests = tests.poll(); // Get number of tests for current student

            for (int i = 0; i < numTests; i++) {
                totalMarks += marks.poll(); // Accumulate marks for each test
            }

            // Calculate average for current student and add to result Queue
            double average = totalMarks / numTests;
            averages.add(average);
        }

        return averages;
    }
}
