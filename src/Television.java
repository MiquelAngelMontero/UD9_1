public class Television extends Electrodomestico{
		
		//Declaro la constante por defecto
		private final double RESO_DEFECTO=20;
		private final boolean SINTONIZADORTDT=false;
		
		//Declaro los atributos
		private double resolucion;
		private boolean sintonizadorTDT;
		
		//Constructor por defecto
		public Television() {
			super();
			this.resolucion = RESO_DEFECTO;
			this.sintonizadorTDT=SINTONIZADORTDT;
			this.precioBase = PRECIOBASE;
			this.color = COLOR;
			this.consumoE = CONSUMOE;
			this.peso = PESO;
		}
		
		//Constructor con precio y peso y el resto por defecto
		public Television(double precioBase, double peso) {
			super(precioBase, peso);
			this.sintonizadorTDT=SINTONIZADORTDT;
			this.resolucion = RESO_DEFECTO;
			this.color = COLOR;
			this.consumoE = CONSUMOE;
		}
		
		//Constructor con resolucion y tdt y el resto heredados
		
		public Television(double precioBase, String color, char consumoE, double peso, double resolucion, boolean sintonizadorTDT) {
			super(precioBase, color, consumoE, peso);
			this.sintonizadorTDT=sintonizadorTDT;
			this.resolucion = resolucion;
		}

		public double getResolucion() {
			return resolucion;
		}
		public boolean isSintonizadorTDT() {
			return sintonizadorTDT;
		}

		//Metodo precioFinal
		public double precioFinal() {
			double precioincremento=super.precioFinal();
			
			if (resolucion>40) {
				precioincremento+=precioBase*0.3;
			}
			if (sintonizadorTDT) {
				precioincremento+=50;
			}
			return precioincremento;
	}
}
