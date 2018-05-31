package Contest82;

import Contest82.GoatLatin.Solution;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.run();
    }

    public void run() {
        Solution solution = new Solution();
        System.out.println(solution.toGoatLatin("I speak Goat Latin"));
    }
}
