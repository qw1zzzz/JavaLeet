package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 11, 7};
        int target = 9;
        int[] twoSum = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                }
            }
        }
        System.out.printf(Arrays.toString(twoSum));
    }
}
