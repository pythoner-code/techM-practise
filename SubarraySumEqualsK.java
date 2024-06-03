import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);
        int count = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (sumCount.containsKey(currentSum - k)) {
                count += sumCount.get(currentSum - k);
            }
            sumCount.put(currentSum, sumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input target sum k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        scanner.close();

        // Calculate and print the result
        int result = subarraySum(nums, k);
        System.out.println("The number of continuous subarrays whose sum equals to " + k + " is: " + result);
    }
}
