import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOperations {
    public static void main(String[] args) {
        // Declare a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // a) To Insert the specified element at the specified position.
        linkedList.add(0, 10);

        // b) To Insert specified element at the specified position.
        linkedList.add(1, 20);

        // c) To Insert specified element at First and Last position.
        linkedList.addFirst(5);
        linkedList.addLast(30);

        // d) To Iterate a linked list in reverse order.
        ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());
        System.out.println("Linked list in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        // e) To remove a specified element from a linked list.
        linkedList.remove(Integer.valueOf(20));

        // f) To retrieve, but not remove, the last element of a linked list.
        int lastElement = linkedList.getLast();
        System.out.println("Last element of the linked list: " + lastElement);

        // g) To remove and return the first element of a linked list.
        int firstElement = linkedList.removeFirst();
        System.out.println("Removed first element: " + firstElement);

        // h) To check if a particular element exists in a linked list.
        boolean exists = linkedList.contains(20);
        System.out.println("Does 20 exist in the linked list? " + exists);

        // i) To replace an element in a linked list.
        linkedList.set(1, 25);

        // j) To check if a linked list is empty or not.
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the linked list empty? " + isEmpty);
    }
}
