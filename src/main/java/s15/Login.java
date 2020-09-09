package s15;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s15/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);

		request.setAttribute("user", user);

		if ((user != null) && (!user.isEmpty()) && (password != null) && (!password.isEmpty())) {
			RequestDispatcher rd = request.getRequestDispatcher("/s15/logged.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/s15/unknown.jsp");
			rd.forward(request, response);
		}
	}
}
