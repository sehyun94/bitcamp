// ## 사용자 정의 데이터 타입 만들기
package bitcamp.java100;

public class Test14_3{

    public static void main(String[] args)  {
 // 사용자 데이터 타입 정의하기
 // 비트캠프의 수강생 정보를 저장할 데이터 타입
 //1) 설계도 작성
        class Student {
            String name;
            String tel;
            boolean gender;
            String schoolLevel;
            String schloolName;
            boolean working;
            int age;
            String postNo;
            String basicAddr;
            String detailAddr;
            String createdDate;
        }
 //2) 새 데이터 타입에 따라 만든 메모리의 주소를 저장할 변수 선언
     Student s1; 

//3) 사용자가 새로 정의한 데이터 타입에 따라 메모리를 준비하기
        s1 = new Student(); 
        
//4) 레퍼런스를 사용하여 새 메모리에 값 넣기
        s1.name = "홍길동";
        s1.tel = "1111-1111";
        s1.age = 30;
       
        
        System.out.printf("%s, %s, %d\n", 
        s1.name, s1.tel, s1.age);
    }
}

