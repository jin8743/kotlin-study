package javaCode.lecture15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lecture15Main {

    public static void main(String[] args) {
        int[] arr = {100, 200};

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s %s", i, arr[i]);
        }

        final List<Integer> numbers = Arrays.asList(100, 200);

        Map<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "MONDAY");
        oldMap.put(2, "TUESDAY");

        Map<Integer, String> map = Map.of(1, "MONDAY", 2, "TUESDAY");
    }
}
