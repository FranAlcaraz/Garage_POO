package vehiculos;

public class Auto {

	private String marca;
	private int cantPuertas;
	private int km;
	private int cantRuedas;
	private String tipoV;
	
	
	public Auto(){}
	
	public Auto (String tipoV, String m, int cPuertas,int kilometraje, int cRuedas){
		tipoV = tipoV;
		marca = m;
		cantPuertas = cPuertas;
		km = kilometraje;
		cantRuedas = cRuedas;
	}
	

	//Getters y Setters
	
	public String getMarca() {
		return marca;
	}

	public String getTipoV() {
		return tipoV;
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


	public String toString() {
		return "Vehiculo: Auto [Tipo Vehiculo" +tipoV + ", Marca= " + marca + ", Puertas= " + cantPuertas + ", KM=" + km + ", Ruedas a Cambiar=" + cantRuedas + "]";
	}
	
	
	
	
}
