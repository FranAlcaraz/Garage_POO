package garage;

public class Garage {

	private String nombreGarage;
	private double precioCambio;
	private int vMax;
	private int cRuedas;
	private Auto auto;
	private Moto moto;
	private Cliente cliente;
	private int ingAuto;
	private int ingMoto;
	private int vehiculos;
	
	
	public void setNombreGarage(String nombreGarage) {
		this.nombreGarage = nombreGarage;
	}
	public String getNombreGarage() {
		return nombreGarage;
	}	
	public void setFijarPrecio(double precioCambio) {
		this.precioCambio = precioCambio;
	}
	public double getFijarPrecio() {
		return precioCambio;
	}
	public void setMaximoVehiculos (int vMax){
		this.vMax=vMax;
	}
	public int getMaximoVehiculos (){
		return vMax;
	}
	
	
	public void setIngresoAuto(int ingAuto, Auto auto) {
		this.ingAuto = ingAuto;
		this.auto=auto;
		ingAuto ++;
	}
	public int getIngresoAuto() {
		return ingAuto;
	}
	public void setIngresoMoto(int ingMoto, Moto moto) {
		this.ingAuto = ingMoto;
		this.moto=moto;
		ingMoto ++;
	}
	public int getIngresoMoto() {
		return ingMoto;
	}
	
	
	
	public void sumarVehiculo(){
		vehiculos = ingAuto + ingMoto;
	}
	public void alertaMax(){
		if (vehiculos>=10){
		System.out.println("No caben más vehiculos...lo sentimos!");
		}
		
	}
	
	
	
}
