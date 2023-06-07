package ejerciciosClaseOcho;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		LocalDate naciemiento = LocalDate.parse(fechaNacimiento);
		this.fechaNacimiento = naciemiento;
	}
	
	public int edad() {
		int edad = LocalDate.now().compareTo(fechaNacimiento);
		return edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
}
