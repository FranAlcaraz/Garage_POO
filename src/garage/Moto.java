package garage;

public class Moto {

	private String tipoVehiculo;
	private String marca;
	private int cc;
	private int km;
	private int cantRuedas;
	
	
	public String getTipoVehiculo() {
		return marca;
	}
	public void settipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}


	public String toString() {
		return "Moto [marca=" + marca + ", cc=" + cc + ", km=" + km + ", cantRuedas=" + cantRuedas + "]";
	}
	
	
	
	
}
