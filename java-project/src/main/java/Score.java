//: -init() 메서드 대신 생성자를 이용하여 인스턴스 초기화
// :- print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신 
// : 인스턴스 메서드로 전환한다

public class Score {
     
            String name;
            //int[] subjects = new int[3];
            int[] subjects;
            int sum;
            float aver;
           
            //: ### 생성자
            Score(String name, int kor, int eng, int math) {
                this.name = name;
                this.subjects = new int[] {kor,eng,math};

                this.compute();
//                this.subjects[0] = kor;
//                this.subjects[1] = eng;
//                this.subjects[2] = math;
                // this.subjects = new int[] {kor,eng,math}; 
                // 이렇게 하면 위의 배열(int[] subjects = new int[3];)이 가비지가 된다.
                
            }
            
            
            void compute() {
                for (int sub :this.subjects) {
                    this.sum += sub;
                }
                this.aver = (float)this.sum / this.subjects.length;
            }
            void print() {
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                        this.name,     
                        this.subjects[0], 
                        this.subjects[1], 
                        this.subjects[2], 
                        this.sum, this.aver);
            }
           
        }