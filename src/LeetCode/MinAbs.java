package LeetCode;

public class MinAbs {

    private int[] array;

    public MinAbs(int[] array) {
        this.array = array;
    }

    public int result() {

        int firstSum = array[0], secondSum = array[array.length-1];

        for (int i = 1; i < array.length; i ++) {
            System.out.println(firstSum + " " + secondSum);
            if (firstSum > secondSum) {
                secondSum += array[array.length - 1 - i];
            } else {
                firstSum += array[i];
            }
        }

        System.out.println(firstSum + " " + secondSum);

        return 0;
    }

    public static void main(String[] args) {

        MinAbs minAbs = new MinAbs(new int[] {1, 2, 3, 4, 5});
        minAbs.result();

    }

}
