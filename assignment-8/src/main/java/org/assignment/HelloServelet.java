package org.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServelet
 */
@WebServlet("/HelloServelet")
public class HelloServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/First.jsp");

		rd.forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     int princ = Integer.parseInt(request.getParameter("princ"));

		int rate = Integer.parseInt(request.getParameter("rate"));

		int time = Integer.parseInt(request.getParameter("Time"));

		Interest obj = new Interest();

		

		int result = obj.SimInt(princ,rate,time);

		request.getSession().setAttribute("result",result);

		request.getRequestDispatcher("result.jsp").forward(request, response);

		PrintWriter out=response.getWriter();

		out.println(result);		
	}

}
