package collections;
import java.util.LinkedList;
public class InsertAtEnd {
	 public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        System.out.println("Original LinkedList: " + list);
	        list.addLast("Grapes");

	        System.out.println("After inserting " + list);
	        
	 }

}
