
public class Quader {
	
	

	
	double hoehe, breite, tiefe;
	public Quader() { 
		
		// bleibt leer 
		} 
	public Quader(double hoehe, double breite, double tiefe) { 
		
		this.hoehe = hoehe;
		this.breite = breite;
		this.tiefe = tiefe;
	}
	
	public double getVolumen() { // ... 
		
		return hoehe*breite*tiefe;
		
	} 
	
	public double getOberflaeche() { 
			// ... }
		return hoehe * tiefe;
	}
}
