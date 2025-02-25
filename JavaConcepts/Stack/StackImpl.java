package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {

        //since stack extends vector, stack is also thread safe and implements methods of Deque.
        //stack is last in first out

        Stack<Integer> stackObj = new Stack<>();

        stackObj.add(1);
        stackObj.push(2);
        stackObj.push(3);
        System.out.println(stackObj.peek());
        System.out.println(stackObj.peek());
        System.out.println(stackObj.pop());
        System.out.println(stackObj);
        System.out.println(stackObj.get(1));

    }
}
