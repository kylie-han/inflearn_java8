package me.study.java8to11.java3;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        // Integer 타입을 받아 Integer 타입을 리턴하는 함수 인터페이스 R apply(T t)
        Function<Integer, Integer> plus10 = (number) -> number + 10;
        System.out.println(plus10.apply(10));
    }
}
