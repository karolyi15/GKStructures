package List;

public class Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> previos;

    public Node(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevios() {
        return previos;
    }

    public void setPrevios(Node<T> previos) {
        this.previos = previos;
    }
}
