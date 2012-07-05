package Aufgabe3;

public class Lampe {
	private String name;
	public Lampe(String string) {
		this.name = string;
	}
	
	public void einschalten() {
		Oberflaeche.einschalten(name);
	}
	
	public void ausschalten() {
		Oberflaeche.ausschalten(name);
	}

}
