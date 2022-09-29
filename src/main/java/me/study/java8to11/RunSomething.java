package me.study.java8to11;

public interface RunSomething {

    // 추상메서드가 하나만 있으면 그게 함수형 인터페이스 -> @FunctionalInterface
    // abstract 는 생략 가능
    int doIt(int number);

}
