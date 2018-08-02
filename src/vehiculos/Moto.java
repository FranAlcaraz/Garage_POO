package vehiculos;

public class Moto {

	private String marca;
	private int cc; //abstraccion (Se identifica un Elemento del objeto completo)
	private int km;
	private int cantRuedas;
	private String tipoV;
	private String nombre;
	private String apellido;
	
	public Moto(){}
	
	public Moto (String n, String a, String tipoVe, String m, int cilindrada, int kilometraje, int cRuedas){ //constructor sobrecargado Moto
		this.tipoV = tipoVe;
		marca = m;
		cc = cilindrada;
		km = kilometraje;
		cantRuedas = cRuedas;
		this.nombre=n;
		this.apellido=a;
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


	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String toString() {
		return "(Nombre cliente= "+nombre+" "+apellido+" ;Marca= " + marca + " ;Cilindrada= " + cc + " ;KM= " + km + " ;Ruedas a Cambiar=" + cantRuedas + ")";
	}
	
	
	
	
}
