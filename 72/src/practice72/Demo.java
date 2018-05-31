package practice72;

import java.util.Comparator;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.run();
    }

    public void run() {
//        Solution solution = new Solution();
//        for (String str: solution.letterCasePermutation("a1b2")) {
//            System.out.println(str);
//        }
        int portNumber = 1337;
        Runnable r = () -> System.out.println(portNumber);

        Comparator<String> c = ( a1,  a2) -> a1.length();
//
//        Function<Integer, Integer> f = x -> x + 1;
//        Function<Integer, Integer> g = x -> x * 2;
//        Function<Integer, Integer> h = f.andThen(g);
//        int result = h.apply(1);

        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.compose(g);
         int result = h.apply(1);
        System.out.println(result);
    }

}
