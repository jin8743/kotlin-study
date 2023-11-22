package lecture05;

public class Lecture05Main {

    public static void main(String[] args) {
    }

    private String getPassOrFail(int score) {
        if (score >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    private boolean startsWithA(Object o) {
        if (o instanceof String) {
            return ((String) o).startsWith("A");
        } else {
            return false;
        }
    }

    private void judgeNumber(int number) {
        if (number == 1 || number == 0 || number == -1) {
            System.out.println("어디서 많이본 숫자 입니다");
        } else {
            System.out.println("1, 0, -1이 아닙니다");
        }
    }

    private void judgeNumber2(int number) {
        if (number == 0) {
            System.out.println("주어진 숫자는 0입니다");
            return;
        }

        if (number % 2 == 0) {
            System.out.println("주어진 숫자는 짝수입니다");
            return;
        }

        System.out.println("주어지는 숫자는 홀수입니다");
    }
}

