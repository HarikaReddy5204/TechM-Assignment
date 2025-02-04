package collections;
import java.util.LinkedList;
import java.util.Iterator;
public class IterateLinkedList {
	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	 list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("kiwi");
    list.add("grapes");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}

}
