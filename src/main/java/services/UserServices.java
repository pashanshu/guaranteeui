package services;
                 
import java.io.IOException;
                 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
                 
/**
 * 用户Servlet
 * <a href="http://home.51cto.com/index.php?s=/space/1269642" target="_blank">@author</a> shuYangYang
 * @email:shuyangyang@aliyun.com
 * @website:[url]www.shuyangyang.com.cn[/url]
 */
@SuppressWarnings("serial")
public class UserServices extends HttpServlet {
                 
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req,resp);
    }
                 
   
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String start = req.getParameter("start");
        String limit = req.getParameter("limit");
                         
        try{
            int index = Integer.parseInt(start);
            int pageSize = Integer.parseInt(limit);
            System.out.println(index);
            System.out.println(pageSize);
                             
            String json = "{total:100,root:[";
            for(int i = index;i<pageSize+index;i++){
                json +="{id:"+i+",name:'name"+i+"',descn:'desc"+i+"'}";
                if(i!=pageSize + index - 1){
                    json+=",";
                }
            }
            json+="]}";
            resp.getWriter().write(json);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
                 
}