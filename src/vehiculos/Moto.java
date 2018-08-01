package vehiculos;

public class Moto {

	private String marca;
	private int cc;
	private int km;
	private int cantRuedas;
	private String tipoV;
	
	public Moto(){}
	
	public Moto (String tipoVe, String m, int cilindrada, int kilometraje, int cRuedas){
		this.tipoV = tipoVe;
		marca = m;
		cc = cilindrada;
		km = kilometraje;
		cantRuedas = cRuedas;
	}
	

	
	public String getMarca() {
		return marca;
	}
	
	public String getTipoV() {
		return tipoV;
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
		return "Tipo Vehiculo " + tipoV + ", (Marca= " + marca + ", Cilindrada= " + cc + ", KM= " + km + ", Ruedas a Cambiar=" + cantRuedas + ")";
	}
	
	
	
	
}
