package collections;
import java.util.LinkedList;
public class InsertAtPosition {
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();
		 list.add("Apple");
	    list.add("Banana");
	    list.add("Cherry");
	    list.add("kiwi");
	    list.add("grapes");
	    System.out.println("Original LinkedList: " + list);
	    String newElement = "strawberry";
	    int position = 2;
	    list.add(position, newElement);
	    System.out.println("After adding: " + list);
	}

}
