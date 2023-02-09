import java.util.ArrayList;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int largest = nums.get(0);
        int largestIndex = 0;

        int secondLargest = 0;

        // get largest
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
                largestIndex = i;
            }
        }

        // get second largest
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= secondLargest && i != largestIndex) {
                secondLargest = nums.get(i);
            }
        }

        return largest + secondLargest;
    }
}