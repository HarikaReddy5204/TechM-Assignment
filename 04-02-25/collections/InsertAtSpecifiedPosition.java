package collections;
import java.util.LinkedList;
public class InsertAtSpecifiedPosition {
	 public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        System.out.println("Original LinkedList: " + list);
	        String newElement1 = "grapes";
	        String newElement2 = "mango";
	        int position = 2; 
	        list.add(position, newElement1); 
	        list.add(position + 1, newElement2); 
	        System.out.println("After Inserting: " + list);
	        
	 }

}
