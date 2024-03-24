package collectionframeworks;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        Stack stack = new Stack<>();
        stack.push("A");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        //diff b/w peek and pop is peek will just
        //show the top value but dont delete it
        //pop will show the top value and delete it

    }
}
