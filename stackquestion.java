
import java.util.Stack;

public class stackquestion {
    public static void PushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(data, s);
        s.push(top);
    }

    public static void revers(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revers(s);
        PushAtBottom(top, s);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        revers(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
            s.peek();
        }
    }
}
