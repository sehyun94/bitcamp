// 캡슐화 활용 - 메서드를 private으로?

package bitcamp.java100.ch08.ex1;


class Score4{
    String name;
    private int kor;
    private int eng;
    private int math;
    
    private int sum;
    private float aver;
    
    
    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getKor() {
        return kor;
    }

   
    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }
    public int getEng() {
        return eng;
    }
   
    public void setMath(int math) {
        this.math = math;
        this.compute();
    }
    public int getMath() {
        return math;
    }
    
    
    private void compute() {
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

public class Test8_4 {
    public static void main(String[] args) {

        Score4 s = new Score4();
        s.name = "홍길동";
        s.setKor(100);
        s.setEng (90);
        s.setMath(80); 
        
        
//        s.sum = 280;
//        s.aver = s.sum / 3f;
        // 셋터를 통해 국,영,수 점수를 저장할 때마다 자동으로 계산되기 때문에 compute()를 따로 호출할 필요가 없다
//        s.compute();
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());

        // 한 과목의 점수를 바꾸더라도 자동으로 한계와 평균이 다시 계산된다.
        s.setEng(50);
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
    }

}











