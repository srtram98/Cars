package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;

/**
 * Servlet implementation class deleteCar
 */
@WebServlet("/deleteCar")
public class deleteCar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarsHelper helper = new CarsHelper();
		String name = request.getParameter("name");
		Car carToDelete = helper.searchCarByOwner(name);
		helper.delete(carToDelete);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
