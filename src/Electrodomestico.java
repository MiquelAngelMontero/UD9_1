/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Electrodomestico {
	
	protected final double PRECIOBASE = 100;
	protected final String COLOR = "blanco";
	protected final char CONSUMOE = 'F';
	protected final double PESO = 5;
	
	//Atributos
	protected double precioBase = PRECIOBASE;
	protected String color = COLOR;
	protected char consumoE = CONSUMOE;
	protected double peso = PESO;
	
	
	//Constructores
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoE = CONSUMOE;
		this.peso = PESO;
	}

	
	//Constructor con precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = "blanco";
		this.consumoE = 6;
		this.peso = peso;
	}

	
	//Constructor completo
	public Electrodomestico(double precioBase, String color, char consumoE, double peso) {
		this.precioBase = precioBase;
		this.color = comprovarColor(color);
		this.consumoE = comprovarConsumo(consumoE);
		this.peso = peso;
	}
	
	//Metodos
	//Metodo para comprovar color
	public String comprovarColor(String colorIntr) {
		
		String colorIntrMin = colorIntr.toLowerCase();
		switch (colorIntrMin) {
		
			case "blanco":
				return colorIntr;
			case "negro":
				return colorIntr;
			case "rojo":
				return colorIntr;
			case "azul":
				return colorIntr;
			case "gris":
				return colorIntr;
			default:
				return "blanco";
		}
		
	}
	
	//Metodo para comprovar consumo
	public char comprovarConsumo(char consumo) {
		
		if((consumo >= 65) && (consumo <= 70)) {
			return consumo;
		}else {
			return 70;
		}
		
	}

	public double precioFinal() {
		
		double precioF = 0;
		//Añadir precio dependiendo del peso
		if((peso >= 0) & (peso <= 19)) {
			precioF = precioBase + 10;
		}else if((peso >= 20) & (peso <= 49)) {
			precioF = precioBase + 50;
		}else if((peso >= 50) & (peso <= 79)) {
			precioF = precioBase + 80;
		}else if(peso >= 80) {
			precioF = precioBase + 100;
		}else {
			System.out.println("El peso introducido no es correcto");
		}
		
		//Añadir precio dependiendo del consumo
		switch(consumoE) {
		
			case 'A':
				precioF = precioF + 100;
				break;
			case 'B':
				precioF = precioF + 80;
				break;
			case 'C':
				precioF = precioF + 60;
				break;
			case 'E':
				precioF = precioF + 50;
				break;
			case 'F':
				precioF = precioF + 30;
				break;
			default:
				System.out.println("El consumo introducido no es correcto");		
		}
		
		return precioF;
		
	}
	
	//To String
	@Override
	public String toString() {
		return "Electrodomestico [PRECIOBASE=" + PRECIOBASE + ", COLOR=" + COLOR + ", CONSUMOE=" + CONSUMOE + ", PESO="
				+ PESO + ", precioBase=" + precioBase + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso
				+ "]";
	}

	
	
	//Metodo Get
	public double getPrecioBase() {
		return precioBase;
	}


	public String getColor() {
		return color;
	}


	public char getConsumoE() {
		return consumoE;
	}


	public double getPeso() {
		return peso;
	}
	

	
	
}