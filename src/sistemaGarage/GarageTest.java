package sistemaGarage;




public class GarageTest {

	public static void main(String[] args) {
		
		//Creacion de Objeto
		Garage garage = new Garage(5,1000,25);
		
		//Getters y Setters
		garage.setNombreGarage("Daytona");
		garage.getNombreGarage();
		
		//Metodos
		garage.nuevoClienteAuto("Franco","A", "auto", "Ford", 2, 1234, 4);
		garage.nuevoClienteMoto("Tomas","B", "moto", "Yamaha", 122, 124, 2);
		garage.nuevoClienteMoto("Tomas","c", "moto", "Yamaha", 122, 14, 2);
		garage.nuevoClienteMoto("Tomas","d", "moto", "Yamaha", 122, 12234, 2);
		garage.nuevoClienteMoto("Tomas","e", "moto", "Yamaha", 122, 12534, 2);
		garage.nuevoClienteMoto("Tomas","f", "moto", "Yamaha", 122, 1000, 2);
		garage.nuevoClienteAuto("Franco","B", "auto", "Ford", 2, 1789, 4);
		garage.nuevoClienteAuto("Fra","A", "auto", "Ford", 2, 13256, 4);
		garage.nuevoClienteMoto("Toas","B", "moto", "Yamaha", 122123, 1234, 2);
		garage.nuevoClienteMoto("mas","c", "moto", "Yamaha", 12, 1234, 2);
		garage.nuevoClienteMoto("as","d", "moto", "Yamaha", 2222, 1234, 2);
		garage.nuevoClienteMoto("To","e", "moto", "Yamaha", 111, 1234, 2);
		garage.nuevoClienteMoto("ms","f", "moto", "Yamaha", 333, 1234, 2);
		garage.nuevoClienteAuto("nco","B", "auto", "Ford", 2, 14567, 4);
		garage.nuevoClienteAuto("Fanco","B", "auto", "Ford", 2, 19685, 4);
		garage.nuevoClienteAuto("Fo","C", "auto", "Ford", 2, 124, 4);
		garage.nuevoClienteAuto("nco","F", "auto", "Ford", 2, 134, 4);
		garage.nuevoClienteAuto("Franco","G", "auto", "Ford", 2, 1444, 4);
		garage.nuevoClienteMoto("Tobbbbbbb","e", "moto", "Yamaha", 122, 19994, 2);
		garage.nuevoClienteMoto("Tobbb","e", "moto", "Yamaha", 122, 9999, 2);
		
		
		//Bucles & SYSO Ingreso de Vehiculos
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
				
		//Salida de vehiculos
		garage.retiroAuto(garage.nRandom());
		garage.retiroMoto(garage.nRandom());

		//Bucles & SYSO Salida de Vehiculos
		for (int i = 0; i < garage.getvMax() ; i++){
			if(garage.getMoto(i)!= null || garage.getAuto(i)!= null){
				if(garage.getAuto(i) != null){
					System.out.println("["+"Auto "+(i)+"]"+ garage.getAuto(i));
					}else{}
				if(garage.getMoto(i)!= null){
					System.out.println("["+"Moto "+(i)+"]" + garage.getMoto(i));		
				}else{}		
			}else{}
			}//for
				
		garage.promedioKmAuto();
		garage.promedioKmMoto();
		garage.cierreGarage();
		
		}//main
		}//clase


	

