package collections;
import java.util.LinkedList;
public class FirstLastOccurance {
	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Apple");
	        list.add("Date");
	        list.add("Cherry");
	        String element = "Apple";
	        int firstOccurrence = list.indexOf(element);
	        int lastOccurrence = list.lastIndexOf(element);
	        System.out.println("First occurrence " + firstOccurrence);
	        System.out.println("Last occurrence " + lastOccurrence);
	}

}
