package java100.app.domain;
import java.util.Scanner;

// ## 캡슐화 적용
// - 모든 필드에 대해  외부 접근을 차단
// 단 자식 클래스에서는 직접 접근할 수 있게 허락한다

//: -init() 메서드 대신 생성자를 이용하여 인스턴스 초기화
// :- print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신 
// : 인스턴스 메서드로 전환한다

public class Score {

    protected String name;
    protected int kor;
    protected int math;
    protected int eng;
    protected int sum;
    protected float aver;

    // : ### 생성자
    // 다른 패키지에서도 호출 할 수 있도록 public 으로 공개한다.
    public Score() { }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        this.compute();
        // this.subjects[0] = kor;
        // this.subjects[1] = eng;
        // this.subjects[2] = math;
        // this.subjects = new int[] {kor,eng,math};
        // 이렇게 하면 위의 배열(int[] subjects = new int[3];)이 가비지가 된다.

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public int getSum() {
        return sum;
    }

    public float getAver() {
        return aver;
    }

    private void compute() {
        int sum = 0;
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
   
}
