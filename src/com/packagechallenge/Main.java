package com.packagechallenge;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the binary number:");
        String number = scanner.nextLine();

        reverseNumber(number);
        System.out.println("The decimal number: "+ converter(number));
    }

    private static String reverseNumber (String number) {
        StringBuilder input1 = new StringBuilder();
        input1.append(number);
        String reversedNum = String.valueOf(input1.reverse());
        return reversedNum;
    }

    private static int converter(String number) {
        List<Integer> result = new ArrayList<>();
        String [] digits = reverseNumber(number).split("");

        int num = 0;
        for(int i = digits.length-1 ; i >= 0 ; i--) {
            if(digits[i].equals("1")) {
                num = (int)Math.pow(2, i);
                result.add(num);
            }
        }

        int sum = 0;
        for (int i = 0 ; i < result.size() ; i++) {
            sum = sum + result.get(i);
        }
        return sum;
    }
}
