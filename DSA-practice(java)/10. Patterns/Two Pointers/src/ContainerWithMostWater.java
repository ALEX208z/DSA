// LeetCode 11 : Container With Most Water
// https://leetcode.com/problems/container-with-most-water

public class ContainerWithMostWater {

    // Two Pointers (Optimal)
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate current area
            int currentHeight = Math.min(height[left], height[right]);

            int width = right - left;
            int currentArea = currentHeight * width;

            // Update maximum
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer with theh shorted height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }



    // Brute Force
    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        int n = height.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

}
