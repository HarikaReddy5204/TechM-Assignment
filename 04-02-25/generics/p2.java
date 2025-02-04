package generics;
import java.util.List;
public class p2 {
	  public static <T extends Number> int[] sumEvenOdd(List<T> numbers) {
	        int evenSum = 0;
	        int oddSum = 0;
	        
	        for (T num : numbers) {
	            if (num.intValue() % 2 == 0) {
	                evenSum += num.intValue();
	            } else {
	                oddSum += num.intValue();
	            }
	        }
	        
	        return new int[]{evenSum, oddSum};
	    }
	    
	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        int[] result = sumEvenOdd(numbers);
	        
	        System.out.println("Sum of even numbers: " + result[0]); 
	        System.out.println("Sum of odd numbers: " + result[1]); 
	    }

}
