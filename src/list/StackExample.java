package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        // addin the data
        stack1.push(22);
        stack1.push(33);
        stack1.push(12);
        stack1.push(2);
        stack1.push(null);
        System.out.println("stack1 is :"+stack1);

        // removing data
        stack1.pop();
        System.out.println("stack1 after 1st pop : "+stack1);
        stack1.pop();
        System.out.println("stack1 after 2nd pop : "+stack1);
    }
}
