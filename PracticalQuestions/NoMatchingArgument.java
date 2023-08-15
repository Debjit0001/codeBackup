package PracticalQuestions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NoMatchingArgument {
    static float sum(float a, float b) {
        return a+b;
    }

    static int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        String s = "asfd";

        System.out.println(sum(7, 8));
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 100);
        int a = map.get('I');
        System.out.println(a);
        Queue<Integer> queue = new LinkedList();
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        System.out.println(stack.peek());
    }

}
