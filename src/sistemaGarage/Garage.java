package sistemaGarage;

import java.util.Random;

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
		ingAuto++;
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
		ingMoto++;
		stock = stock - cRuedas;
		cambioCubiertas = precioCambio * cRuedas;
		caja = caja + cambioCubiertas;
		tipoV = tipoVe;
		}
	
	public void alertaVehiculos(){
		if (numeroDeClientes <= vMax){
		}else{
			System.out.println("Lo sentimos, pero estamos completos");
		}
	}
	
	public double promedioKmAuto(){
		kMedioA = kAuto / ingAuto;
		return kMedioA;
	}
	
	public double promedioKmMoto(){
		kMedioM = kMoto / ingMoto;
		return kMedioM;
	}
	
	public void retiroAuto(int i){
			ingAuto--;
			autos[i]=null;
	}
	public void retiroMoto(int i){
		ingMoto--;
		motos[i]=null;
	}
	
	public int nRandom(){
		Random rnd = new Random();
		int aleatorio1= rnd.nextInt(5);
		System.out.println("Se retira el vehiculo número " +" ["+ aleatorio1+"]");
		return aleatorio1;
	}
	
	public void cierreGarage(){
		System.out.println("Monto Total del Dia= "+caja+"\nStock al cierre= "+stock+"\nKilomentro Medio Moto= "+kMedioM+"\nKilomentro Medio Auto= "+ kMedioA);
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
