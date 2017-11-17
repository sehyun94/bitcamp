package java100.app.control;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;
import java100.app.util.Prompts;

public class RoomController extends ArrayList<Room> implements Controller{
    
    private String dataFilePath;
    
    public RoomController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    Scanner keyScan = new Scanner(System.in);
    
    
    @Override
    public void destory() {
        try (FileWriter out = new FileWriter(dataFilePath);) {
            for (Room room : this) {
                out.write(room.toCSVStirng() + "\n");
             }
             } catch (IOException e) {
        e.printStackTrace();
        } 
}

// CSV형식으로 저장된 파일에서 성적 데이터를 읽어
// ArrayList에 보관한다.
    
    @Override
    public void init() {
        try (
                FileReader in = new FileReader(dataFilePath);
                Scanner lineScan = new Scanner(in);){
            String csv = null;
            while (lineScan.hasNextLine()) {
                csv = lineScan.nextLine();
                try {
                    this.add(new Room(csv));
            } catch(CSVFormatException e) {
                System.err.println("CSV 데이터 형식오류!");
                e.printStackTrace();
            }
        }
            } catch(IOException e) {
                e.printStackTrace();
    }
}
    
    @Override
    public void execute() {
        loop: while (true) {
            System.out.print("강의실관리> ");
            String input = keyScan.nextLine();
            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "add": this.doAdd(); break;
            case "list": this.doList(); break;
            case "delete": this.doDelete(); break;
            case "main": 
                break loop;
            default:
                System.out.println("해당 명령이 없습니다.");
            }
        }
    }

    // 대신 목록 객체에 값을 저장하고 꺼낸는 객체는 완전 공개
    private void doDelete() {
        System.out.println("[강의실 삭제]");
        String roomName = Prompts.inputString("강의실 이름? ");

        Room room = find(roomName);

        if (room == null) {
            System.out.printf("'%s'의 강의실 정보가 없습니다.\n", room);
            return;
        } 
        
        if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                this.remove(room);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
    }

    
    private void doList() {
        System.out.println("[강의실 목록]");

        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.printf("강의실이름: %-7s 강의실 지역: %-10s  수용인원: %d\n", 
                    room.getName(), room.getLocation(), room.getCapacity());
        }
        
    }

    private void doAdd() {
        System.out.println("[강의실 등록]");

        Room room = new Room();
        
        room.setName(Prompts.inputString("강의실 이름? "));
   
        if(find(room.getName()) != null) { 
            System.out.println("이미 등록된 강의실 입니다.");
            return;
    }
        room.setLocation(Prompts.inputString("지역?"));
        room.setCapacity(Prompts.inputInt("수용인원?"));
        
        this.add(room);
}

    private Room find(String name) {
        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }
}

