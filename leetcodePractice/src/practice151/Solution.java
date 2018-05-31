package practice151;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String reverseWords(String s) {

        if(s.length() == 0) {
            return "";
        }
        String[] words = s.split("\\s+");
        if (words.length == 0) {
            return "";
        }
        int count = 0;
        if (words[0].length() == 0) {
            count = 1;
        }

        for (int i = 0; i < words.length / 2; ++i) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        String collect = Arrays.stream(words).collect(Collectors.joining(" "));
        if (count == 1) {
            collect = collect.substring(0, collect.length() - 1);
        }
        return collect;
    }
}
