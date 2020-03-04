package LeetCode;

/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.
https://leetcode.com/problems/fizz-buzz/

 */

public class FizzBuzz {

    private int maxNumber;

    public FizzBuzz(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void fizzBuzz() {
        for (int i = 0; i <= maxNumber; i ++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(139);
        fizzBuzz.fizzBuzz();
    }
}

