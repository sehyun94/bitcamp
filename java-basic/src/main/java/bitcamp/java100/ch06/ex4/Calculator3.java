package bitcamp.java100.ch06.ex4;

public class Calculator3 {
    
    
    // 계산 결과를 여러 개 개별적으로 관리하기 위해
    // 인스턴스 변수로 전환한다!.
    int result;
    
    void plus(int value) {this.result += value;
    }
    void minus(int value) {this.result -= value;
    }
    void multiple(int value) {this.result *= value;
    }
    void  divide(int value) {this.result /= value;
    }
}
