package collections;
import java.util.ArrayList;
public class UpdateEle {
	 public static void main(String[] args) {
		 ArrayList<String> colors = new ArrayList<>();
		 colors.add("white");
			colors.add("green");
			colors.add("black");
			colors.add("blue");
	     colors.add("Purple");
	     int updateIndex = 4;
	     colors.set(updateIndex, "yellow");
	     for (String color : colors) {
	            System.out.println(color);
	        }
	     
	 }
	

}
