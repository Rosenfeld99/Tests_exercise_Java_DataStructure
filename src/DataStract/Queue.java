package DataStract;

public class Queue<T> {
    private LinkedList<T> stack;

    public Queue() {
        this.stack = new LinkedList<>();
    }

    public void insert(T value) {
        this.stack.addLast(value);
    }

    public T remove() {
        return stack.removeFirst();
    }

    public T head() {
        return this.stack.get(0);
    }

    public String toString() {
        return "" + stack;
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
