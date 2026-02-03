package easy;

public class Steps {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper (num/2, steps+1);
        }
        return helper(num-1,steps+1);
    }




    // iterative approach
    public int numberOfSteps2(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            }else {
                num = num - 1;
                steps++;
            }
        }
        return steps;
    }

}
