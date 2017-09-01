package services;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GetCollection;

@SuppressWarnings("serial")
public class FormServlet extends HttpServlet {
  
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
        String name = req.getParameter("name");
        System.out.println(name);
        String sf = req.getParameter("sf");
        System.out.println(sf);
        String hobby = req.getParameter("hobby");
        System.out.println(hobby);
        String url = req.getParameter("file");
        System.out.println(url);
        String worktime = req.getParameter("worktime");
        System.out.println(worktime);
        resp.getWriter().print(name+sf+hobby+url+worktime);
//        resp.getWriter().print(json);
        
        
        GetCollection getconn=new GetCollection();
        Connection conn=getconn.getConn();
     
        PreparedStatement ps=null;
        String sql="insert into myMessage(name,sf,hobby,url,worktime) values(?,?,?,?,?)";
        try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, sf);
			ps.setString(3, hobby);
			ps.setString(4, url);
			ps.setString(5, worktime);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        
    }
}
