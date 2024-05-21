package DataStract;

public class BinNode<T> {

    private T value;
    private Node<T> right;
    private Node<T> left;

    public BinNode(T value){
        this.value = value;
        this.left=this.right=null;
    }
    public BinNode(T value, Node<T> left,Node<T> right){
        this.value = value;
        this.left=left;
        this.right=right;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }
    public Node<T> getRight() {
        return right;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }


    public String toString(){
        return value+" --> "+right;
    }
}
