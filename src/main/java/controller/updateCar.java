package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;

/**
 * Servlet implementation class updateCar
 */
@WebServlet("/updateCar")
public class updateCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarsHelper helper = new CarsHelper();
		
		String oldName = request.getParameter("oldName");
		String owner = request.getParameter("ownerName");
		int year = Integer.valueOf(request.getParameter("year"));
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String color = request.getParameter("color");
		
		Car carToUpdate = helper.searchCarByOwner(oldName);
		carToUpdate.setOwnerName(owner);
		carToUpdate.setYear(year);
		carToUpdate.setMake(make);
		carToUpdate.setModel(model);
		carToUpdate.setColor(color);
		helper.update(carToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
