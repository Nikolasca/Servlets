package co.edu.unisabana.ingenieriainformatica.pnt.g1.proyectoparcial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Parcial_Segundo_CorteServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	UnicaInstancia arreglo = UnicaInstancia.constructor();
		
	int codigocurso = Integer.parseInt(req.getParameter("codcurso"));
	int codigoestudiante =  Integer.parseInt(req.getParameter("codestudiante"));
	float  notap= Float.parseFloat(req.getParameter("notap"));
	float notas = Float.parseFloat(req.getParameter("notas"));
	float notat = Float.parseFloat(req.getParameter("notat"));
	 
	Curso estudiante = new Curso(codigocurso,codigoestudiante,notap,notas,notat);

	arreglo.AgregarEstudiante(estudiante);
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<t1>"+ "Esudiante Agregado!!!");
	out.println("<form action='http://1-dot-proyectoservlet.appspot.com/index.html'><input type= 'submit' value=Volver to Google' /></form>");
	out.println("</body>");
	out.println("<html>");
	
	
}
}
