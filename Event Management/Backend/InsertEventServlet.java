package handeling;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertEventServlet")
public class InsertEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		int cusid = 1002;
		String type = request.getParameter("type");
		String location = request.getParameter("location");
		String date = request.getParameter("date");
		String stime = request.getParameter("stime");
		String etime = request.getParameter("etime");
		String pid = request.getParameter("pid");
		
		String Type;
		if(type == "physical") {
			Type = "Physical";
		}else {
			Type = "Virtual";
		}
		
		String pkg = null;
		switch (pid){
		case "premium":
			pkg="Premium";
			break;
		case "platinum":
			pkg="Platinum";
			break;
		case "gold":
			pkg="Gold";
			break;
		case "silver":
			pkg="Silver";
			break;
		case "bronz":
			pkg="Bronze";
			break;
		}
		
		boolean isTrue;
		
		isTrue= EventDBUtil.insertevent(title, cusid, Type, location, date, stime, etime, pkg);
		
		if(isTrue==true) {
			RequestDispatcher dis =request.getRequestDispatcher("MyEvents.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis =request.getRequestDispatcher("Unsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}
