// 다형성 : 오버라이딩(overriding)
package bitcamp.java100.ch08.ex3;

public class Score2 {
        protected int no;
        protected String name;
        protected int kor;
        protected int eng;
        protected int math;
        protected int sum;
        protected float aver;


        public Score2() {}

        public Score2(int no, String name, int kor, int eng, int math) {
            this.no = no;
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            
            this.compute();
        }
        
        // toString의 재정의
        public String toString() {
            return String.format("[%d,%s,%d,%d,%d,%d,%f]" ,
                    this.no, this.name, this.kor, this.eng, this.math, this.sum, this.aver);
          
        }
        
        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
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

        public int getEng() {
            return eng;
        }

        public void setEng(int eng) {
            this.eng = eng;
            this.compute();
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
            this.compute();
        }

        public int getSum() {
            return sum;
        }

        public float getAver() {
            return aver;
        }
        
        protected void compute () {
            this.sum = this.kor + this.eng + this.math ;
            this.aver = this.sum / 3f;
        }
        
}
