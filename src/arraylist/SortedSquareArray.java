package arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SortedSquareArray {

    // Time Complexity: O(n) to traverse the main array
    // Space Complexity: O(n) need to create a new int[] array
    public static void main(String[] args)  {
        int[] array = new int[]{-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));
    }

    public static int[] sortedSquaredArray(int[] array) {
        int idx = 0;
        int smallerIdx = 0;
        int largerIdx = array.length - 1;
        int newLargerIdx = array.length - 1;

        int[] newArray = new int[array.length];
        while (idx < array.length) {
            int smallerIndexNum = Math.abs(array[smallerIdx]);
            int largerIndexNum = Math.abs(array[largerIdx]);
            if (smallerIndexNum > largerIndexNum) {
                newArray[newLargerIdx] = smallerIndexNum * smallerIndexNum;
                smallerIdx++;
                newLargerIdx--;
            } else  {
                newArray[newLargerIdx] = largerIndexNum * largerIndexNum;
                largerIdx--;
                newLargerIdx--;
            }
            idx++;
        }
        return newArray;
    }
}
