package Lösungen.Aufgabe5;

public class Pfandautomat {
	private double aktuellerBon = 0;
	
	public Pfandautomat() {
		
	}
	
	/**
	 * Es werden nur Flaschen vom Typ 1,2 oder 3 angenommen.
	 * @param f Flasche
	 * @return null, wenn Flasche angenommen wurde. f, wenn Flasche nicht angenommen wurde.
	 */
	public Flasche flascheEingeben(Flasche f) {
		if(f != null && f.getType() == 1 || f.getType() == 2 || f.getType() == 3) {
			aktuellerBon += 0.07;
			return null;
		}
		else {
			return f;
		}
	}
	
	public Bon getBon() {
		Bon b = new Bon(aktuellerBon);
		aktuellerBon = 0;
		return b;
	}
}
