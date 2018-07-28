package garage;


public class Garage {

	private String nombreGarage;
	private double precioCambio;
	private int vMax;
	private int cRuedas;
	private Auto auto;
	private Moto moto;
	private int ingAuto;
	private int ingMoto;
	private int vehiculos;
	private Cliente[] clientes;
	private int numeroDeClientes;
	
	
	
	public Garage(String nombreGarage, double precioCambio, int vMax, int cRuedas) {
		this.nombreGarage = nombreGarage;
		this.precioCambio = precioCambio;
		this.vMax = vMax;
		this.cRuedas = cRuedas;
	}
	
	public Garage(){
		clientes = new Cliente[10];
		numeroDeClientes = 0;
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
