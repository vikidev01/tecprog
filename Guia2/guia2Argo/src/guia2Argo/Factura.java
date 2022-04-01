package guia2Argo;

import java.util.Calendar;
import java.util.Vector;

public class Factura {

  private Integer numero;
  private Calendar fecha;
  private Cliente myCliente;
  private Vector <DetalleFactura> myDetalleFacturas;

  public Factura(Integer numero, Calendar fecha, Cliente myCliente) {
	this.numero = numero;
	this.fecha = fecha;
	this.myCliente = myCliente;
	myDetalleFacturas = new Vector<DetalleFactura> ();
  }
  public Vector<DetalleFactura> detalledeFacturas(){
	  return myDetalleFacturas;
  }
  public Float calcularTotal() {
	  Float totalDetalle = 0f;
	  for(DetalleFactura oDetalle : myDetalleFacturas) {
		  totalDetalle +=oDetalle.calcularTotalItem();
	  }
 	return totalDetalle;
  }

}