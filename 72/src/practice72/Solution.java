package practice72;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>(Arrays.asList(S));
        for (int i = 0; i < S.length(); ++i) {
            for (int j = 0, sz = ans.size(); S.charAt(i) > '9' && j < sz; ++j) { // S.charAt(i) > '9': letter, not digit.
                char[] ch = ans.get(j).toCharArray();
                ch[i] += S.charAt(i) < 'a' ? 'a' - 'A' : 'A' - 'a'; // toggle case of charAt(i).
                ans.add(String.valueOf(ch));
            }
        }
        return ans;
    }
}
