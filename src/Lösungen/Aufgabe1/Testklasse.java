package Aufgabe1;

public class Testklasse {
	public Testklasse() {
		Getraenkeautomat a = new Getraenkeautomat();
		
		Muenze m1 = new Muenze(1);
		Muenze m2 = new Muenze(0.5);
		Muenze m3 = new Muenze(0.5);
		
		a.muenzeEinwerfen(m1);
		a.muenzeEinwerfen(m2);
		a.muenzeEinwerfen(m3);
		
		Getraenk c = a.Cola();
		System.out.println(c.getName());
		
		
	}
	
	public static void main(String[] a) {
		new Testklasse();
	}
}
