package me.study.java8to11;

public class Foo {
    public static void main(String[] args) {
    }
    public static void pureFunction() {
        RunSomething runSomething = (number) -> number + 10;
        // 함수형 인터페이스를 인라인으로 구현한 오브젝트

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));

        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));

    }
    public static void 외부값참조() {
        // 상태값을 갖고 상태값에 의존한다.

        int baseNumber = 10; // !

        RunSomething runSomething = new RunSomething() {
            int baseNumber2 = 100; // !
            @Override
            public int doIt(int number) {
                return number + baseNumber + baseNumber2;
            }
        };
    }
    public static void 외부값변경() {
        // 상태값을 갖고 상태값에 의존한다.

        // 이 값은 final 이라고 가정하고 사용한다.
        int baseNumber = 10;

        RunSomething runSomething = new RunSomething() {
            int baseNumber2 = 100;
            @Override
            public int doIt(int number) {
                baseNumber2++; // !
                // baseNumber++; // 문법적으로 불가능
                return number + baseNumber + baseNumber2;
            }
        };
    }

        /**
         * 실제로 자바에서는 특수한 형태의 Object 를 이용해 함수형 프로그래밍이 가능하다.
         * 함수형 인터페이스를 사용하는 것.
         *
         * 함수를 (First class object)로 사용할 수 있다
         * 함수처럼 보이지만 자바는 객체지향 언어이기 때문에 해당 함수형 인터페이스를 변수에 할당하고
         * 메서드의 파라미터로 전달하거나 리턴타입으로 리턴이 가능하다.
         *
         * '함수가 함수를 매개변수로 받을 수 있고, 함수를 리턴할 수도 있다'는 정의의 (고차함수)에도 해당된다.
         *
         * 함수형 프로그래밍은 입력받은 값이 동일한 경우 항상 같은 결과값을 보장한다.(순수함수)
         * 입력값이 같을 때 결과값을 다르게 만드는 요인들은
         * 함수안에서 함수 밖의 값을 참조하는 경우!
         * 외부의 값을 변경하는 경우!
         */

    }
}
