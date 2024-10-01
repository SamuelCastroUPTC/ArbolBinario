public class Node<T> {

    private T info;
    private Node<T> lower;
    private Node<T> higher;

    public Node(T info) {
        this.info = info;
        this.lower = null;
        this.higher = null;
    }

    public void setLower(Node<T> lower) {
        this.lower = lower;
    }

    public void setHigher(Node<T> higher) {
        this.higher = higher;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getLower() {
        return lower;
    }

    public Node<T> getHigher() {
        return higher;
    }

    public T getInfo() {
        return info;
    }


}
