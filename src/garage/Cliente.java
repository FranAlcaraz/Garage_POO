package garage;

public class Cliente {
	
	private String nCliente;
	private String tipoV;
	private Auto[] auto;
	private Moto[] moto;
	private int numeroDeMoto;
	private int numeroDeAuto;
	
	public Cliente (String nombre, String tipoVehiculo){
		nCliente =nombre;
		tipoV = tipoVehiculo;
		moto = new Moto[10];
		numeroDeMoto = 0;
		auto = new Auto[10];
		numeroDeAuto = 0;
	}
	
	public void Moto (String tipoV, String m, int cilindrada, int kilometraje, int cRuedas){
		int i = numeroDeMoto++;
		moto[i] = new Moto (tipoV, m, cilindrada, kilometraje, cRuedas);
	}
	
	public void Auto (String tipoV, String m, int cPuertas, int kilometraje, int cRuedas){
		int i = numeroDeAuto++;
		auto[i] = new Auto (tipoV, m, cPuertas, kilometraje, cRuedas);
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
