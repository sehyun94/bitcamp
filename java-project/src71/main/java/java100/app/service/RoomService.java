package java100.app.service;

import java.util.List;
import java.util.Map;

import java100.app.domain.Room;

// "역활"을 강조할 때는 "객체(Object)"라는 말보다 "컴포넌트(Component)"라는 말을 사용한다.
// "객체(Object)는 말 그대로 한 개의 클래스를 가리키는 것이라면,
// "컴포넌트(Component) 그 역활을 수행하는 여러 객체의 묶음을 총칭한다."

// Service 컴포넌트 (인터페이스, 구현체)  는 "업무 로직"과 "트랜잭션 처리"를 담당하기 때문에 
// 인터페이스에 선언하는 메서드 이름도 가능한 업무 용어를 사용해야 한다. 

 
public interface RoomService {
    List<Room> list(int pageNo, int pageSize, Map<String,Object> options);
    int getTotalCount();
    int add(Room room);
    int delete(int no);
}
