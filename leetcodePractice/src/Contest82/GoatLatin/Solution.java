package Contest82.GoatLatin;

//824. Goat Latin
//        Virtual User Accepted: 0
//        Virtual User Tried: 0
//        Virtual Total Accepted: 0
//        Virtual Total Submissions: 0
//        Difficulty: Easy
//        A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
//
//        We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
//
//        The rules of Goat Latin are as follows:
//
//        If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
//        For example, the word 'apple' becomes 'applema'.
//
//        If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
//        For example, the word "goat" becomes "oatgma".
//
//        Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
//        For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
//        Return the final sentence representing the conversion from S to Goat Latin.
//
//
//
//        Example 1:
//
//        Input: "I speak Goat Latin"
//        Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
//        Example 2:
//
//        Input: "The quick brown fox jumped over the lazy dog"
//        Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"


import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; ++i) {
            if (isVowel(words[i])) {
                words[i] += "ma";
            } else {
                words[i] = exchange(words[i]) + "ma";
            }
            for (int j = 0; j <= i; j++) {
                words[i] += "a";
            }
        }

        String collect = Arrays.stream(words).collect(Collectors.joining(" "));
        return collect;
    }

    private boolean isVowel(String word) {
        String start = word.substring(0, 1).toLowerCase();
        if (start.equals("a") || start.equals("e") || start.equals("i") || start.equals("o") || start.equals("u")) {
            return true;
        }
        return false;
    }

    private String exchange(String word) {
        return word.substring(1, word.length()) + word.substring(0, 1);
    }
}
