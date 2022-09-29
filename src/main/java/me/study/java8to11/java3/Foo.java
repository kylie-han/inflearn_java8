package me.study.java8to11.java3;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        // Integer 타입을 받아 Integer 타입을 리턴하는 함수 인터페이스 R apply(T t)
        Function<Integer, Integer> plus10 = (number) -> number + 10;
        Function<Integer, Integer> multiply2 = (i) -> i*2;

        // 함수를 조합
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));

        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);
        System.out.println(plus10AndMultiply2.apply(2));
        /**
         * 기본 함수 메서드
         * R apply(T t)
         * Integer 타입을 받아 Integer 타입을 리턴하는 함수 인터페이스
         *
         * 함수 조합용 메서드 -> 고차함수
         * andThen
         * compose
         */
    }
}
