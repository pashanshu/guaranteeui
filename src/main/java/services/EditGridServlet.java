package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EditGridServlet extends HttpServlet {
  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req,resp);
    }
       
   
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        String json = "{total:5,root:[";
//        for(int i = 0;i<5;i++){
//            json +="{id:"+i+",name:'name"+i+"',descn:'desc"+i+"'}";
//           
//            json+=",";
//            
//        }
//        json+="]}";
        String data = req.getParameter("data");
        System.out.println(data);
        resp.getWriter().print(data);
//        resp.getWriter().print(json);
    }
}