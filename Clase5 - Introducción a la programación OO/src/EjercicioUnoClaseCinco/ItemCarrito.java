package EjercicioUnoClaseCinco;

public class ItemCarrito {
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito() {
		super();
	}
	
	public double precio() {
	
		try {
			return this.producto.getPrecio() * cantidad;
		}catch(NullPointerException e) {
			return 0;
		}
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void agregarProductos(Producto producto, int cantidad) {
		if(producto.getStock() >= cantidad) {
			this.producto  = producto;
			this.cantidad = cantidad;
		}
	}
	
	
}
