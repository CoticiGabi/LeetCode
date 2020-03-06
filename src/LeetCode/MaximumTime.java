package LeetCode;

import java.util.Arrays;
import java.util.Collections;

/*

https://leetcode.com/discuss/interview-question/396769/

 */

public class MaximumTime {

    public String showTime(String time) {

        char[] hour = time.split(":")[0].toCharArray();
        char[] minute = time.split(":")[1].toCharArray();

        if ((hour[0] == '?') && (hour[1] == '?')) {
            hour[0] = '2';
            hour[1] = '3';
        }
        if (hour[0] == '?' && hour[1] > '3') {
            hour[0] = '1';
//            System.out.println("AAAA");
        } else if (hour[0] == '?' && hour[1] <= '3'){
            hour[0] = '2';
//            System.out.println("BBBB");
        }
        if (hour[1] == '?' & hour[0] == '2') {
            hour[1] = '3';
//            System.out.println("CCCCC");
        } else if (hour[1] == '?' & hour[0] != '2'){
            hour[1] = '9';
//            System.out.println("DDDDDD");
        }

        if (minute[0] == '?') {
            minute[0] = '5';
        }
        if (minute[1] == '?') {
            minute[1] = '9';
        }

        System.out.println(hour[0]+""+hour[1]+":"+minute[0]+minute[1]);

//        int position = 0;
//        for (Character c : time.toCharArray()) {
//            if (c.equals('c'))
//            System.out.println(c);
//        }

        return "Not possible";
    }

    public static void main(String[] args) {
        MaximumTime maximumTime = new MaximumTime();
        maximumTime.showTime("??:??");
        maximumTime.showTime("?4:5?");
        maximumTime.showTime("?4:??");
        maximumTime.showTime("?3:??");
        maximumTime.showTime("23:5?");
        maximumTime.showTime("2?:22");
        maximumTime.showTime("0?:??");
        maximumTime.showTime("?4:0?");
        maximumTime.showTime("1?:??");
        maximumTime.showTime("??:??");
        maximumTime.showTime("?9:4?");
    }
}
