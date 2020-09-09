package s15;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s15/guess")
public class Guess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		String third = request.getParameter("third");
		
		request.setAttribute("first", first);
		request.setAttribute("second", second);
		request.setAttribute("third", third);
		
		if (first.equals("3") && second.equals("2") && third.equals("1")) {
			RequestDispatcher rd = request.getRequestDispatcher("/s15/guessed.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/s15/tryagain.jsp");
			rd.forward(request, response);
		}
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
