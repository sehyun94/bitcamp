package java100.app.domain;
import java.io.IOException;

import java100.app.control.CSVFormatException;

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
    public Score(String csv) throws CSVFormatException {
        
        String[] rec = csv.split(",");
        if (rec.length < 4) //데이터의 개수가 올바르지 않다면,
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수가 올바르지 않습니다.");
        try {
        this.name = rec[0];
        this.kor = Integer.parseInt(rec[1]);
        this.eng = Integer.parseInt(rec[2]); 
        this.math = Integer.parseInt(rec[3]);
        this.compute();
        
        } catch(Exception e) {
            throw new CSVFormatException(
                    "CSV 데이터 항목의 형식이 올바르지 않습니다.");
        }
    }
    
    public String toCSVStirng() {
        return String.format("%s,%d,%d,%d,%d,%f", 
                this.getName(),
                this.getKor(),
                this.getEng(),
                this.getMath(),
                this.getSum(),
                this.getAver());
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
    

    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + ", sum=" + sum + ", aver="
                + aver + "]";
    }

    private void compute() {
        int sum = 0;
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
   
}
