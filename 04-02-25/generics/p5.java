package generics;
import java.util.ArrayList;
import java.util.List;
public class p5 {
	  public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
	        List<T> mergedList = new ArrayList<>();
	        int size1 = list1.size(), size2 = list2.size();
	        int maxSize = Math.max(size1, size2);
	        
	        for (int i = 0; i < maxSize; i++) {
	            if (i < size1) {
	                mergedList.add(list1.get(i));
	            }
	            if (i < size2) {
	                mergedList.add(list2.get(i));
	            }
	        }
	        
	        return mergedList;
	    }
	    
	    public static void main(String[] args) {
	        List<Integer> list1 = List.of(1, 3, 5);
	        List<Integer> list2 = List.of(2, 4, 6, 8);
	        System.out.println("Merged list: " + mergeAlternating(list1, list2)); 
	        
	        List<String> words1 = List.of("apple", "cherry");
	        List<String> words2 = List.of("banana", "date", "elderberry");
	        System.out.println("Merged words: " + mergeAlternating(words1, words2)); 
	    }
	

}
