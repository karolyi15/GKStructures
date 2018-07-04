package List;

public class SimpleList <T> {

    private  Node<T> root;
    private Node<T> tail;
    private int length;

    public Node<T> getRoot() {
        return root;
    }

    public int getLength() {
        return length;
    }

    private boolean isEmpty(){
        if(root!=null){
            return false;
        }else{
            return true;
        }
    }

    public void add(T data){

        Node<T> newNode=new Node<>(data);

        if(isEmpty()){
            this.root=newNode;
        }else{

        }

        this.length++;
    }

    public void delete(){

    }

    public void get(){

    }
}
