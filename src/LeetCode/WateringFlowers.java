package LeetCode;

/*

https://leetcode.com/discuss/interview-question/394347/

 */

public class WateringFlowers {

    public int solution(int[] plants, int capacity1, int capacity2) {

        int refills = 2;
        int can1 = capacity1, can2 = capacity2;

        for (int i = 0; i < plants.length / 2 + 1; i++) {
            if ((i == plants.length / 2) && ((can1 + can2) < plants[i])) {
                refills ++;
            } else {
                if (can1 >= plants[i]) {
                    can1 -= plants[i];
                } else {
                    refills ++;
                    can1 = capacity1;
                    can1 -= plants[i];
                }
                if (can2 >= plants[plants.length - 1 - i]) {
                    can2 -= plants[plants.length - 1 - i];
                } else {
                    refills ++;
                    can2 = capacity2;
                    can2 -= plants[plants.length - 1 - i];
                }
            }
        }

        return refills;
    }


    public static void main(String[] args) {
        WateringFlowers wateringFlowers = new WateringFlowers();
        int solution = wateringFlowers.solution(new int[] {5}, 5, 7);
        System.out.println(solution);
    }
}

