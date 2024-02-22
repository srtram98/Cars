package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Garage;

/**
 * Servlet implementation class ViewForest
 */
@WebServlet("/viewGarage")
public class ViewGarage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewGarage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GarageHelper helper = new GarageHelper();
		
		List<Garage> garageList = helper.showAllGarages();
		
		request.setAttribute("allGarages", garageList);
		
		String path = "/viewGarage.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


}
