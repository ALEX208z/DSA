Recursion notes

if I want to print numbers from 1 - N using Recursion, we need 2 things, base condition and recursive condition.
base case tells when to stop and recursive case tell what to do.



Recursion : A function that calls itself to solve smaller version of the same problem.

--- code ------------------------------------------------------
// Basic structure
returnType recursiveFunction(parameters) {
    // 1. Base Case (stopping condition)
    if (baseCondition) {
    return baseValue;
}

    // 2. Recursive Case (calls itself)
    return recursiveFunction(modifiedParameters);
}

-------------------------------------------------------------------

Golden Rule of Recursion   
- recursive function must have:
1. Base Case : condition to stop recursion
2. Recursive Case : calls itself with smaller input
3. Progress : must move toward base case




Head Recursion - Process then recurse --------------
static void headRecursion(int n) {
if (n == 5) return;      // Base case
System.out.println(n);   // Process FIRST (head)
headRecursion(n + 1);    // Recurse AFTER
}
// Prints: 1,2,3,4 (forward order)


Tail Recursion - Recurse then process ----------------
static void tailRecursion(int n) {
if (n == 0) return;      // Base case
tailRecursion(n - 1);    // Recurse FIRST (tail)
System.out.println(n);   // Process AFTER
}
// Prints: 1,2,3,4 (also forward, but different logic!)