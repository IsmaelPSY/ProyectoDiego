package servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import services.EquipoService;

/**
 * Servlet implementation class ServletEquipo
 */
@WebServlet("/ServletEquipo")
public class ServletEquipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*private EquipoService serviEquipo = new EquipoService();*/
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEquipo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF=8");
		String tipo = request.getParameter("tipo");

		System.out.println("ESTOY DENTRO DEL SERVERLET");
		System.out.println(tipo);
		
		if(tipo.equals("listar"))
			listar(request,response);
//		else if(tipo.equals("actualizar"))
//			actualizar(request,response);
		
	}
	
	protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Estoy dentro de listar");
//		request.setAttribute("data", serviEquipo.listarEquipos());
	
		request.getRequestDispatcher("/listar_sanchezmateo.jsp").forward(request, response);
	}
	
//	protected void actualizar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.setAttribute("data", serviEquipo.listarEquipos());
//		System.out.println("Estoy dentro de actualizar");
//		request.getRequestDispatcher("/actualizar_sanchezmateo.jsp").forward(request, response);
//	}
	

}
