package co.edu.unisabana.ingenieriainformatica.pnt.g1.proyectoparcial;

import java.util.ArrayList;

public class UnicaInstancia {
	
	private static UnicaInstancia instancia = null;
	private ArrayList <Curso> cursos = new ArrayList<Curso>();
	public static UnicaInstancia constructor(){
		if(instancia==null)
			instancia = new UnicaInstancia();
		return instancia;
	}
public void AgregarEstudiante(Curso alumnonuevo){
	this.cursos.add(alumnonuevo);
	
}

public ArrayList<Curso> getCursos() {
	return cursos;
}
public void setCursos(ArrayList<Curso> cursos) {
	this.cursos = cursos;
}

}
