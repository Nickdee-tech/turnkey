import java.util.List;
import java.util.Collections;

public class LargestDifference {
    
    public static int findLargestDifference(List<Integer> numbers) {

        if (numbers == null || numbers.size() < 2) {

            throw new IllegalArgumentException("List must contain at least two integers.");
        }

        int minNumber = Collections.min(numbers);
        int maxNumber = Collections.max(numbers);

        return maxNumber - minNumber;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = List.of(1, 9, 3, 7);
        int largestDifference = findLargestDifference(numbers);
        System.out.println("Largest difference: " + largestDifference);
    }
}
