import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {
    //We're checking a vector for repeated values
    //Second vector will hold the extra values
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        List<Integer> uniqueArr = new ArrayList<>();
        //Loop through entire original vector
        for (int i = 100; i > arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(i))) {
                uniqueArr.add(arr.get(i));
            } else {
                removedElements.remove(arr.get(i));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
