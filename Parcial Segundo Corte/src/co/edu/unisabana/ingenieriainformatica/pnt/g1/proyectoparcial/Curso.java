package co.edu.unisabana.ingenieriainformatica.pnt.g1.proyectoparcial;

public class Curso {
	int Codigocurso;
	int Codigodelestudiante;
	float Notasp;
	float Notass;
	float Notast;
	
Curso (int codigocurso, int codigoestudiante, float notasp , float notass, float notast ){
		this.Codigocurso = codigocurso;
		this.Codigodelestudiante = codigoestudiante;
		this.Notasp = notasp;
		this.Notass = notass;
		this.Notast = notast;

	}
	public int getCodigocurso() {
		return Codigocurso;
	}

	public void setCodigocurso(int codigocurso) {
		Codigocurso = codigocurso;
	}

	public int getCodigodelestudiante() {
		return Codigodelestudiante;
	}

	public void setCodigodelestudiante(int codigodelestudiante) {
		Codigodelestudiante = codigodelestudiante;
	}

	public float getNotasp() {
		return Notasp;
	}

	public void setNotasp(float notasp) {
		Notasp = notasp;
	}

	public float getNotass() {
		return Notass;
	}

	public void setNotass(float notass) {
		Notass = notass;
	}

	public float getNotast() {
		return Notast;
	}

	public void setNotast(float notast) {
		Notast = notast;
	}


}
