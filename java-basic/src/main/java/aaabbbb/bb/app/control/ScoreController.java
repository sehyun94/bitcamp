package aaabbbb.bb.app.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import aaabbbb.bb.app.domain.Score;
import aaabbbb.bb.app.util.Prompts;

public class ScoreController extends GenericController<Score> {
    
    private String dataFilePath;
    public ScoreController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }

    @Override
    public void destory() {
      try (PrintWriter out  = new PrintWriter( 
                              new BufferedWriter (
                              new FileWriter (this.dataFilePath)))) {
          for (Score score : this.list) {
              out.println(score.toCSVString());
          }
          out.flush();
          
      } catch(Exception e) {
          e.printStackTrace();
      }
    }
    
    @Override
    public void init() {
        
        try (BufferedReader  in = new BufferedReader(
                                  new FileReader (this.dataFilePath));) {
            String csv = null;
            while ((csv = in.readLine()) != null) {
                    try {
                        list.add(new Score (csv));
                    } catch (Exception e) {
                        System.err.println("csv데이터 형식오류");
                        e.printStackTrace();
                    }
                }
    } catch (IOException e) {
        e.printStackTrace();
        
    }
        }
    
    @Override
    public void execute(Request request, Response response) {
       
            switch (request.getMeunPath()) {
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
        
        String name = request.getParameter("name");
        
        out.println("[성적 삭제]");
        
        Score score = findByName(name);
        
        if (score == null) {
           out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } 
        list.remove(score);
        out.println("삭제하였습니다.");
    }

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        
        out.println("[성적 변경]");
        
        Score score = findByName(name);
        
        if (score == null) {
            out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            
        } else {

            score.setKor(Integer.parseInt(request.getParameter("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
            
            out.println("변경하였습니다.");
                
        }
    }

    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        
        out.println("[성적 상세 정보]");
        
        Score score = findByName(name);
        
        if (score == null) {
           out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            return;
        }
        
        out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                score.getName(),
                score.getKor(),
                score.getEng(),
                score.getMath(),
                score.getSum(), 
                score.getAver());
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[성적 목록]");
        
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            out.printf("%-4s, %4d, %6.1f\n",  
                    score.getName(), 
                    score.getSum(), 
                    score.getAver());
        }
    }

    private void doAdd(Request request, Response response) {
            
        PrintWriter out = response.getWriter();
        
        Score score = new Score();
        
        score.setName(request.getParameter("name"));
        score.setKor(Integer.parseInt(request.getParameter("kor")));
        score.setEng(Integer.parseInt(request.getParameter("eng")));
        score.setMath(Integer.parseInt(request.getParameter("math")));
        
        list.add(score);
        out.println("저장되었습니다");
    }
    
    private Score findByName(String name) {
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            if (score.getName().equals(name)) {
                return score;
            }
        }
        return null;
    }
}













