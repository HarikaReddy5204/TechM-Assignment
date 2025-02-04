package collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class IterateFromPosition {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		 list.add("Apple");
	    list.add("Banana");
	    list.add("Cherry");
	    list.add("kiwi");
	    list.add("grapes");
	    ListIterator<String> iterator = list.listIterator(2);
	    while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    
	}

}
