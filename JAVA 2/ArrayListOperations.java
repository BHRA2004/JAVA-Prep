import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // a) To insert 5 Elements of string type.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        // b) To insert Element at a specific Index.
        arrayList.add(2, "Blueberry");

        // c) To retrieve an element (at a specified index) from a given array list.
        String elementAtIndex3 = arrayList.get(3);
        System.out.println("Element at index 3: " + elementAtIndex3);

        // d) To update an array element by the given element.
        arrayList.set(4, "Fig");

        // e) To delete Element at a specific Index.
        arrayList.remove(1);

        // f) To search for an element in an array list.
        boolean containsDate = arrayList.contains("Date");
        System.out.println("Array list contains 'Date': " + containsDate);

        // g) To sort the array list.
        Collections.sort(arrayList);

        // h) To reverse elements in an array list.
        Collections.reverse(arrayList);

        // i) To iterate through all the elements of an ArrayList.
        System.out.println("Iterating through all elements:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}