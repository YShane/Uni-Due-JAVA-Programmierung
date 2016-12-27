
public class Lift {

	private String name;     // Bezeichnung des Lifts
	private int laenge;		 // in Metern
	private int hdiff;		 // Höhendifferenz (positive Zahl falls aufwärts, negative Zahl falls abwärts)
	private int punkte;		 // für Liftbenutzung
	private boolean status;  // offen (true) oder geschlossen (false)
	
	private Station ziel;	 // wohin führt der Lift?

	
	Lift() {
		// bleibt leer
	}
	
	public Lift(String name, int punkte, int laenge, int hdiff, boolean status, Station ziel) {
		// erzeuge ein Objekt der Klasse Lift mit den übergebenen Werten
		
		this.name = name;
		this.laenge = laenge;
		this.hdiff = hdiff;
		this.punkte = punkte;
		this.status = status;
		this.ziel = ziel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getHdiff() {
		return hdiff;
	}

	public void setHdiff(int hdiff) {
		this.hdiff = hdiff;
	}

	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Station getZiel() {
		return ziel;
	}

	public void setZiel(Station ziel) {
		this.ziel = ziel;
	}
	
	
}
