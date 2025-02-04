package collections;
import java.util.LinkedList;
public class AppendToLinkedList {
	 public static void main(String[] args) {
	 LinkedList<String> list = new LinkedList<>();
	 list.add("Apple");
     list.add("Banana");
     list.add("Cherry");
     list.add("kiwi");
     list.add("grapes");
     
     System.out.println("Original LinkedList: " + list);
     list.add("mango");
     System.out.println("LinkedList after appending "+ list);
}
}
