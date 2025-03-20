package tarea1y2;
import java.io.Serializable;

public class Pacientes implements Serializable {

	String pacienteID="";
	String nombres="";
	String apellidos="";
	String genero="";
	String tiposangre="";
	String telefono="";
	String Direccion;
	
	public Pacientes(String pacienteID, String nombres, String apellidos, String genero, String tiposangre,
			String telefono, String direccion) {
		super();
		this.pacienteID = pacienteID;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
		this.tiposangre = tiposangre;
		this.telefono = telefono;
		Direccion = direccion;
	}


	public Pacientes() {
		super();
	}


	public void Imprimir() {
		System.out.println("pacienteID: "+this.pacienteID);
		System.out.println("Nombres: "+this.nombres);
		System.out.println("apellidos: "+this.apellidos);
		System.out.println("genero : "+this.genero);
		System.out.println("tiposangre: "+this.tiposangre);
		System.out.println("telefono: " +this.telefono);
		System.out.println("Direccion: "+this.Direccion);
	}
}




