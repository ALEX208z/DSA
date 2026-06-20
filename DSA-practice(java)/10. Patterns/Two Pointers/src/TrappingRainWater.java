// LeetCode 42 : Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water

public class TrappingRainWater {

    // Optimal Approach : Two pointers
    public int trap(int[] height) {
        int left = 0;                      // Left pointer
        int right = height.length - 1;     // Right pointer
        int leftMax = 0;                   // Tallest on left side
        int rightMax = 0;                  // Tallest on right side
        int result = 0;                    // Total water

        while (left < right) {
            // Update maximums
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            // Water trapped is determined by the shorted side
            // The key decision : move the pointer with smaller max
            if (leftMax < rightMax) {
                // Left side is limiting factor
                result += leftMax - height[left];
                left++;    // Move left pointer right
            } else {
                // Right side is limiting factor (or equal)
                result += rightMax - height[right];
                right--;   // Move right pointer left
            }
        }

        return result;
    }



    // Brute Force Approach
    // Time : O(n^2)
    public int trap2(int[] height) {
        int n = height.length;
        int result = 0;

        for (int i = 1; i < n - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // Find maximum on left
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find maximum on right
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            int minHeight = Math.min(leftMax, rightMax);
            if (minHeight > height[i]) {
                result += minHeight - height[i];
            }
        }
        return result;
    }
    // This works, but it's slow : we're doing redundant work by scanning left and right for every element;



    // Prefix/Suffix  - Time : O(n) | Space : O(n)
    public int trap3(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        // 1. Create prefix max array
        int[] prefixMax = new int[n];
        prefixMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
        }

        // 2. Create suffix max array
        int[] suffixMax = new int[n];
        suffixMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1], height[i]);
        }

        // 3. Calculate total water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(prefixMax[i], suffixMax[i]);
            totalWater += minHeight - height[i];
        }

        return totalWater;
    }






}
