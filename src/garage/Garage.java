package garage;


public class Garage {

	private String nombreGarage;
	private double precioCambio;
	private int vMax;
	private int cRuedas;
	private int ingAuto;
	private int ingMoto;
	private int vehiculos;
	private Cliente[] clientes;
	private int numeroDeClientes;
	
	
    public Garage(){}//contructor por default
    
	public Garage(String nombreGarage) {
		this.nombreGarage = nombreGarage;
	}
	
	public void openGarage(double precioCambio, int vMax, int cRuedas){
		this.precioCambio = precioCambio;
		this.vMax = vMax;
		this.cRuedas = cRuedas;
		clientes = new Cliente[20];
		numeroDeClientes = 0;
	}
	
	public void nuevoCliente (String nombre){
		int i = numeroDeClientes++;
		clientes[i] = new Cliente (nombre);
		}

	public int getNumDeCliente() {
		return numeroDeClientes;
	}
	
	public Cliente getCliente(int customer_index){
		return clientes[customer_index];
	}
}
