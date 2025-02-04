package collections;
import java.util.LinkedList;
public class InsertAtFront {
	 public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        System.out.println("Original LinkedList: " + list);
	        list.addFirst("grapes");
	        System.out.println("after insertion: " + list);
	 }

}
