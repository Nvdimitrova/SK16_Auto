package Tips.ContinueBreak;

public class BreakStatement {
    public static void main(String[] args) {

//        The break statement "jumps out" of a loop.

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}