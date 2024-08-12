package com.java.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Solution {
        public static int romanToInt(String str) {  //static method so we can call it without instance

            if (str == null || str.length() == 0)  //checking if the input is null or 0
                return 0;

            Map<Character, Integer> map = new HashMap<Character, Integer>();  //adding elements to the map
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int len = str.length();
            int result = map.get(str.charAt(len - 1));  //initializing the result with the last character

            for (int i = len - 2; i >= 0; i--) {   //processing the characters from right to left
                if (map.get(str.charAt(i + 1)) <= map.get(str.charAt(i)))
                    result = result + map.get(str.charAt(i));
                else
                    result = result - map.get(str.charAt(i));
            }
            return result;
        }
    }
