
public class Score {
     String name;
     int kor;
     int eng;
     int math;
     int sum;
     float aver;
     
     Score(String name, int kor, int eng, int math) {
         this.name = name;
         this.kor = kor;
         this.eng = eng;
         this.math = math;
         this.sum = kor + eng + math;
         this.aver = this.sum / 3.0f;
         
     }
}
