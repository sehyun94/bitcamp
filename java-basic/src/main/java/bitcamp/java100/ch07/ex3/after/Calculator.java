package bitcamp.java100.ch07.ex3.after;

public class Calculator {

    int result;

    void multipule(int value) {
        this.result *= value;
    }

   void divide(int value) {
        if (value == 0) {
            System.err.println("0으로 나눌 수 없습니다.");
            return;
        }
        this.result /= value;
    }

}