package s21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s21/choice")
public class Choice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * String[] colors = request.getParameterValues("colors");
		 * 
		 * request.setAttribute("colors", colors);
		 * 
		 * RequestDispatcher rd = request.getRequestDispatcher("/s21/feedback.jsp");
		 * rd.forward(request, response);
		 * 
		 */
		String[] userColors = request.getParameterValues("colors");

		if (userColors != null) {
			List<String> colors = new ArrayList<String>();
//			String[] colors = new String[userColors.length];

			for (String c : userColors) {
				switch (c) {
				case "Blue":
					colors.add("BLU");
					break;
				case "Yellow":
					colors.add("GIALLO");
					break;
				case "Red":
					colors.add("ROSSO");
					break;
				case "Black":
					colors.add("NERO");
					break;
				case "White":
					colors.add("BIANCO");
					break;

				default:
					colors.add("???");
					break;
				}
			}
			request.setAttribute("colors", colors);

			RequestDispatcher rd = request.getRequestDispatcher("/s21/feedback.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("colors", null);

			RequestDispatcher rd = request.getRequestDispatcher("/s21/feedback.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
