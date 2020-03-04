package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/*

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
https://leetcode.com/problems/first-unique-character-in-a-string/

 */

public class FirstUniqueCharacter {

    private String string;

    public FirstUniqueCharacter(String string) {
        this.string = string;
    }

    public int findFirstUniqueCharacter() {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : string.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character c : map.keySet()) {
//            System.out.println(map.get(c));
            if (map.get(c) == 1) {
                return string.indexOf(c);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter("eeettccoodde");
        System.out.println(firstUniqueCharacter.findFirstUniqueCharacter());
    }
}
