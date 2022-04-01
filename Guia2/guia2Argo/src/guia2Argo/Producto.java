package guia2Argo;

public class Producto {

	private String nombre;
	private  Float precio;

	public Producto(String nombre, Float i) {
		
		this.nombre = nombre;
		this.precio = i;
	}
	
    public Float calcularPrecioVenta() {
    	return precio;
    }
    
}