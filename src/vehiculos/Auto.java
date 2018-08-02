package vehiculos;

public class Auto {

	private String marca;
	private int cantPuertas; //Abstraccion (Reconocemos un Elemento del objeto)
	private int km;
	private int cantRuedas;
	private String tipoV;
	private String nombre;
	private String apellido;
	
	
	public Auto(){}//contructor por default
	
	public Auto (String n, String a, String tipoV, String m, int cPuertas,int kilometraje, int cRuedas){ //constructor sobrecargado
		this.tipoV = tipoV;
		marca = m;
		cantPuertas = cPuertas;
		km = kilometraje;
		cantRuedas = cRuedas;
		this.nombre=n;
		this.apellido=a;
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

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String toString() {
		return "(Nombre cliente= "+nombre+" "+apellido+" ;Marca= " + marca + " ;Puertas= " + cantPuertas + " ;KM=" + km + " ;Ruedas a Cambiar=" + cantRuedas + ")";
	}
	
	
	
	
}
