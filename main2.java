package tarea1y2;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main2 {
	public static void main(String[] args) {
		InicializarBases_Datos();
		MenuPrincipal();
	}
	

	public static void InicializarBases_Datos() {
		base_datos.guardarListaPacientes();  new ArrayList<Pacientes>();
		base_datos.leerListapacientes();
	}

	public static void MenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		int opcion=0;	
		do {
			
			System.out.println("*********************************************");
			System.out.println("**********SISTEMA DE PACIENTE***********");
			System.out.println("*********************************************");
			System.out.println();
			System.out.println("************************");
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("1.- Crear paciente");
			System.out.println("2.- Consultar paciente");
			System.out.println("3.- Actualizar paciente");
			System.out.println("4.- Salir");
			System.out.println();
			System.out.print("Seleccione una opción:");
			opcion=sc.nextInt();
			
			switch(opcion)
			{
			case 1:
				Crearpaciente();
				break;
			case 2:
				Consultarpaciente();
				break;
			case 3:
				Actualizarpaciente();
				break;
			case 4:
				System.out.println("Gracias por visitarnos, adios!");
				break;
			
			}
			
			System.out.println("************************");
			
		}while(opcion!=4);
			
	}
			
	public static void Crearpaciente() {
		Scanner sc = new Scanner(System.in);
		   String pacienteID="";
			String nombres="";
			String apellidos="";
			String genero="";
			String tiposangre="";
			String telefono="";
			String Direccion;
		    

		
		System.out.println("*********CREACIÓN DE PERSONA********");
		System.out.print("Ingrese El pacienteID: ");
		pacienteID = sc.nextLine(); 
		sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese El Nombres: ");
		nombres = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese El apellidos: ");
		apellidos = sc.nextLine();
		sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese el genero: ");
		genero = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese El tipo de sangre: ");
		tiposangre = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese el telefono: ");
		telefono = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese La direccion : ");
		Direccion = sc.nextLine();
		System.out.println();

		
		if(!ExisteIdpaciente(pacienteID)) {
			if(!ExisteNombrepaciente(nombres)) {
				Pacientes objEstudiante= new Pacientes(pacienteID, nombres, apellidos, tiposangre, genero, telefono ,Direccion);
				base_datos.listaPacientes.add(objEstudiante);
				System.out.println("Producto Ingresado con Éxito!");
				base_datos.guardarListaPacientes();
				objEstudiante.Imprimir();
			}
			else {
				System.out.println("El Nombre ya se encuentra Ingresado en el Sistema.");
			}
		}
		else {
			System.out.println("El Id ya se encuentra Ingresado en el Sistema.");
		}	
	}

	private static boolean ExisteNombrepaciente(String nombre) {
		for (Pacientes elemento : base_datos.listaPacientes) {
			if (elemento.nombres.equals(nombre)) {
				return true;
			}
		}
		return false;
	}

	private static boolean ExisteIdpaciente(String pacienteID) {
		for (Pacientes elemento : base_datos.listaPacientes) {
			if (elemento.nombres.equals(pacienteID)) {
				return true;
			}
		}
		return false;
	}
	
	public static void Consultarpaciente() {
		
		for (Pacientes elemento : base_datos.listaPacientes) {
			elemento.Imprimir();
		}
	}
	
	public static void Actualizarpaciente() {
	    Scanner sc = new Scanner(System.in);
	    String pacienteID="";
		String nombres="";
		String apellidos="";
		String genero="";
		String tiposangre="";
		String telefono="";
		String Direccion;
	    
	    System.out.println("********* MODIFICACIÓN DE LA PERSONA ********");
	    System.out.print("Ingrese el ID de la persona a modificar: ");
	    pacienteID = sc.nextLine();
	    sc.nextLine();
	    System.out.println();

	    if (ExisteIdpaciente(pacienteID)) {
	        for (int i = 0; i < base_datos.listaPacientes.size(); i++) {
	            if (pacienteID == base_datos.listaPacientes.get(i).pacienteID ){
	                base_datos.listaPacientes.get(i).Imprimir();

	                System.out.print("Ingrese el nuevo PacienteID: ");
	                pacienteID = sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese la nueva nombres: ");
	                nombres = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese el nuevo apellidos: ");
	                apellidos = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese la nueva genero : ");
	                genero = sc.nextLine();
	                sc.nextLine();
	                System.out.println();
	                
	                System.out.print("Ingrese la nueva tiposangre: ");
	                tiposangre = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese el nuevo telefono : ");
	                telefono = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese la nueva Direccion  : ");
	                Direccion = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                base_datos.listaPacientes.get(i).pacienteID = pacienteID;
	                base_datos.listaPacientes.get(i).nombres = nombres;
	                base_datos.listaPacientes.get(i).apellidos = apellidos;
	                base_datos.listaPacientes.get(i).genero = genero;
	                base_datos.listaPacientes.get(i).tiposangre = tiposangre ;
	                base_datos.listaPacientes.get(i).telefono = telefono ;
	                base_datos.listaPacientes.get(i).Direccion = Direccion;

	                base_datos.guardarListaPacientes();
	                System.out.println("persona actualizado correctamente.");
	                return;
	            }
	        }
	    } else {
	        System.out.println("El ID ingresado no coincide con los registros.");
	    }
	}


	}
