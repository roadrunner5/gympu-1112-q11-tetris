package Lösungen.Aufgabe2;

public class Testklasse {
	public Testklasse() {
		Kasse k = new Kasse();
		
		Artikel a1 = new Artikel("Schokolade",2);
		Artikel a2 = new Artikel("Apfel",0.3);
		Artikel a3 = new Artikel("Mehl",1.5);
		
		k.ArtikelScannen(a1);
		k.ArtikelScannen(a2);
		k.ArtikelScannen(a3);
		
		System.out.println("Gebe 50 Euro");
		double rueckgeld = k.zahlen(50);
		
		System.out.println("Rueckgeld: " + rueckgeld);
		
	}
	
	public static void main(String[] a) {
		new Testklasse();
	}
}
