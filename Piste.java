
public class Piste {

	private String name;    // Bezeichnung der Piste
	private int laenge;     // in Metern
	private int hdiff;      // Höhendifferenz (positive Zahl falls aufwärts, negative Zahl falls abwärts)
	private char farbe;     // b)lau, r)ot oder s)chwarz
	private boolean status; // offen (true) oder gesperrt (false)
	
	private Station ziel;   // wohin führt die Piste?
	
	
	Piste() {
		// bleibt leer
	}
	
	public Piste(String name, char farbe, int laenge, int hdiff, boolean status, Station ziel) {
		// erzeuge ein Objekt der Klasse Piste mit den übergebenen Werten
		
		this.name = name;
		this.laenge = laenge;
		this.hdiff = hdiff;
		this.farbe = farbe;
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

	public char getFarbe() {
		return farbe;
	}

	public void setFarbe(char farbe) {
		this.farbe = farbe;
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
