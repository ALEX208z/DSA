package backtracking;


public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}


// isSafe() function - visual check (for position (row)(col))
// 1. Check ABOVE (same column): ↑↑↑
// 2. Check LEFT DIAGONAL: ↖↖↖
// 3. Check RIGHT DIAGONAL: ↗↗↗
// We don't need to check
// - same row (we place only one queen per row)
// - below (rows below are empty)
// - sides (we'll check those when we place queens there)

// Execution Tree :
// solve(board, 0)
//│
//├── Try col=0: isSafe(0,0)=true
//│   │ board[0][0]='Q'
//│   │ solve(board, 1)
//│   │ │
//│   │ ├── Try col=0: isSafe(1,0)=false (same column)
//│   │ ├── Try col=1: isSafe(1,1)=false (diagonal)
//│   │ ├── Try col=2: isSafe(1,2)=true
//│   │ │   board[1][2]='Q'
//│   │ │   solve(board, 2)
//│   │ │   │
//│   │ │   ├── Try col=0: false
//│   │ │   ├── Try col=1: true
//│   │ │   │   board[2][1]='Q'
//│   │ │   │   solve(board, 3)
//│   │ │   │   │
//│   │ │   │   ├── Try col=0: false
//│   │ │   │   ├── Try col=1: false
//│   │ │   │   ├── Try col=2: false
//│   │ │   │   └── Try col=3: false
//│   │ │   │   ← DEAD END! Backtrack
//│   │ │   │
//│   │ │   ← Backtrack: board[2][1]='.'
//│   │ │   ├── Try col=2: false
//│   │ │   ├── Try col=3: true
//│   │ │   │   board[2][3]='Q'
//│   │ │   │   solve(board, 3)
//│   │ │   │   │
//│   │ │   │   ├── Try col=0: false
//│   │ │   │   ├── Try col=1: true
//│   │ │   │   │   board[3][1]='Q'
//│   │ │   │   │   row=4 → PRINT SOLUTION!
//│   │ │   │   │
//│   │ │   │   ← Backtrack
//│   │ │   │
//│   │ │   ← Backtrack
//│   │ │
//│   │ ← Backtrack: board[1][2]='.'
//│   │ ├── Try col=3: ... and so on
//│   │
//│   ← Backtrack: board[0][0]='.'
//│
//├── Try col=1: ... (second solution)
//├── Try col=2: ...
//└── Try col=3: ...


// Key Takeaways:
//One queen per row - simplifies problem
//Check 3 things: Column, left diagonal, right diagonal
//Backtracking = Try → Explore → Undo
//Base case: When row == n (all queens placed)
//Always undo (backtrack) after recursive call