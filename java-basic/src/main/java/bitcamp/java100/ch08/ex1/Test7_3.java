// 캡슐화의 존재 이유 - 필드와 프로퍼티, 그리고 셋터/겟터 
// 
package bitcamp.java100.ch08.ex1;

// Gym 회원을 추상화 해보자!
class Member3 {
   
    private String name;
    private int age;
    private float weight;
    private float height;
    
    //필드의 값을 설정하는 메서드를 선언
    // => 이 메서드는 외부에서 사용해야 하기 때문에 전체공개를 한다.
    // => 필드의 값을 설정하는 메서드는 보통 메서드이름을 set으로 시작한다
    // 그리고 필드이름을 뒤에 붙인다.
    // 단 set 다음에 첫 문자는 보통 대문자로 시작한다.
    // => 물론 필드명과 반드시 같을 필요는 없다.
    
    public void setName (String name) {
        this.name = name;
    }
        // 필드의 값을 꺼내는 메서드 선언
    // => 보통 get으로이름을 시작한다.
    // 나머지는 set으로 시작하는 메서드와 같다.
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
  
   
}

public class Test7_3 {
    public static void main(String[] args) {
        
        Member3 m = new Member3();
        //Member2 의 모든 필드는 private으로 제한되었기 때문에 레퍼런스를 사용하여 직접 접근할 수 없다.
//        m.name = "홍길동";
//        m.age = 20;
//        m.weight = 900.70f;
//        m.height = 16.0f;

        //대신 Member2 에서 제공해주는 메서드를 사용하여 값을 설정
        
        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);
        
        System.out.printf("%s, %d, %f, %f\n", 
                m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    }

}








