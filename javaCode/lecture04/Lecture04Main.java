package javaCode.lecture04;

public class Lecture04Main {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(1_000L);

        System.out.println(money1.plus(money2));
    }

}