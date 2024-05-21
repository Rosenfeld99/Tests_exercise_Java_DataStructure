package DataStract;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;

    public LinkedList() {
        this.head = this.last = null;
        this.size = 0;
    }

    public boolean add(T value) {
        if (last == null) {
            last = head = new Node<>(value);
            size++;
            return true;
        }
        last.setNext(new Node<>(value));
        last = last.getNext();
        size++;
        return true;
    }

    public boolean addLast(T value) {
        return add(value);
    }

    public String toString() {
        return head != null ? head.toString() : null;
    }

    public boolean addFirst(T value) {
        head = new Node<>(value, head);
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean add(T value, int index) {
        if (index == 0) {
            addFirst(value);
            return true;
        }
        if (index == size) {
            addLast(value);
            return true;
        }
        try {
            Node<T> runner = head;
            for (int i = 0; i < index - 1; i++) {
                runner = runner.getNext();
            }
            runner.setNext(new Node<>(value, runner.getNext()));
        } catch (NullPointerException e) {
            System.err.println("error: " + e.getMessage());
        }
        size++;
        return true;
    }

    public T get(int index) {
        try {
            Node<T> runner = head;
            for (int i = 0; i < index; i++) {
                runner = runner.getNext();
            }
            return runner.getValue();
        } catch (NullPointerException e) {
            System.err.println("error: " + e.getMessage());
        }
        return null;
    }

    public T removeFirst() {
        if (this.size == 0) {
            return null;
        }
        if (this.size == 1) last = null;
        Node<T> wasHead = this.head;
        this.head = this.head.getNext();
        wasHead.setNext(null);
        this.size--;
        return wasHead.getValue();

    }


    public Node<T> getHead() {
        return head;
    }

}
