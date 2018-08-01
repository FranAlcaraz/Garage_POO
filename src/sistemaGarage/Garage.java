package sistemaGarage;

import vehiculos.Auto;
import vehiculos.Moto;

public class Garage {

	private String nombreGarage;
	private double precioCambio;
	private double cambioCubiertas;
	private double kMedioA;
	private double kMedioM;
	private double caja;
	private int vMax;
	private int stock;
	private int ingAuto;
	private int ingMoto;
	private int vehiculos;
	private int numeroDeClientes = 0;
	private int numeroDeAutos = 0;
	private int numeroDeMotos = 0;
	private int kMoto;
	private int kAuto;
	private Cliente[] clientes;
	private Moto [] motos;
	private Auto [] autos;
	private String tipoV;


	
	//Constructores
    
	public Garage() {}//Constructor por defecto
	
	public Garage(int vMax, int stock, double precioCambio){
    	autos = new Auto[1000];
		numeroDeClientes = 0;
		motos = new Moto[1000];
		numeroDeClientes = 0;
		this.vMax = vMax;
		this.stock = stock;
		this.precioCambio= precioCambio;
    }
    
		
	//Metodos
	public void nuevoClienteAuto (String n, String a,String tipoVe, String m, int cPuertas,int kilometraje, int cRuedas){
		numeroDeClientes ++;
		int i= numeroDeAutos++;
		autos[i] = new Auto (n,a,tipoVe,m,cPuertas,kilometraje,cRuedas);
		kAuto= kAuto+kilometraje;
		//ingAuto ++;
		stock = stock - cRuedas;
		cambioCubiertas = precioCambio * cRuedas;
		caja = caja + cambioCubiertas;
		tipoV = tipoVe;
		}
	
	public void nuevoClienteMoto (String n, String a, String tipoVe, String m, int cilindrada, int kilometraje, int cRuedas){
		numeroDeClientes ++;
		int i= numeroDeMotos++;
		motos[i] = new Moto (n,a,tipoVe, m,cilindrada,kilometraje,cRuedas);
		kMoto= kMoto+kilometraje;
		//ingMoto ++;
		stock = stock - cRuedas;
		cambioCubiertas = precioCambio * cRuedas;
		caja = caja + cambioCubiertas;
		tipoV = tipoVe;
		}
	
	
//		public void newCliente(String n, String a, String tipoVe, String m, int cPuertas, int cilindrada, int kilometraje, int cRuedas){
//			numeroDeClientes ++;
//			cambioCubiertas = precioCambio * cRuedas;
//			caja = caja + cambioCubiertas;
//			stock = stock - cRuedas;
//			tipoV = tipoVe;
//			if (tipoV=="auto"){
//				int i= numeroDeAutos++;
//				autos[i] = new Auto (n,a,tipoVe,m,cPuertas,kilometraje,cRuedas);
//				kAuto= kAuto+kilometraje;
//				ingAuto ++;
//			}else if (tipoV=="moto"){
//				int i= numeroDeMotos++;
//				motos[i] = new Moto (n,a,tipoVe, m,cilindrada,kilometraje,cRuedas);
//				kMoto= kMoto+kilometraje;
//				ingMoto ++;
//			}else{
//				System.out.println("Error");
//			}
//		}
	public void alertaVehiculos(){
		if (numeroDeClientes <= vMax){
		}else{
			System.out.println("Lo sentimos, pero estamos completos");
		}
	}
	
	public void promedioKmAuto(){
		kMedioA = kAuto / ingAuto;
	}
	
	public void promedioKmMoto(){
		kMedioM = kMoto / ingMoto;
	}
	
	
	
	//Getters y Setters
	public void setNombreGarage(String nombreGarage){
		this.nombreGarage=nombreGarage;
	}
		
	public String getNombreGarage(){
		System.out.println("Bienvenido a Daytona, por favor indiquenos Nombre, Apellido y su vehiculo. Gracias");
		return nombreGarage;
	}
	
	public int getNumDeCliente() {
		return numeroDeClientes;
	}
	
	public Cliente getCliente(int cliente_index){
		return clientes[cliente_index];
	}
	
	public int getNumDeMoto() {
		return numeroDeMotos;
	}
	
	public Moto getMoto(int moto_index){
		return motos[moto_index];
	}
	
	public int getNumDeAuto() {
		return numeroDeMotos;
	}
	
	public Auto getAuto(int auto_index){
		return autos[auto_index];
	}
	
	public int getkAuto (){
		return kAuto;
	}
	public int getkMoto (){
		return kMoto;
	}
	
	public double getPrecioCambio() {
		return precioCambio;
	}

	public double getCambioCubiertas() {
		return cambioCubiertas;
	}

	public double getkMedioA() {
		return kMedioA;
	}

	public double getkMedioM() {
		return kMedioM;
	}

	public double getCaja() {
		return caja;
	}

	public int getvMax() {
		return vMax;
	}

	public int getStock() {
		return stock;
	}

	public int getIngAuto() {
		return ingAuto;
	}

	public int getIngMoto() {
		return ingMoto;
	}

	public int getVehiculos() {
		return vehiculos;
	}
	
	public String getTipoV(){
		return tipoV;
	}

}
