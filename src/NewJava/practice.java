package NewJava;

import java.util.ArrayList;
import java.util.List;

public class practice {

    //8. Write a Program that removes the duplicate elements from given list

    public static List<Object> duplicate(List<Object> input) {

        List<Object> newInput = new ArrayList<>();

        for (Object w : input) {
            if (!newInput.contains(w)) {
                newInput.add(w);
            }
        }
        return newInput;
    }












}
