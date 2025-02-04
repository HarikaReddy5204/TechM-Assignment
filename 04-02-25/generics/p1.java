package generics;
import java.util.Arrays;
public class p1 {
	  public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
	        return Arrays.equals(array1, array2);
	    }

	    public static void main(String[] args) {
	        Integer[] arr1 = {1, 2, 3, 4, 5};
	        Integer[] arr2 = {1, 2, 3, 4, 5};
	        Integer[] arr3 = {1, 2, 3, 4, 6};
	        
	        System.out.println("arr1 and arr2 are equal: " + areArraysEqual(arr1, arr2));
	        System.out.println("arr1 and arr3 are equal: " + areArraysEqual(arr1, arr3)); 
	        
	        String[] strArr1 = {"apple", "banana", "cherry"};
	        String[] strArr2 = {"apple", "banana", "cherry"};
	        String[] strArr3 = {"apple", "cherry", "banana"};
	        
	        System.out.println("strArr1 and strArr2 are equal: " + areArraysEqual(strArr1, strArr2)); 
	        System.out.println("strArr1 and strArr3 are equal: " + areArraysEqual(strArr1, strArr3)); 
	    }
	}