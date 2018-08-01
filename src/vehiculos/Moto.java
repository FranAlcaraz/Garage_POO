package vehiculos;

public class Moto {

	private String marca;
	private int cc;
	private int km;
	private int cantRuedas;
	private String tipoV;
	
	public Moto(){}
	
	public Moto (String tipoV, String m, int cilindrada, int kilometraje, int cRuedas){
		tipoV = tipoV;
		marca = m;
		cc = cilindrada;
		km = kilometraje;
		cantRuedas = cRuedas;
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


	public String toString() {
		return "Vehiculo: Moto (Marca= " + marca + ", Cilindrada= " + cc + ", KM= " + km + ", Ruedas a Cambiar=" + cantRuedas + ")";
	}
	
	
	
	
}
