
public class Lavadora extends Electrodomestico {
	
	private final double CARGA = 5;
		
	//Atributos
	private double carga;
	
	//Constructores
	public Lavadora() {
		this.carga = CARGA;
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoE = CONSUMOE;
		this.peso = PESO;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
		this.color = COLOR;
		this.consumoE = CONSUMOE;
	}

	public Lavadora(double precioBase, String color, char consumoE, double peso, double carga) {
		super(precioBase, color, consumoE, peso);
		this.carga = carga;
	}

		
	//Metodos
	@Override
	public double precioFinal() {
		
		double precioF = super.precioFinal();
		if (carga > 30) {
			precioF = precioF + 50;
		}
		
		return precioF;

	}
	
	//Getters & Setters
	public double getCarga() {
		return carga;
	}


	
}
