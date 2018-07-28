package garage;

public class Cliente {
	
	private String nCliente;
	private String tipoV;
	private Auto auto;
	private Moto moto;
	
	public Cliente (String nombre, String tipoVehiculo){
		nCliente =nombre;
		tipoV = tipoVehiculo;
	}
	
	public void Moto (String tipoV, String m, int cilindrada, int kilometraje, int cRuedas){
		moto = new Moto (tipoV, m, cilindrada, kilometraje, cRuedas);
	}
	
	
	public String getnCliente() {
		return nCliente;
	}
	public String getTipoV() {
		return tipoV;
	}


	public void mostrarTipoV (){
		System.out.println(tipoV);
	}
	
	
}
