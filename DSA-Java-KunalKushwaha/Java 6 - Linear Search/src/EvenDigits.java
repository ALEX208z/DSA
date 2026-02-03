public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        if (nums == null || nums.length == 0){
            return -1;
        }
        int count = 0;
        for (int x : nums){
            if(String.valueOf(x).length() % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
}
