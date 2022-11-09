package Hacerrank;

import java.lang.reflect.Array;
import java.util.*;

public class Practice {
    //split method bir  stringi ayri kelimeler halinde arraye donusturur
    // Arraylist<Integer> list = new Arraylist<>();
    //HashMap<Integer,String>hm1=new HashMap<>();

    //cat,tac,tca vs.
    public static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] arr = a.toCharArray();
        char[] arr1 = b.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        boolean res = false;


        if (Arrays.equals(arr, arr1))
            res = true;


        return res;
    }

    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }

        }

        return list;

    }


    //Two Sum with hashmap

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] =map.get(target - nums[i]);
            }
            map.put(nums[i],i);
        }

        return result;
    }


    public static int romanToInt(String s){

        int numbers[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'M':

                    numbers[i]=1000;
                    break;
                case 'D':
                    numbers[i]=500;
                    break;
                case 'C':
                    numbers[i]=100;
                    break;
                case 'L':
                    numbers[i]=50;
                    break;
                case 'X' :
                    numbers[i]=10;
                    break;
                case 'V':
                    numbers[i]=5;
                    break;
                case 'I':
                    numbers[i]=1;
                    break;
            }
        }
        int sum=0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]<numbers[i+1])
                sum-=numbers[i];
            else
                sum+=numbers[i];
        }
        return sum+numbers[numbers.length-1];

        //fibo number



        }


}

