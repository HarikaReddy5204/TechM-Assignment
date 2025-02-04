package collections;
import java.util.ArrayList;
import java.util.Collections;
public class ShuffleEle {
	 public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("kiwi");
	        list.add("grapes");
	        System.out.println("Original ArrayList: " + list);
	        Collections.shuffle(list);
	        System.out.println("Shuffled ArrayList: " + list);
	 }
}
