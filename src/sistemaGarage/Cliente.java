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
	
	}

