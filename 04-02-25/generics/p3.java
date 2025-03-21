package generics;
import java.util.List;
public class p3 {
	public static <T> int findFirstIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 30);
        System.out.println("Index of 30: " + findFirstIndex(numbers, 30)); 
        System.out.println("Index of 60: " + findFirstIndex(numbers, 60)); 
        
        List<String> words = List.of("apple", "banana", "cherry", "date");
        System.out.println("Index of 'cherry': " + findFirstIndex(words, "cherry")); 
        System.out.println("Index of 'grape': " + findFirstIndex(words, "grape")); 
    }

}
