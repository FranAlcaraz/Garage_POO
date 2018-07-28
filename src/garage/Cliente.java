package garage;

public class Cliente {
	
	private String nCliente;
	private Auto[] auto;
	private Moto[] moto;
	private int numeroDeMoto;
	private int numeroDeAuto;
	
	public Cliente (String nombre){
		nCliente =nombre;
		moto = new Moto[10];
		numeroDeMoto = 0;
		auto = new Auto[10];
		numeroDeAuto = 0;
	}
	
	public void Moto (String m, int cilindrada, int kilometraje, int cRuedas){
		int i = numeroDeMoto++;
		moto[i] = new Moto (m, cilindrada, kilometraje, cRuedas);
	}
	
	public void Auto (String m, int cPuertas, int kilometraje, int cRuedas){
		int k= numeroDeAuto++;
		auto[k] = new Auto (m, cPuertas, kilometraje, cRuedas);
	}
	
	public String getnCliente() {
		return nCliente;
	}
	}

