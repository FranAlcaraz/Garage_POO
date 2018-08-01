package sistemaGarage;

import vehiculos.Auto;
import vehiculos.Moto;

public class Cliente {
	
	private String nombreC;
	private String apellidoC;
	private Auto auto;
	private Moto moto;

	
	public Cliente(String n, String a){
		nombreC=n;
		apellidoC=a;
	}

	public String getNombreC() {
		return nombreC;
	}
	public String getApellidoC() {
		return apellidoC;
	}


	public String toString() {
		return "Nombre Cliente= " + nombreC +" "+ apellidoC + "]";
	}
	
	
	
	
	
	
	/*public Cliente (String nCliente){
		this.nCliente = nCliente;
		this.numeroDeMoto = 0;
	}
	
	public void Moto (String m, int cilindrada, int kilometraje, int cRuedas){
		int i= numeroDeMoto++;
		motos[i] = new Moto (m, cilindrada, kilometraje, cRuedas);
	}
	
	public void Auto (String m, int cPuertas, int kilometraje, int cRuedas){
		int k= numeroDeAuto++;
		autos[k] = new Auto (m, cPuertas, kilometraje, cRuedas);
	}
	
	public String getnCliente() {
		return nCliente;
	}
	
	public int getNumeroDeMoto() {
		return numeroDeMoto;
	}*/
	}

