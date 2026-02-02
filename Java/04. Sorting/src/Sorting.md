Selection sort 
- Idea : Repeatedly find the minimum element from unsorted part and put it at the beginning.
- Algorithm
  For i from 0 to n-1:
  Find minimum element in arr[i..n-1]
  Swap it with arr[i]
- Time complexity : O(n^2) | Space complexity : O(1)
- not stable (equal elements may change order)
- not adaptive (doesn't benefit from partial sorting)
------------------------------------------------------------

Bubble sort
- Idea : Repeatedly swap adjacent elements if they're in wrong order. Larger elements "bubble up" to the end.
- Algorithm
  Repeat n-1 times:
  For i from 0 to n-2:
  If arr[i] > arr[i+1], swap them
- Time complexity : O(n^2) worst/average, O(n) best (if sorted)  | Space complexity O(1)
- Stable (equal elements keep order)
- Adaptive (with optimization)
- Even if the array is already sorted in bubble sorted, still the loop will run and the complexity will be O(n^2) but just to make it little bit optimized, we will check boolean swapped, if it is already sorted, no need to run n - 1 times, just exit the loop and return

-----------------------------------------------------------
DNF (Dutch National Flag algorithm)
approach
- 3 pointers in-place partitioning
  Low pointer (low or left) - Boundary for 0s
  Mid pointer (mid or current) - Current element being examined
  High pointer (high or right) - Boundary for 2s
- Time complexity = O(n)   one pass only
- Space complexity O(1)
- It's a one-pass, in-place algorithm for sorting arrays with 3 distinct values (like 0, 1, 2 in "sort colors").
- We use mid <= high because mid represents the current element being examined, and high represents the boundary for 2s. When mid passes high, it means we've examined all elements. Using low <= high would be incorrect because low only tracks 0s boundary, and it might cross high while we still have unprocessed elements in the middle region