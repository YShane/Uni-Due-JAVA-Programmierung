
public class Uebung7 {
	
	
	
	public static void hanoi(int hoehe, String a, String b, String c) {
		// Parameter in o. g. Reihenfolge: Höhe des zu verschiebenden Turms; Stab, auf dem sich der
		// Turm zu Beginn befindet; Stab zum "Zwischenparten"; Stab, zu dem der Turm letztendlich
		// verschoben werden soll
		
		if (hoehe == 1) {
			// Turm der Höhe "1" kann unmittelbar verschoben werden
			System.out.println("Turm " + a + " -> Turm " + c);
		}
		else {
			// ansonsten rekursiv:
			hanoi(hoehe-1, a, c, b); // den Turm ohne die unterste Scheibe nach b verschieben
			hanoi(1, a, b, c);		 // jetzt unterste Scheibe nach c
			hanoi(hoehe-1, b, a, c); // den auf b "geparkten" Turm danach ebenfalls nach c verschieben
		}
	}
 
    public static void main(String[] args) {
    	// die drei Stäbe mögen mit 'a', 'b' und 'c' bezeichnet werden
    	// der zu verschiebende Turm habe die Höhe 3
    	
    	hanoi(3, "bla", "red", "green");
    }
}



