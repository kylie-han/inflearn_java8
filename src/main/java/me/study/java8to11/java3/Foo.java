package me.study.java8to11.java3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {
    public static void main(String[] args) {

        Predicate<String> startsWithJihye = s -> s.startsWith("jihye");
        Predicate<Integer> isOdd = integer -> integer%2 != 0;

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
         * T 타입을 받아 아무값도 리턴하지 않는 함수 인터페이스
         *
         * Supplier<T>
         *     T get()
         * T 타입의 값을 제공하는 함수 인터페이스
         *
         * Predicate<T>
         *     boolean test(T t)
         * T 타입을 받아서 boolean 을 리턴하는 함수 인터페이스
         * And, Or, Negate 등의 함수와 조합이 가능하다.
         */
    }
}
