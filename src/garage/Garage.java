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
	
	public void nuevoCliente (String nombre, String tipoVehiculo){
		int i = numeroDeClientes++;
		clientes[i] = new Cliente (nombre, tipoVehiculo);
		if (tipoVehiculo == "auto"){
			ingAuto++;
			cRuedas = cRuedas-4;
		}else if(tipoVehiculo == "moto"){
			ingMoto++;
			cRuedas = cRuedas - 2;
		}else{
			System.out.println("Lo sentimos, no aceptamos este tipo de vehiculos");
		}
	}
		

	
}
