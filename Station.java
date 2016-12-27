
public class Station {

	private String name;    // Bezeichnung der Station
	private boolean huette; // true, falls Hütte vorhanden
	
	private Lift[] lifte;   // von Station AUSGEHENDE Lifte
	private Piste[] pisten; // von Station AUSGEHENDE Pisten
	
	
	

	Station() {
		// bleibt leer
	}
	
	Station(String name, boolean huette) {
		// erzeuge ein Objekt der Klasse Station mit den übergebenen Werten
		
		this.name = name;
		this.huette = huette;
	}
	
	
	public void setzeAusgehendeLifte(Lift[] lifte) {
		// setze die von der Station AUSGEHENDEN Lifte entsprechend des übergebenen Arrays
		
		this.lifte = lifte;
	}
	
	public void setzeAusgehendePisten(Piste[] pisten) {
		// setze die von der Station AUSGEHENDEN Pisten entsprechend des übergebenen Arrays
		
		this.pisten = pisten;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHuette() {
		return huette;
	}

	public void setHuette(boolean huette) {
		this.huette = huette;
	}

	public Lift[] getLifte() {
		return lifte;
	}

	public void setLifte(Lift[] lifte) {
		this.lifte = lifte;
	}

	public Piste[] getPisten() {
		return pisten;
	}

	public void setPisten(Piste[] pisten) {
		this.pisten = pisten;
	}
}
