package guia2Argo;

import java.util.Vector;

public class Empresa {
	
	  private String nombre;
	  private Vector<Factura>  myFacturas;
	  private IVA myIVA;
	  private Vector<Cliente>  myCliente;
	  private Vector<Producto>  myProducto;
	
	
	public Empresa(String nombre, IVA myIVA) {
	
		this.nombre = nombre;
		this.myIVA = myIVA;
		myFacturas =  new Vector<Factura> ();
		myCliente = new Vector<Cliente> ();
		myProducto = new Vector<Producto> ();
	}
	public Vector<Factura> facturas(){
		  return myFacturas;
	}
	
	public void calcularTotalFacturas() {
		Float totalFacturacion = 0f;
		for(Factura oFactura : myFacturas) {
			totalFacturacion += oFactura.calcularTotal();
		}
		System.out.println("Total Facturado: "+ totalFacturacion);
  }
}