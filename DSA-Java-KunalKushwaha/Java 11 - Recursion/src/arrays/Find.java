package arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6};
        int target = 4;
        System.out.println(search(nums,target));

        System.out.println(find(nums,4,0));
        System.out.println(findIndex(nums,4,0));
        System.out.println(findIndexFromLast(nums,target,nums.length-1));
//        findAllIndex(nums,4,0);
//        System.out.println(list);

        ArrayList<Integer> ans = findAllIndex(nums, 4, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(findAllIndex2(nums, 4, 0));

    }

    // Iterative approach
    static int search(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr,target,index+1);
        }
    }

    static int findIndexFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexFromLast(arr, target, index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }


    // don't use this approach as we are creating new objects again and again
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }




}
