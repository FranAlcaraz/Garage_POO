package garage;

public class Cliente {
	
	private String nCliente;
	private String tipoV;
	
	public Cliente (String nombre, String tipoVehiculo){
		nCliente =nombre;
		tipoV = tipoVehiculo;
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
