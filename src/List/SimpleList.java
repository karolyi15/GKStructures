package List;

public class SimpleList <T> {

    private  Node<T> root;
    private Node<T> tail;
    private int length;


    public int getLength() {
        return length;
    }

    public Node<T> getRoot() {
        return root;
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
            this.tail=newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }

        this.length++;
    }

    public void delete(T data) {

        if (isEmpty()) {
            return;

        } else {

            Node<T> current = this.root;
            if(current.getData()==data){
                this.root=this.root.getNext();
                current.setNext(null);
            }else{
                while(current.getNext()!=null){
                    if(current.getNext().getData()==data){
                        Node<T> tempNode=current.getNext();
                        current.setNext(tempNode.getNext());
                        tempNode.setNext(null);
                    }else{
                        current=current.getNext();
                    }
                }
            }
            this.length--;
        }
    }

    public T get(int index) {

        if(index>this.length){
            return null;
        }else{

            Node<T> current=this.root;
            for(int counter=0;counter<index;counter++){
                current=current.getNext();
            }
            return current.getData();
        }

    }




}
