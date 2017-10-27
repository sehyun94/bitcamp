// 캡슐화 활용 - 접근 제한하기

package bitcamp.java100.ch08.ex1;


class Score2{
    String name;
    int kor;
    int eng;
    int math;
    
    private int sum;
    private float aver;
    
    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

    public int getSum() {
        return this.sum;
    }
    
    public float getAver() {
        return this.aver;
    }
}

public class Test8_2 {
    public static void main(String[] args) {

        Score2 s = new Score2();
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        
        
//        s.sum = 280;
//        s.aver = s.sum / 3f;
        s.compute();
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());

        //만약 점수를 바꾼다면 ?
        s.eng = 50;
        
        // 다시 계산해야 한다 .
        s.compute();
        
        //값을 바꿀 때 자동으로 계산하는 방법은 ??
        // => 현재의 코드 상황으로는 없다!
        // => 혹시 이런 경우를 대비해서 우리는 셋터를 만드는 것이다.!
        
    }

}











