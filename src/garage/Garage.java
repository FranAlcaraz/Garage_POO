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
	
	
	
	public Garage(String nombreGarage, double precioCambio, int vMax) {
		this.nombreGarage = nombreGarage;
		this.precioCambio = precioCambio;
		this.vMax = vMax;
	}
	
	
	public void setCambiarRuedas(int cRuedas){
		this.cRuedas=cRuedas;
	}
	
	public int getCambiarRuedas(){
		return cRuedas;
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
