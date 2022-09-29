package me.study.java8to11;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };
        // 함수형 인터페이스를 구현할 때 쓸 수 있는 '람다' / 위 코드와 동일한 기능
        RunSomething runSomething2 = () -> {
            System.out.println("Hello");
            System.out.println("Jihye");
        };
        RunSomething runSomething3 = () -> System.out.println("Hello");

        runSomething.doIt();
        runSomething2.doIt();
        runSomething3.doIt();

        /**
         * 실제로 자바에서는 특수한 형태의 Object
         * 함수형 인터페이스를 인라인으로 구현한 오브젝트
         * 함수처럼 보이지만 자바는 객체지향 언어이기 때문에 해당 함수형 인터페이스를 변수에 할당하고
         * 메서드의 파라미터로 전달하거나 리턴타입으로 리턴이 가능하다.
         *
         * 이 부분이 함수를 First class object로 사용할 수 있다는 의미임.
         *
         * '함수가 함수를 매개변수로 받을 수 있고, 함수를 리턴할 수도 있다'는 정의의 고차함수에도 해당된다.
         *
         * 함수형 프로그래밍은 입력받은 값이 동일한 경우 항상 같은 결과값을 보장한다.
         *
         *
         */

    }
}
