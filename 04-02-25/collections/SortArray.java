package collections;
import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
	 public static void main(String[] args) {
		 ArrayList<String> colors = new ArrayList<>();
		 colors.add("white");
			colors.add("green");
			colors.add("black");
			colors.add("blue");
	     colors.add("Purple");
	     System.out.println("Original list: " + colors);
	     Collections.sort(colors);
	     System.out.println("Sorted list: " + colors);
	 }

}
