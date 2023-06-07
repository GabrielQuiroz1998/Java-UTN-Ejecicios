package EjercicosClaseSiete;

import java.time.LocalDateTime;

public class Carrito {
	Persona persona;
	Producto prod1 = null;
	Producto prod2 = null;
	Producto prod3 = null;
	LocalDateTime fechaDeCompra;
	Descuento descuento;
	
	public Carrito(Persona persona, Producto prod1, Producto prod2, Producto prod3) {
		this.persona = persona;
		this.prod1 = prod1;
		this.prod2 = prod2;
		this.prod3 = prod3;
		this.fechaDeCompra = LocalDateTime.now();
	}
	
	public Carrito() {}
	
	public double costoFinal() {
		double costoFinal = 0;
		if(prod1 != null) {
			costoFinal += prod1.getPrecio();
			if(prod2 != null) {
				costoFinal += prod2.getPrecio();
				if(prod3 != null) {
					costoFinal += prod3.getPrecio();
					}
			}
		}
		if(this.descuento != null) {
			double cantidadDescuento = this.descuento.asignarDescuento(costoFinal, descuento.getValorDescuento());
			return costoFinal - cantidadDescuento;
		}
		return costoFinal;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Producto getProd1() {
		return prod1;
	}

	public void setProd1(Producto prod1) {
		this.prod1 = prod1;
	}

	public Producto getProd2() {
		return prod2;
	}

	public void setProd2(Producto prod2) {
		this.prod2 = prod2;
	}

	public Producto getProd3() {
		return prod3;
	}

	public void setProd3(Producto prod3) {
		this.prod3 = prod3;
	}

	public LocalDateTime getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(LocalDateTime fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public Descuento getDescuento() {
		return descuento;
	}

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	
	
}
