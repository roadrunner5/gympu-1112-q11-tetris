package Lösungen.Aufgabe2;

public class Artikel {
	private String name;
	private double betrag;
	
	public Artikel(String name, double b) {
		this.name = name;
		this.betrag = b;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBetrag() {
		return betrag;
	}
}
