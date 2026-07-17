import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.addFirst(12);
        linkedList.addLast(21);
        linkedList.remove(2);
        System.out.println(linkedList);

    }
}
