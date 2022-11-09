//package NewJava;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static java.util.EnumSet.range;
//
//public class newPractice1 {
//
//    //1. Write a Java Program that reverses a string
//
//    public static String reverseString(String input) {
//        String empty = "";
//
//        for (int i = input.length() - 1; i >= 0; i--) {
//            empty += input.charAt(i);
//        }
//        return empty;
//    }
//
//    public static String reverseString2(String asd) {
//
//        return new StringBuilder(asd).reverse().toString();
//    }
//
//    //2. Write a Java Program to swap two numbers
//
//    public static void swapNumbers(int a, int b) {
//        a += b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    3. Write a Java Program that prints fibonacci number due to given integer (11235811...)
//    public static int fiboNumber(int input) {
//
//        String str = "11";
//        int a = 1;
//        int b = 1;
//        int temp = 0;
//
//        for (int i = 2; i < input; i++) {
//            temp = a + b;
//            str += temp;
//            a = b;
//            b = temp;
//        }
//        return Integer.parseInt(str);
//    }
//
//    //4. Write a Java Program that checks whether given integer is Prime or not
//    public static boolean primeNumber(int input) {
//
//        if (input == 2)
//            return true;
//
//        for (int i = 2; i < input; i++) {
//            if (input % i == 0)
//                return true;
//        }
//        return false;
//
//    }
//
//    //5. Write a Java Program that takes an array and returns the difference between the biggest and the smallest numbers.

//    public static int differenceNumbers(int[] numbers) {
//
//        Arrays.sort(numbers);
//        return numbers[numbers.length - 1] - numbers[0];
//    }

//    //6. Write a Java Program that checks if a String is palindrome or not. (tersten de okunuşu aynı olanlar palindrome)
//    public static boolean isPalindrome(String input) {
//        return input.equals(reverseString2(input));
//
//    }

//    //7. Write a Java Program that checks if given integer is Armstrong number or not (basamaklarındaki rakamlarının küpleri toplamı kendisine eşit olan sayı: 153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27)

//    public static boolean armstrongNumber(int input) {
//        int temp = input;
//        int remainder;
//        int result = 0;

//        while (input != 0) {
//            remainder = input % 10;
//            result += Math.pow(remainder, 3);
//            input = input / 10;
//        }

//        return temp == result;
//    }
//
//    //8. Write a Program that removes the duplicate elements from given list
//    public static List<String> duplicateElements(List<String> input) {
//
//        List<String> list = new ArrayList<>();
//
//        for (String x : input) {
//            if (!list.contains(x)) {
//                list.add(x);
//            }
//        }
//        return list;
//    }
//
//
////9. From a given array find all pairs whose sum is a given number
////    {4, 6, 5, -10, 8, 5, 20} ==> 10
////    For example;  4+6=10, 5+5=10, -10+20=10
////10.Count the words in a String one by one
////    String is "Ali came to school and Ayse came to school"
////    Ali=1, came=2, to=2, school=2, and=1, Ayse=1
//
//
//    //11.Write a Java Program that shows the duplicated characters in a given String
//    public static String duplicatedChars(String input) {
//        String empty = "";
//
//
//        for(int i = 0;i<input.length();i++){
//            for (int j = i+1; j < input.length(); j++) {
//                if(input.charAt(i) == input.charAt(j) ){
//                    empty += input.charAt(i);
//                }
//            }
//
//        }
//        return empty;
//    }
//
//
////1. Write a method that swap two variables' values without using temp variable.
////2. Write a method that checks to see if the words u pass is Anagram.
////3. Write a method that reverses a sentence.
////4. Write a method that sorts an Array int[] without using the sort method.
////5. Write a method that returns how many times each letter is repeated?
////6. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
////7. Write a method that returns nth fibonacci number on given a number num. In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
////8. Write a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
////9. Write a method that checks if the passing argument is a prime number.
////10.Write a method that finds remainder of 2 numbers without using the % operator?
//
//
//
//
//    public static boolean isMyTicketLucky(int ticketNumber){
//
//        int firstDigits = 0;
//        int lastDigits = 0;
//
//        for (int i = 0; i < 6 ; i++) {
//            if(i <= 2){
//                firstDigits += ticketNumber % 10;
//                ticketNumber /= 10;
//
//            }else{
//                lastDigits +=ticketNumber % 10;
//                ticketNumber/=10;
//            }
//        }
//        return firstDigits == lastDigits;
//    }
//
//
////    Create method
////    boolean isMyTicketLucky(? ticketNumber);
////- You need to choose a type of the parameter ticketNumber.
////            - Ticket number is 6-digits number like 123456 or 404404.
////            - The method returns true if sum of the first three digits is equal to sum of the last three digits. If the sums are different the method returns false.
////
//
//
//
//
//    public static boolean isMyTicketLucky1(int ticketNumber){
//
//        int firstDigits = 0;
//        int lastDigits = 0;
//
//        for(int i = 0; i < 6;i++){
//            if(i <= 2){
//                firstDigits+=ticketNumber % 10;
//                ticketNumber/=10;
//            }else{
//                lastDigits+=ticketNumber % 10;
//                ticketNumber/=10;
//            }
//        }
//        return firstDigits == lastDigits;
//    }
//
//
//
//
//
//}
