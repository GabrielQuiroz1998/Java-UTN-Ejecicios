package EjercicosClaseSiete;

public class Producto {
	String nombre;
	String codigo;
	float precio;
	
	public Producto(String nombre, String codigo, float precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public float getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}
	
	
}
