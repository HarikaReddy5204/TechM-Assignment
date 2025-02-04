package collections;
import java.util.ArrayList;
public class FirstPosition {
	   public static void main(String[] args) 
	   {
	 ArrayList<String> colors = new ArrayList<>();
	 colors.add("white");
		colors.add("green");
		colors.add("black");
		colors.add("blue");
     colors.add("Purple");
     colors.add(0, "Orange");
     for (String color : colors) {
         System.out.println(color);
     }
     
     
		

}
}