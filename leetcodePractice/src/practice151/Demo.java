package practice151;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.run();
    }

    public void run() {
        Solution solution = new Solution();
//        System.out.println(solution.reverseWords(" 1"));
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse("abc"));
    }
}
