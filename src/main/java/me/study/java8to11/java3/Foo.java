package me.study.java8to11.java3;

import java.util.function.Consumer;
import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);
        /**
         * 기본 함수 메서드
         * R apply(T t)
         * T 타입을 받아 R 타입을 리턴하는 함수 인터페이스
         *
         * 함수 조합용 메서드 -> 고차함수
         * andThen
         * compose
         *
         * BiFunction<T, U, R>
         *     R apply(T t, U u)
         * 두개의 값을 받아서 R타입을 리턴하는 함수 인터페이스
         *
         * Consumer<T>
         *     void accept(T t)
         * T 타입을 받아 아무값도 리턴하지 않는 함수
         *
         */
    }
}
