package dao;

import java.sql.*;

public class GetCollection {

	public Connection getConn(){
		Connection conn = null;// 创建一个数据库连接
		try
	    {
	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
	        //System.out.println("开始尝试连接数据库！");
	        String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:chenn";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
	        String user = "system";// 用户名,系统默认的账户名
	        String password = "Oracle11g";// 你安装时选设置的密码
	        conn = DriverManager.getConnection(url, user, password);// 获取连接
	        //System.out.println("连接成功！");
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
		return conn;
	}
}
