package java100.app.control;

import java.io.PrintWriter;
import java.util.List;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;

public class ScoreController implements Controller {
    
    // ScoreDao는 인터페이스이다. 
    // 따라서 ScoreDao 인터페이스를 구현한 어떤 클래스라도 주입 받을 수 있다.
    // 이것이 인터페이스를 사용하는 이유이다.
    // 상황에 따라 다양한 DAO 구현체를 주입 받을 수 있기 때문이다.
    // 현재는 App 클래스에서 MySQL DBMS를 사용하는 구현체를 주입해 주지만,
    // 만약 고객사의 DBMS가 Oracle이라면 
    // 그 Oracle을 사용하는 DAO를 주입해줄 것이다.
    ScoreDao scoreDao;
    
    public void setScoreDao(ScoreDao scoreDao) {
        this.scoreDao = scoreDao;
    }
    
    @Override
    public void destroy() {}
    
    @Override
    public void init() {}
    
    @Override
    public void execute(Request request, Response response) {

        switch (request.getMenuPath()) {
        case "/score/add": this.doAdd(request, response); break;
        case "/score/list": this.doList(request, response); break;
        case "/score/view": this.doView(request, response); break;
        case "/score/update": this.doUpdate(request, response); break;
        case "/score/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doDelete(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[성적 삭제]");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (scoreDao.delete(no) > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[성적 변경]");
        
        try {
            Score score = new Score();
            score.setNo(Integer.parseInt(request.getParameter("no")));
            score.setName(request.getParameter("name"));
            score.setKor(Integer.parseInt(request.getParameter("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
            
            if(scoreDao.update(score) > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("'%s'의 성적 정보가 없습니다.\n", score.getNo());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }

    private void doView(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[성적 상세 정보]");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Score score = scoreDao.selectOne(no);
            
            if (score != null) {
                out.printf("번호: %d\n", score.getNo());
                out.printf("이름: %s\n", score.getName());
                out.printf("국어: %d\n", score.getKor());
                out.printf("영어: %d\n", score.getEng());
                out.printf("수학: %d\n", score.getMath());
                out.printf("합계: %d\n", score.getSum());
                out.printf("평균: %.1f\n", score.getAver());
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no); 
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[성적 목록]");
        
        try {
            List<Score> list = scoreDao.selectList();
            
            for (Score score : list) {
                out.printf("%4d, %-4s, %4d, %6.1f\n",
                        score.getNo(),
                        score.getName(), 
                        score.getSum(), 
                        score.getAver());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }

    private void doAdd(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[성적 등록]");
        
        try {
            Score score = new Score();
            score.setName(request.getParameter("name"));
            score.setKor(Integer.parseInt(request.getParameter("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
            
            scoreDao.insert(score);
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
    
}













