package com.aiello.exercise.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParseDelimiters {

    public static boolean parseString(String str) {
        Stack s = new Stack();
        Boolean delimitersMatch = false;

        Map<Character, Character> map = loadDelimiters();

        for (Character c : str.toCharArray()) {
            if (c.equals('{') || c.equals('(') || c.equals('[')) {
                s.push(c);
            } else {
                // If character is a closing delimiter - then it is time to find corresponding opening delimiter
                if (c.equals(']') || c.equals(')') || c.equals('}')) {
                    // Pop of delimiter from stack
                    Character openingDelimiter = (Character) s.pop();
                    // Retrieve respective closing delimiter
                    Character closingDelimiter = map.get(openingDelimiter);

                    if (!c.equals(closingDelimiter))
                        // The two don't match - no need to continue
                        break;
                }
            }
        }


        // If the stack is empty then we are at the end and need to determine if delim
        if (s.empty())
            delimitersMatch = true;

        return delimitersMatch;

    }


    private static Map<Character, Character> loadDelimiters() {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        return map;
    }

}
