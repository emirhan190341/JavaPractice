package Hacerrank;

import java.util.HashMap;
import java.util.Map;

public class hashMap01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(100,"Emirhan");
        hm1.put(101,"Furkan");
        hm1.put(102,"Elif");
        hm1.put(103,"Resat");
        System.out.println(hm1);
        System.out.println(hm1.get(100)); //listlerde indexlere bakarken maplarde keyleri giriyoruz.
        System.out.println(hm1.keySet());
        System.out.println(hm1.containsKey(101));

        Map<String,Integer> hm2 = new HashMap<String,Integer>();
        hm2.put("I",1);
        hm2.put("V",5);
        System.out.println(hm2.get("I") + hm2.get("V"));
        String s ="III";
        for (int i = 0; i < s.length() ; i++) {
            System.out.println(s.charAt(i));
        }





    }


}
