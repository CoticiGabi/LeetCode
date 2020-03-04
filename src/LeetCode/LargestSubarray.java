package LeetCode;

/*

    https://leetcode.com/discuss/interview-question/352459/

 */


public class LargestSubarray {

    private int[] array;
    private int k;

    public LargestSubarray(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    public void findLargestSubarray() {
        int nrOfSubarrays = array.length - k + 1;
        int max, pos = 0;
        max = array[0];
        for (int j = 0; j < nrOfSubarrays; j ++) {
            if (array[j] > max) {
                max = array[j];
                pos = j;
            }
        }

        for (int i = pos; i < pos + k; i ++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        LargestSubarray largestSubarray = new LargestSubarray(new int[]{1, 4, 9, 2, 5, 0}, 4); // change array to whatever you want
        largestSubarray.findLargestSubarray();
    }
}

