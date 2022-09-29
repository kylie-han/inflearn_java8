package me.study.java8to11;

public interface RunSomething {

    // 추상메서드가 하나만 있으면 그게 함수형 인터페이스 -> @FunctionalInterface
    // abstract 는 생략 가능
    void doIt();

    // 인터페이스 안에 static method 정의 가능
    static void printName() {
        System.out.println("Jihye");
    }

    // default 메서드도 정의 가능
    default void printAge() {
        System.out.println("27");
    }

}
