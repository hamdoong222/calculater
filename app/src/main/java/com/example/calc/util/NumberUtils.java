package com.example.calc.util;

public class NumberUtils {


    /**
     * 1 * 9
     * 2 * 9
     * 3 * 9
     * .
     * .
     * .
     * 9 * 9
     *
     * 위 값들이 9칸짜리 배열에 1~9칸에 할당 (9, 18, 27 ... , 81)
     * 생성된 9칸짜리 배열을 return 하는 함수
     */
    public static int[] multiply(){
        int[] result = new int[9];

        for(int i=1 ; i<= 9 ; i++){
            result[i-1] = i * 9;
        }

        return result;
    }
}
