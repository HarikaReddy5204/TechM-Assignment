package collections;
import java.util.ArrayList;
public class SearchEle {
	  public static void main(String[] args) {
		  ArrayList<String> colors = new ArrayList<>();
		  colors.add("white");
			colors.add("green");
			colors.add("black");
			colors.add("blue");
	     colors.add("Purple");
	     String searchColor = "blue";
	        if (colors.contains(searchColor)) {
	            System.out.println(searchColor + " is present in the list.");
	        } else {
	            System.out.println(searchColor + " is not in the list.");
	        }
	  }

}
