import java.util.Arrays;

/*
 * In dieser Aufgabe soll das Zusammenspiel von Arrays und For-Schleifen geuebt
 * werden. In den meisten Methoden ist dem Parameter elements das Schluessel-
 * wort "final" vorgestellt. Das bedeutet, dass das Array in der Methode nur
 * gelesen, nicht aber beschrieben werden darf.
 */

public class ArraysAndLoops {
	
	// Diese Methode soll die Elemente des als Parameter (elements) uebergebenen
	// addieren und die Gesamtsumme zurueckgeben
	public static int sum(final int[] elements){
		
		int l = elements.length;
		int j = 0;
		for(int i= 0;i < l; i++){
			
			j = j + elements[i];
		}
		
		return j;
	}
	
	
	// Diese Methode soll in einem als Parameter (elements) uebergebenen Array
	// das groesste Element finden. Rueckgabewert soll das Produkt aus dem
	// groessten Element und dem Index des groessten Elements sein.
	// Beispiel: Eingabe   = {2, 13, 56, 44, 5}
	//           Rueckgabe = 56 (groesstes Element) * 2 (Index von 56) = 112
	// Nicht vergessen, dass die Indizierung in einem Array mit 0 beginnt!
	public static int maxElement(final int[] elements){
		int l = elements.length;
		int j = elements[0];
		int index = 0;
		for (int i = 1; i<l; i++){
			if(elements[i]>j){
				j = elements[i];
				index = i;
			}
			
		}
		
		return index*j;
	}
	

	// Diese Methode soll ein Array zurueckgeben, in dem alle Elemente des
	// uebergebenen Arrays dupliziert wurden und in der gleichen Reihenfolge
	// wie im Originalarray stehen. Beispiel:
	// Ubergeben wird ein Array der Form {4, 16, 8},
	// Das zurueckgegebene Array soll dann {4, 4, 16, 16, 8, 8} beinhalten.
	public static int[] duplicateElements(final int[] elements){
		
		int [] elementsCopy = elements;
		int l = elements.length;
		
		int z = l*2;
		
		int [] a = new int [z];
		int j = 1; 
		
		for(int i =0;i < l; i++){
			a[i+i] = elements[i];
			a[i+(i+1)] = elements[i];
		}
		
		
		return a;
	}
	
	
	// Diese Methode soll zu einem uebergebenen Array ein neues Array zurueck
	// geben, in dem zu jedem Element des Ausgangsarrays das Quadrat steht.
	// Beispiel: Eingabe   = {4,  12,  7}
	//           Rueckgabe = {16, 144, 49}
	public static int[] getSquares(final int[] elements){
		
		int l = elements.length;
		int [] nuevo = new int[l]; 
		
		for(int i = 0; i<l; i++){
			nuevo[i] = (elements[i]*elements[i]);
			
		}
		
		return nuevo;
	}
	
	
	// Diese Methode soll in einem uebergebenen Array die Reihenfolge der
	// Elemente umkehren.
	// Beispiel: Eingabe   = {4,  12,  7, 18}
	//           Rueckgabe = {18,  7, 12, 4}
	// ACHTUNG: Diese Methode hat keine Rueckgabe. Das Array Elements soll
	// nach Ausfuehrung der Methode das Ergebnis beinhalten.
	public static void reverseArray(int[] elements){
		
		int l = elements.length;
	int[]copy = new int[l];
	
	for(int i= 0; i<l; i++){
		
		copy[i] = elements[i];
	}
		int x = l-1;
		 
		//Arrays.fill(elements, 0);
		for(int i = 0; i<l;i++){
			
			elements[i] = copy[x];
			x--;
		}
		
		
	}

	
	// Hier koennt ihr eure Methoden testen
	public static void main(String[] args) {
		int []test1 = {2,3,4,5,6,7,8,9,10};	
	//	System.out.println(sum(test1));
	//	System.out.println(maxElement(test1));
	//	System.out.println(Arrays.toString(duplicateElements(test1)));
	//	System.out.println(Arrays.toString(getSquares(test1)));
		reverseArray(test1);
		
	}

}
