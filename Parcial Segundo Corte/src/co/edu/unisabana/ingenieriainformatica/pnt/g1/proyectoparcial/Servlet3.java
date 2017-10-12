	package co.edu.unisabana.ingenieriainformatica.pnt.g1.proyectoparcial;
	
	import java.io.IOException;
	import java.io.PrintWriter;
	
	import javax.servlet.http.*;
	
	@SuppressWarnings("serial")
	public class Servlet3 extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
		UnicaInstancia arreglo = UnicaInstancia.constructor();
			int validador = 0;
		float codigocurso = Float.parseFloat(req.getParameter("notabuscar"));
		for(int i = 0;i< arreglo.getCursos().size();i++){
		 if (codigocurso <= arreglo.getCursos().get(i).getNotasd()){
			 PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<body>");
				out.println("<t1>"+ "ID del estudiante:"+arreglo.getCursos().get(i).getCodigodelestudiante());
				out.println("<t1>"+ "ID del Curso:"+arreglo.getCursos().get(i).getCodigodelestudiante());
				out.println("<t1>"+ "ID del estudiante:"+arreglo.getCursos().get(i).getCodigodelestudiante());
				out.println("<t1>"+ "Nota:"+arreglo.getCursos().get(i).getNotasd());
				out.println("<button onclick='goBack()'>Go Back</button> <script>function goBack() { window.history.back();}</script>");
				out.println("</body>");
				out.println("<html>");
				validador++;
			 
		 }
		
		if (validador == 0) {
			 PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<body>");		
				out.println("<t1>" + "No se encontraron notas");
				out.println("<button onclick='goBack()'>Go Back</button> <script>function goBack() { window.history.back();}</script>");
				out.println("</body>");
				out.println("<html>");
		 }
		}
	
		
		
		
		
	}
	}
