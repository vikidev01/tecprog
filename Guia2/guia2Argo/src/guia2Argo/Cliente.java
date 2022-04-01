package guia2Argo;

public class Cliente {

  private String cuit;
  private String razonSocial;
  private IVA myIVA;
  
	public Cliente(String cuit, String razonSocial, IVA myIVA) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.myIVA = myIVA;
	}
  
}