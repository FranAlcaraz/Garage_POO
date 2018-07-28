package garage;

public class Auto {

	private String tipoVehiculo;
	private String marca;
	private int cantPuertas;
	private int km;
	private int cantRuedas;
	
	public Auto (String m, int cPuertas,int kilometraje, int cRuedas){
		marca = m;
		cantPuertas = cPuertas;
		km = kilometraje;
		cantRuedas = cRuedas;
	}
	

	
	public String getTipovehiculo() {
		return tipoVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	
	public int getCantPuertas() {
		return cantPuertas;
	}
	
	public int getKm() {
		return km;
	}

	public int getCantRuedas() {
		return cantRuedas;
	}
	
	
	
	
}
