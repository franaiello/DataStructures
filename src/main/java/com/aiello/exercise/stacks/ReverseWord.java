package com.aiello.exercise.stacks;

import java.util.Stack;

public class ReverseWord {
    public static String reverse(String str) {
        Stack s = new Stack();

        // Iterate across each character and pushing onto stack
        for (Character c : str.toCharArray()) {
            s.push(c);
        }

        StringBuffer sb = new StringBuffer();
        while(!s.empty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }
}
