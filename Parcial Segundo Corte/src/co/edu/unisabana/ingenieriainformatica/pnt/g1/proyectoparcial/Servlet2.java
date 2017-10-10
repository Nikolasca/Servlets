package co.edu.unisabana.ingenieriainformatica.pnt.g1.proyectoparcial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		UnicaInstancia arreglo = UnicaInstancia.constructor();
		
		int codigocurso = Integer.parseInt(req.getParameter("idcurso"));
		int codigoestudiante =  Integer.parseInt(req.getParameter("idestudiante"));
		
		
		for(int i = 0; i<arreglo.getCursos().size();i++){
			if((arreglo.getCursos().get(i).getCodigocurso() == codigocurso)&&(arreglo.getCursos().get(i).getCodigodelestudiante() ==codigoestudiante)){
			float x = CalcularPromedio(arreglo.getCursos().get(i).Notasp,arreglo.getCursos().get(i).Notass,arreglo.getCursos().get(i).Notast);
			String y =String.valueOf(x);
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<body>");
				out.println("<t1>"+ "Estudiante Encontrado:");
				out.println("<t1>"+ "Promedio"+ y);
				out.println("<form action='http://1-dot-proyectoservlet.appspot.com/index.html'><input type= 'submit' value=Volver to Google' /></form>");
				out.println("</body>");
				out.println("<html>");
			}
			else{

				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<body>");
				out.println("<t1>"+ "Estudiante No encontrado");
				out.println("<form action='http://1-dot-proyectoservlet.appspot.com/index.html'><input type= 'submit' value=Volver to Google' /></form>");
				out.println("</body>");
				out.println("<html>");
			}
		}
		
	}
 public float CalcularPromedio(float num1 , float num2 , float num3){
		float primercorte = Double.valueOf((num1*0.3)).floatValue();
		float segundocorte = Double.valueOf((num2*0.3)).floatValue();
		float tercercorte = Double.valueOf((num3*0.4)).floatValue();
		float total = (primercorte + segundocorte + tercercorte);
		return total;
		
	}
	}