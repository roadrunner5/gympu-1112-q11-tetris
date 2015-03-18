```
public interface ViewZuControler {
public void links();
public void rechts();
public void unten();
public void drehen();
public void pause();
public void tonAnAus();
public void halten();
public void absetzen();
public void menue();
public void beenden();
}

public interface ControlerZuModel {
public int[][] spielfeldLesen();
public int[][] aktuellerStein();
public int aktuellerSteinSchwerpunkt(); // 1..4 | -1
public void figurDrehen();
public void figurAufloesen();
public void figurSchrittRunter();
public void reiheLoeschen(int nummer);	// Nummer: 0 = oberste Reihe
}```