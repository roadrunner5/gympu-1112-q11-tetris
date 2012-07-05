package Lösungen.Aufgabe4;


public class Fahrkartenautomat {
	private double guthaben = 0;
	
	public Fahrkartenautomat() {
		// TODO Auto-generated constructor stub
	}
	
	public void muenzeEinwerfen(Muenze m) {
		guthaben += m.getWert();
	}
	
	public void geldscheinEinfuehren(Schein s) {
		guthaben += s.getWert();
	}
	
	public Karte karte1() {
		if(guthaben >= 2.00) {
			guthaben -= 2;
			return new Karte("Karte1");
		}
		else {
			return null;
		}
	}
	
	public Karte karte2() {
		if(guthaben >= 1.00) {
			guthaben -= 1;

			return new Karte("Karte2");
		}
		else {
			return null;
		}
	}
	
	public Karte karte3() {
		if(guthaben >= 2.00) {
			guthaben -= 2;
			return new Karte("Karte3");
		}
		else {
			return null;
		}
	}
	
	public double getRueckgeld() {
		double w = guthaben;
		guthaben = 0;
		return w;
	}
}
