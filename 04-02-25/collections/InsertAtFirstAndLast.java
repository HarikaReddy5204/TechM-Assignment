package collections;
import java.util.LinkedList;
public class InsertAtFirstAndLast {
	 public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
		 list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        System.out.println("Original LinkedList: " + list);
	        list.addFirst("strawbwerry");
	        list.addLast("grapes"); 
	        System.out.println("After insertion " + list);
	 }
}
