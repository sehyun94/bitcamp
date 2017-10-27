package java100.app;
import java.util.Scanner;

// ## 캡슐화 적용
// - 모든 필드에 대해  외부 접근을 차단
// 단 자식 클래스에서는 직접 접근할 수 있게 허락한다

//: -init() 메서드 대신 생성자를 이용하여 인스턴스 초기화
// :- print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신 
// : 인스턴스 메서드로 전환한다

public class Score {

    protected String name;
    protected int[] subjects;
    protected int sum;
    protected float aver;

    // : ### 생성자
    // 다른 패키지에서도 호출 할 수 있도록 public 으로 공개한다.
    public Score() {
        // : 생성자란 ? 그 인스턴스를 사용 가능하도록 유효한 상태로 만드는 것
        // : 그래서 이 기본 생성자에서 할 일은 국,영,수 점수를 넣을 수 있도록
        // : subjects에 배열을 만들어 저장하는 것이다.
        this.subjects = new int[3];
    }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] { kor, eng, math };

        this.compute();
        // this.subjects[0] = kor;
        // this.subjects[1] = eng;
        // this.subjects[2] = math;
        // this.subjects = new int[] {kor,eng,math};
        // 이렇게 하면 위의 배열(int[] subjects = new int[3];)이 가비지가 된다.

    }

    private void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float) this.sum / this.subjects.length;
    }

    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", this.name, this.subjects[0], this.subjects[1],
                this.subjects[2], this.sum, this.aver);
    }

    public void input() {
        Scanner keyScan = new Scanner(System.in);

        System.out.print("이름? ");
        this.name = keyScan.nextLine();

        System.out.print("국어점수? ");
        this.subjects[0] = keyScan.nextInt();

        System.out.print("영어점수? ");
        this.subjects[1] = keyScan.nextInt();

        System.out.print("수학점수? ");
        this.subjects[2] = keyScan.nextInt();

        this.compute();
    }

}
