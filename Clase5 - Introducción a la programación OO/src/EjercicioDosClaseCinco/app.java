package EjercicioDosClaseCinco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class app {

	public static void main(String[] args) {
		String ruta = "C:\\Users\\tatoc\\Desktop\\tato\\programacion\\JavaUTN\\ClaseCinco\\src\\EjercicioDosClaseCinco\\Productos.txt";
		Path pathRuta = Paths.get(ruta);
		ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
		try {
			for(String linea : Files.readAllLines(pathRuta)) {
				System.out.println(linea);
				String[] parametroProducto;
				parametroProducto = linea.split(",");
				String nombre = parametroProducto[0];
				String codigo = parametroProducto[1];
				String precioString = parametroProducto[2];
				float precio = Float.valueOf(precioString);				
				Producto producto = new Producto(nombre,codigo,precio);
				listaDeProductos.add(producto);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int x=0; x<listaDeProductos.size(); x++) {
			System.out.println(listaDeProductos.get(x).getNombre() + ": $" + listaDeProductos.get(x).getPrecio());
		}
	}

}
