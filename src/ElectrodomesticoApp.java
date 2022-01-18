import java.util.ArrayList;
public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		double sumaE = 0, sumaL = 0;
		
		ArrayList<Electrodomestico> a1 = new ArrayList<Electrodomestico>();
		
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(600, 60);
		Electrodomestico e3 = new Electrodomestico(200, "rojo", 'D', 50);
		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora(250, 20);
		Lavadora l3 = new Lavadora(300, "negro", 'A', 60, 6);
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(l1);
		a1.add(l2);
		a1.add(l3);
		
		
		System.out.println("Precios: finales de cada electrodomestico");
		for (int i=0; i<a1.size(); i++) {			
			System.out.println(a1.get(i).precioFinal());			
		}
		
		System.out.println("Suma de cada tipo de electrodomestico");
		for (int i=0; i<a1.size(); i++) {			
			if (a1.get(i) instanceof Lavadora) {
				sumaL =+ a1.get(i).precioFinal();
			}else if (a1.get(i) instanceof Electrodomestico) {
				sumaE =+ a1.get(i).precioFinal();			
			}
		}
		
		System.out.println("El precio de las lavdoras da un total de: "+sumaE+"€");
		System.out.println("El precio de los electrodomesticos da un total de: "+sumaL+"€");
		
	}

}
