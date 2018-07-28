package garage;

public class Moto {

	private String tipoVehiculo;
	private String marca;
	private int cc;
	private int km;
	private int cantRuedas;
	
	public Moto (String tipoV, String m, int cilindrada, int kilometraje, int cRuedas){
		tipoVehiculo = tipoV;
		marca = m;
		cc = cilindrada;
		km = kilometraje;
		cantRuedas = cRuedas;
	}
	
	public String getTipovehiculo() {
		return tipoVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	
	public int getCc() {
		return cc;
	}
	
	public int getKm() {
		return km;
	}

	public int getCantRuedas() {
		return cantRuedas;
	}
	
	
	
	
}
