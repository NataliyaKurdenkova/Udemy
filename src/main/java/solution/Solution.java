package solution;

import static java.lang.Integer.bitCount;

class Solution {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4};
//        int arr[] = {2, 7, 11,15};
//        int arr[] = {3,3};
      //  int[]a=twoSum(arr, 6);

       // System.out.println("["+a[0]+","+a[1]+"]");
        System.out.println(isPowerOfTwo(3));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }

        }
        return a;
    }



    public static boolean isPowerOfTwo(int value) {

        value = Math.abs(value);
        if(bitCount(value)==1)return true;

        return false; // you implementation here
    }
}