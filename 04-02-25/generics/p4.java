package generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class p4 {
	 public static <T> List<T> reverseList(List<T> list) {
	        List<T> reversedList = new ArrayList<>(list);
	        Collections.reverse(reversedList);
	        return reversedList;
	    }
	    
	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	        System.out.println("Reversed numbers: " + reverseList(numbers)); 
	        
	        List<String> words = List.of("apple", "banana", "cherry");
	        System.out.println("Reversed words: " + reverseList(words)); 
	    }

}
