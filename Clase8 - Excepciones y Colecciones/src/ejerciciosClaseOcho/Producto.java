package ejerciciosClaseOcho;

public class Producto {
	private String nombre;
	private float precio;
	private int stock;
	
	public Producto(String nombre, float precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public float getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
