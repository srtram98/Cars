package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;

/**
 * Servlet implementation class addCar
 */
@WebServlet("/addCar")
public class addCar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Car c = new Car();
		CarsHelper helper = new CarsHelper();
		c.setYear(Integer.valueOf(request.getParameter("year")));
		c.setMake(request.getParameter("make"));
		c.setModel(request.getParameter("model"));
		c.setColor(request.getParameter("color"));
		c.setOwnerName(request.getParameter("ownerName"));
		helper.persist(c);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
