package com.example.calc;

import java.util.Stack;

public class ButtonInterface {
    public Stack<String> stack = new Stack<>();

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

    /**
     * 숫자 버튼 이외의 버튼이 눌렸을때 호출한다.
     *
     * @param type : 사칙연산과 계산버튼에 대한 타입
     */
    public void onButton(Type type) {
        if (stack.size() != 0 && !Type.contains(stack.lastElement())) {
            stack.add(type.typeString);
        }
    }

    /**
     * 숫자버튼이 눌렸을때 호출한다.
     * @param number : 정수형 숫자
     */
    public void onButton(int number) {
        stack.add(String.valueOf(number));
    }

    /**
     * 버튼이 하나 눌렸을때 마다 호출하여 textView에 수식으로 표시한다.
     * @return : 현재 완성된 수식
     */
    public String getExpression() {
        return stack.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
    }
}