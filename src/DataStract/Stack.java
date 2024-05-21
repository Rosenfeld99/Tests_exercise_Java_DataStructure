package DataStract;

public class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        this.stack = new LinkedList<>();
    }

    public void push(T value) {
        this.stack.addFirst(value);
    }

    public T pop() {
        return stack.removeFirst();
    }

    public T top() {
        return this.stack.get(0);
    }

    public String toString() {
        return "" + stack;
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }


}
