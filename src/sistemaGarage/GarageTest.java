package sistemaGarage;

import vehiculos.Auto;
import vehiculos.Moto;


public class GarageTest {

	public static void main(String[] args) {
		//Creacion de Objeto
		Garage garage = new Garage(25,1000,25);
		
		//Getters y Setters
		garage.setNombreGarage("Daytona");
		garage.getNombreGarage();
		
		//Metodos
		garage.nuevoClienteAuto("Franco", "Modarelli", "Audi", 4, 1234, 4);
		garage.nuevoClienteAuto("Guido", "Modarelli", "Audi", 4, 24506, 4);
		garage.nuevoClienteMoto("Nicolas", "Rios", "Yamaha", 123, 4321, 2);
		
		//Bucles
		for (int i = 0; i < garage.getNumDeCliente() ; i++){
			System.out.println(garage.getCliente(i) + "["+i+"]"+ " " + garage.getMoto(i));
			
			}
		System.out.println("kilometros autos " + garage.getkAuto());
		}
		
		
		
		/*garage.nuevoCliente("Franco", "Modarelli");
		garage.nuevoCliente("Thomas", "Wiersch");
		garage.nuevoCliente("German", "Pardo");
		garage.nuevoCliente("Nicolas", "Rios");

		for (int i = 0; i < garage.getNumDeCliente() ; i++) {
			//System.out.println(garage.getCliente(i) + "["+i+"]");
			Cliente c1 = garage.getCliente(i);
			//System.out.println(c1.getNombreC());*/
		}


	

