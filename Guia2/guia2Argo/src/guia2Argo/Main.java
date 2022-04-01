package guia2Argo;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
	
		IVA ivaEmpresa = new IVA ("Monotributo");
		Empresa manicuriaInsumos = new Empresa ("Mayorista S.A.", ivaEmpresa);
		
		IVA ivaCliente = new IVA ("Responsable Incripto");
		Cliente salonNails = new Cliente("21-41007468-6", "Yoha" , ivaCliente) ;
		Calendar fecha= Calendar.getInstance();
		
		Factura uno = new Factura(0001,fecha , salonNails);
		
		Producto esmalte  = new Producto("Esmalte Rosa" , 256f);
		Producto esmalte1 = new Producto("Esmalte Rojo" , 250f);
		Producto esmalte2 = new Producto("Esmalte Amarillo" ,306f);
		Producto esmalte3 = new Producto("Esmalte Verde" , 210f);
		
		DetalleFactura detalle = new DetalleFactura (2,esmalte);
		DetalleFactura detalle1 = new DetalleFactura (5,esmalte1);
		DetalleFactura detalle2 = new DetalleFactura (1,esmalte2);
		DetalleFactura detalle3 = new DetalleFactura (23,esmalte3);
		
		uno.detalledeFacturas().add(detalle);
		uno.detalledeFacturas().add(detalle1);
		uno.detalledeFacturas().add(detalle2);
		uno.detalledeFacturas().add(detalle3);
		
		
		System.out.println("El total de la factura uno es: "+ uno.calcularTotal());
		
		
		
		IVA ivaCliente2 = new IVA ("Responsable Incripto");
		Cliente coco1 = new Cliente("21-27890546-6", "Coco" , ivaCliente2) ;
		Calendar fecha2= Calendar.getInstance();
		
		Factura dos = new Factura(0002,fecha2 , coco1);
		
		Producto neu  = new Producto("Neumatico" , 1890f);
		Producto guer = new Producto("Guardabarro" , 89067f);
		
		
		DetalleFactura detalle0 = new DetalleFactura (2,neu);
		DetalleFactura detalle10 = new DetalleFactura (5,guer);
		
		
		dos.detalledeFacturas().add(detalle0);
		dos.detalledeFacturas().add(detalle10);
		
		manicuriaInsumos.facturas().add(uno);
		manicuriaInsumos.facturas().add(dos);
		
		System.out.println("El total de la factura dos es: "+ dos.calcularTotal());
		
		
		manicuriaInsumos.calcularTotalFacturas();
	}

}
