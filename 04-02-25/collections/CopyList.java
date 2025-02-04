package collections;
import java.util.ArrayList;
public class CopyList {
	 public static void main(String[] args) {
		 ArrayList<String> list1 = new ArrayList<>();
		 list1.add("one");
	     list1.add("two");
	     list1.add("three");
	     ArrayList<String> list2 = new ArrayList<>(list1);
	     
	     System.out.println("Original ArrayList" + list1);
	        System.out.println("Copied ArrayList" + list2);
	    }

}
