package com.example.calc;

import java.util.Stack;

public class ButtonInterface {
    private Stack<String> stack = new Stack<>();

    public enum Type {
        ADD("+"),
        SUBTRACT("-"),
        MULTIPLE("*"),
        DIVIDE("/"),
        RESULT("=");

        String typeString;
        Type(String typeString) {
            this.typeString = typeString;
        }

        public static boolean contains(String typeString) {
            for (Type type : Type.values()) {
                if (type.typeString.equals(typeString)) {
                    return true;
                }
            }

            return false;
        }
    }

    public void onButton(Type type) {
        if (stack.size() != 0 && !Type.contains(stack.lastElement())) {
            stack.add(type.typeString);
        }
    }

    public void onButton(int number) {
        stack.add(String.valueOf(number));
    }

    public String getExpression() {
        return stack.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
    }
}