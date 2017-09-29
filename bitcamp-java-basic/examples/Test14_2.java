// ## 사용자 정의 데이터 타입 만들기
package bitcamp.java100;

public class Test14_2{

    public static void main(String[] args)  {
 // 사용자 데이터 타입 정의하기
 // 도서명 , 저자 ,출판사 , 페이지 , 가격($)
 //1) 설계도 작성
        class Book {
            String title;
            String author;
            String press;
            int pageSize;
            double price;
        }
 //2) 새 데이터 타입에 따라 만든 메모리의 주소를 저장할 변수 선언
     Book b1; //Scroe 설계도에 따라 준비한 메모리의 주소를 저장.

//3) 사용자가 새로 정의한 데이터 타입에 따라 메모리를 준비하기
        b1 = new Book(); 
        
//4) 레퍼런스를 사용하여 새 메모리에 값 넣기
        b1.title = "자바야 나 잡아봐라!";
        b1.author = "홍길동";
        b1.press = "비트출판사";
        b1.pageSize = 200;
        b1.price = 35.7;
        
        System.out.printf("%s, %s, %s, %d, %f\n", 
        b1.title, b1.author, b1.press, b1.pageSize, b1.price);
    }
}

