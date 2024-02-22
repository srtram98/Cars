package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Garage;

/**
 * Servlet implementation class AddGarage
 */
@WebServlet("/addGarage")
public class AddGarage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGarage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Garage g = new Garage();
		GarageHelper helper = new GarageHelper();
		g.setName(request.getParameter("garageName"));
		helper.persist(g);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
