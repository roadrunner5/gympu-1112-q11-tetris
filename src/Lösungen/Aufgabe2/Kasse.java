package Lösungen.Aufgabe2;

public class Kasse {
	private double gesamtbetrag = 0;
	
	public Kasse() {
		
	}
	
	public void ArtikelScannen(Artikel a) {
		gesamtbetrag += a.getBetrag();
	}
	
	public double zahlen(double gegeben) {
		if(gegeben >= gesamtbetrag) {
			double g = gesamtbetrag;
			gesamtbetrag = 0;
			return (gegeben - g);
		}
		else {
			gesamtbetrag -= gegeben;
			return 0;
		}
	}
}
