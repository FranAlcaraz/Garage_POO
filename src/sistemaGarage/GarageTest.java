package sistemaGarage;

import vehiculos.Auto;
import vehiculos.Moto;


public class GarageTest {

	public static void main(String[] args) {
		
		//Creacion de Objeto
		Garage garage = new Garage(10,1000,25);
		
		//Getters y Setters
		garage.setNombreGarage("Daytona");
		garage.getNombreGarage();
		
		//Metodos
		garage.nuevoClienteMoto("Nicolas", "Rios","moto", "Yamaha", 123, 4321, 2);
		garage.nuevoClienteAuto("Franco", "Modarelli", "auto","Audi", 4, 1234, 4);
		garage.nuevoClienteAuto("Guido", "Modarelli","auto", "renault", 4, 24506, 4);
		garage.nuevoClienteAuto("Franco", "Mod", "auto","ford", 4, 1234, 4);
		garage.nuevoClienteAuto("Guido", "relli","auto", "bmw", 4, 24506, 4);//
		garage.nuevoClienteMoto("Ni", "Rios","moto", "maha", 123, 4321, 2);
		garage.nuevoClienteAuto("Fnco", "Modarelli", "auto","chevro", 4, 1234, 4);
		garage.nuevoClienteAuto("Gdo", "Modarelli","auto", "mercedes", 4, 24506, 4);
		garage.nuevoClienteMoto("Nlas", "Rios","moto", "Ya", 123, 4321, 2);
		garage.nuevoClienteAuto("Fro", "Mod", "auto","falcon", 4, 1234, 4);
		
		//Bucles & SYSO
		for (int i = 0; i < garage.getvMax() ; i++){
			if(garage.getTipoV() == "auto") {
				System.out.println(garage.getCliente(i) + "["+(i)+"]"+ " "+ "["+(i)+"]"+ garage.getAuto(i));
			}else {
				System.out.println(garage.getCliente(i) + "["+(i)+"]"+ " "+ "["+(i)+"]" + garage.getMoto(i));
			}
		}
		garage.alertaVehiculos();
		}
}


	

