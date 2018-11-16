package test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接受页面zhuce.html传过来的四个数据
		int sid = Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		int sage = Integer.parseInt(request.getParameter("sage"));
		String sphone = request.getParameter("sphone");
				
		//调用添加方法
		try {
			StudentDao.tianjia(sid, sname, sage, sphone);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//去哪个页面
		response.sendRedirect("https://m.jd.com/");
	}
}
