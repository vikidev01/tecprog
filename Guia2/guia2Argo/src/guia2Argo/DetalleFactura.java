package guia2Argo;

public class DetalleFactura {

	  private Integer cantidad;
	  private Float precioUnitario;
	  private Producto myProducto;
	  
      public DetalleFactura(Integer cantidad, Producto myProducto) {
		
		this.cantidad = cantidad;
		this.precioUnitario = myProducto.calcularPrecioVenta();
		this.myProducto = myProducto;
		
		
		
      }

	

  public Float calcularTotalItem() {
	  
	  return precioUnitario * cantidad;
  }

}