package com.palaciossystems.softpre.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.palaciossystems.softpre.modelo.Proveedor;

/**
 * Servlet implementation class cProveedor
 */
@WebServlet("/cProveedor")
public class cProveedor extends HttpServlet {
	Proveedor p = new Proveedor();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out;
		String Titulo = "Salida simplede Servlet 2";
		response.setContentType("text/html");
		out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>"+Titulo+"</title>");
		out.print("</head>");
		out.print("<body><h1>"+Titulo+"<h1/>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String xrif       = request.getParameter("rif");
		String xnombre    = request.getParameter("nombre");
		String xtelefono  = request.getParameter("telefono");
		String xdireccion = request.getParameter("direccion");
		String xestado    = request.getParameter("cmbestado");
		p.setRif(xrif);
		p.setRazonsocial(xnombre);
		p.setTelefono(xtelefono);
		p.setDireccion(xdireccion);
		p.setEstado(xestado);
		System.out.println("Pasa por servlet que instancia objeto");
		p.agregar(p);
		response.sendRedirect("proveedor.jsp");
		
		/*
		PrintWriter out;
		String Titulo = "Salida simplede Servlet 2";
		response.setContentType("text/html");
		out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>"+Titulo+"</title>");
		out.print("</head>");
		out.print("<body><h1>"+Titulo+"<h1/>");
		out.print("<br>");
		out.print(xrif+"<br> Nombre: "+p.getRazonsocial()+" <br> "+xtelefono+" <br> "+xdireccion+" <br> "+xestado);
		out.print("</body>");
		out.print("</html>");
		out.close();
		*/
	}

}
