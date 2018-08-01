package sistemaGarage;

import vehiculos.Auto;
import vehiculos.Moto;

public class Garage {

	private String nombreGarage;
	private double precioCambio;
	private int vMax;
	private int stock;
	private int ingAuto;
	private int ingMoto;
	private int vehiculos;
	private Cliente[] clientes;
	private Moto [] motos;
	private Auto [] autos;
	private int numeroDeClientes = 0;
	private int numeroDeAutos = 0;
	private int numeroDeMotos = 0;
	private int kMoto;
	private int kAuto;
	
	
    public Garage(){
    	clientes = new Cliente[20];
		numeroDeClientes = 0;
		autos = new Auto[10];
		numeroDeClientes = 0;
		motos = new Moto[10];
		numeroDeClientes = 0;
    }
    
	public Garage(String nombreGarage) {//agregar vMax
		this.nombreGarage = nombreGarage;
	}
	
	public void nuevoClienteAuto (String n, String a, String m, int cPuertas,int kilometraje, int cRuedas){
		int i= numeroDeClientes++;
		clientes[i] = new Cliente (n,a);
		int k= numeroDeAutos++;
		autos[k] = new Auto (m,cPuertas,kilometraje,cRuedas);
		kAuto= kAuto+kilometraje;
		
		}
	
	public void nuevoClienteMoto (String n, String a, String m, int cilindrada, int kilometraje, int cRuedas){
		int i= numeroDeClientes++;
		clientes[i] = new Cliente (n,a);
		int k= numeroDeMotos++;
		motos[k] = new Moto (m,cilindrada,kilometraje,cRuedas);
		kMoto= kMoto+kilometraje;
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
}
