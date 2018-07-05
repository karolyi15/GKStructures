import List.Node;
import List.SimpleList;

public class main {

    public static void main(String args[]){

        SimpleList<Integer> list=new SimpleList<>();
        list.add(3);
        list.add(34);
        list.add(99);
        list.delete(99);
        display(list);
        System.out.println("get data:"+list.get(98));

    }

    public static void display(SimpleList list){

        System.out.println("*****List******");
        Node tempNode=list.getRoot();
        for(int counter=0;counter<list.getLength();counter++){

            System.out.print(tempNode.getData()+" ");
            tempNode=tempNode.getNext();
        }
        System.out.println("Length:"+list.getLength());
    }
}
