package NewJava;


import javax.management.StandardEmitterMBean;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class newPractice2 {
    //1. Write a Java Program that reverses a string
//2. Write a Java Program to swap two numbers
//3. Write a Java Program that prints fibonacci number due to given integer (11235811...)
//4. Write a Java Program that checks whether given integer is Prime or not
//5. Write a Java Program that takes an array and returns the difference between the biggest and the smallest numbers.
//6. Write a Java Program that checks if a String is palindrome or not. (tersten de okunuşu aynı olanlar palindrome)
//7. Write a Java Program that checks if given integer is Armstrong number or not (basamaklarındaki rakamlarının küpleri toplamı kendisine eşit olan sayı: 153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27)
//8. Write a Program that removes the duplicate elements from given list
//9. From a given array find all pairs whose sum is a given number
//    {4, 6, 5, -10, 8, 5, 20} ==> 10
//    For example;  4+6=10, 5+5=10, -10+20=10
//10.Count the words in a String one by one
//    String is "Ali came to school and Ayse came to school"
//    Ali=1, came=2, to=2, school=2, and=1, Ayse=1
//11.Write a Java Program that shows the duplicated characters in a given String


//1. Write a method that swap two variables' values without using temp variable.
//2. Write a method that checks to see if the words u pass is Anagram.
//3. Write a method that reverses a sentence.
//4. Write a method that sorts an Array int[] without using the sort method.
//5. Write a method that returns how many times each letter is repeated?
//6. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
//7. Write a method that returns nth fibonacci number on given a number num. In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
//8. Write a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
//9. Write a method that checks if the passing argument is a prime number.
//10.Write a method that finds remainder of 2 numbers without using the % operator?

    public static String reverseString(String input) {
        String empty = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            empty += input.charAt(i);
        }
        return empty;
    }

    public static String reverseString2(String input) {
        return new StringBuilder(input).reverse().toString();

    }

    public static void swapNumbers(int a, int b) {
        a += b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }

    public static int fiboNumber(int input) {
        String empty = "11";

        int a = 1;
        int b = 1;
        int temp = 0;

        for (int i = 2; i < input; i++) {
            temp = a + b;
            empty += temp;
            a = b;
            b = temp;
        }
        return Integer.parseInt(empty);
    }

    public static boolean primeNumber(int input) {

        if (input == 2)
            return true;

        for (int i = 2; i < input; i++) {
            if (input % 2 == 0) {
                return true;
            }
        }
        return false;

    }

    public static int difference(int[] input) {
        Arrays.sort(input);
        return input[input.length - 1] - input[0];
    }

    public static boolean palindrome(String input) {
        return reverseString(input).equals(input);
    }

//    public static boolean armstrongNumber(int input) {
//        int result = 0;
//        int digits;
//        int temp = input;
//
//        while (input != 0) {
//            digits += input % 10;
//            result += Math.pow(digits, 3);
//            input /= 10;
//
//        }
//
//        return result == temp;
//    }

    public static List<String> duplicate(List<String> input) {
        List<String> empty = new ArrayList<>();
        for (String w : input) {
            if (!empty.contains(w))
                empty.add(w);

        }
        return empty;
    }

    public static void pairs(int[] arr, int sum) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    list.add(arr[i] + "," + arr[j]);
                }
            }
        }
        System.out.println(list);
    }

    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }


    public static boolean anagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();


        char[] a2 = a.toCharArray();
        char[] b2 = b.toCharArray();

        Arrays.sort(a2);
        Arrays.sort(b2);

        boolean result = false;

        if (Arrays.equals(a2, b2))
            result = true;

        return result;
    }


    public static String duplicateChar(String input) {
        char[] arr = input.toCharArray();

        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

                if (count > 1)
                    System.out.println(arr[i]);
            }
        }
        return input;
    }

    //bubble sort

    public static void sortArray(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }


        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static int getRemainder(int num, int divisior){
       return num - divisior*(num/divisior);

    }







}
