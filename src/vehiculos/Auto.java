package vehiculos;

public class Auto {

		private String marca;
	private int cantPuertas;
	private int km;
	private int cantRuedas;
	
	
	public Auto(){}
	
	public Auto (String m, int cPuertas,int kilometraje, int cRuedas){
		marca = m;
		cantPuertas = cPuertas;
		km = kilometraje;
		cantRuedas = cRuedas;
	}
	

	//Getters y Setters
	
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


	public String toString() {
		return "Vehiculo: Auto [Marca= " + marca + ", Puertas= " + cantPuertas + ", KM=" + km + ", Ruedas a Cambiar=" + cantRuedas + "]";
	}
	
	
	
	
}
