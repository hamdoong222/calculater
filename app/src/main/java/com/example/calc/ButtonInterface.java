package com.example.calc;

import java.util.ArrayList;

public class ButtonInterface {
    public ArrayList<String> queue = new ArrayList<>();

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
        if (queue.size() != 0 && !Type.contains(queue.get(queue.size() - 1))) {
            queue.add(type.typeString);
        }
    }

    /**
     * 숫자버튼이 눌렸을때 호출한다.
     * @param number : 정수형 숫자
     */
    public void onButton(int number) {
        String item = queue.get(queue.size() - 1);
        try {
            int prevNumber = Integer.parseInt(item);
            queue.remove(queue.size() - 1);
            queue.add(prevNumber + String.valueOf(number));
        } catch (NumberFormatException e) {
            queue.add(String.valueOf(number));
        }
    }

    /**
     * 버튼이 하나 눌렸을때 마다 호출하여 textView에 수식으로 표시한다.
     * @return : 현재 완성된 수식
     */
    public String getExpression() {
        return queue.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
    }
}