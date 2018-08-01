package sistemaGarage;

import java.util.Random;

import vehiculos.Auto;
import vehiculos.Moto;


public class GarageTest {

	public static void main(String[] args) {
		
		//Creacion de Objeto
		Garage garage = new Garage(5,1000,25);
		
		//Getters y Setters
		garage.setNombreGarage("Daytona");
		garage.getNombreGarage();
		
		//Metodos
		garage.nuevoClienteAuto("Franco","A", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteMoto("Tomas","B", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("Tomas","c", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("Tomas","d", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("Tomas","e", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("Tomas","f", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteAuto("Franco","B", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteAuto("Fra","A", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteMoto("Toas","B", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("mas","c", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("as","d", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("To","e", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("ms","f", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteAuto("nco","B", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteAuto("Fanco","B", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteAuto("Fo","C", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteAuto("nco","F", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteAuto("Franco","G", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteMoto("Tobbbbbbb","e", "moto", "Yamaha", 122, 1234, 2);
		garage.nuevoClienteMoto("Tobbb","e", "moto", "Yamaha", 122, 1234, 2);
		
		
		//Bucles & SYSO
		for (int i = 0; i < garage.getvMax() ; i++){
			if(garage.getMoto(i)!= null || garage.getAuto(i)!= null){
				if(garage.getAuto(i) != null){
					System.out.println("["+"Auto "+(i)+"]"+ garage.getAuto(i));
					}else{}
				if(garage.getMoto(i)!= null){
					System.out.println("["+"Moto "+(i)+"]" + garage.getMoto(i));		
				}else{}		
			}else{}
			}
		garage.alertaVehiculos();
		
		
		Random rnd = new Random();
		int aleatorio= rnd.nextInt(5);
		int aleatorio2= rnd.nextInt(5);
		System.out.println(aleatorio);
		System.out.println(aleatorio2);
		
		garage.retiroAuto(aleatorio);
		garage.retiroMoto(aleatorio2);
		
		for (int i = 0; i < garage.getvMax() ; i++){
			if(garage.getMoto(i)!= null || garage.getAuto(i)!= null){
				if(garage.getAuto(i) != null){
					System.out.println("["+"Auto "+(i)+"]"+ garage.getAuto(i));
					}else{}
				if(garage.getMoto(i)!= null){
					System.out.println("["+"Moto "+(i)+"]" + garage.getMoto(i));		
				}else{}		
			}else{}
			}
		
		
		}//main
		}//clase


	

