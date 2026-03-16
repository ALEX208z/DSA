🏗️ The General Template
For Variable Size Window:
java
int left = 0;
for (int right = 0; right < n; right++) {
    // Add element at 'right' to window
    // Update window state
    
    while (/* window is invalid */) {
        // Remove element at 'left' from window
        left++;
    }
    
    // Window is valid, update answer
    // answer = max/min of (right - left + 1)
}
For Fixed Size Window:
java
// Build first window
for (int i = 0; i < k; i++) {
    // Add to window
}

// Slide window
for (int i = k; i < n; i++) {
    // Remove element at i-k
    // Add element at i
    // Update answer
}
💡 When to Use Sliding Window
✅ Perfect for:

- Contiguous subarray/substring problems
- "Maximum/minimum/longest/shortest" with constraints
- Fixed-size window operations

❌ Not suitable for:

- Non-contiguous subsequences
- Problems requiring sorted order within window
- When condition depends on future elements

🎯 Key Takeaways
1. Two pointers, one window - left and right define the window

2. Each element processed twice - Once when added, once when removed

3. O(n) time - Linear time complexity

4. Window validity - Maintain condition with while loop

5. Update answer - After ensuring valid window

Remember: The sliding window pattern turns O(n²) brute force into elegant O(n) solutions by reusing computation from previous windows! 🚀