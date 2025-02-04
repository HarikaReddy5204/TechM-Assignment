package collections;
import java.util.ArrayList;
public class RetriveEle {
	public static void main(String[] args) {
		 ArrayList<String> colors = new ArrayList<>();
		 colors.add("white");
			colors.add("green");
			colors.add("black");
			colors.add("blue");
	     colors.add("Purple");
	     colors.add(0, "Orange");
	     int index = 2;
	     String retrievedEle = colors.get(index);
	     System.out.println("Color at index " + index + ": " + retrievedEle);
	}

}
