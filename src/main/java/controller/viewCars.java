package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;

/**
 * Servlet implementation class viewCars
 */
@WebServlet("/viewCars")
public class viewCars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarsHelper helper = new CarsHelper();
		List<Car> carList = helper.showAllCars();
		request.setAttribute("carList", carList);
		getServletContext().getRequestDispatcher("/viewCars.jsp").forward(request, response);
	}

}
