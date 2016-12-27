import java.util.Arrays;											//DONE


public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];

	}

	public void addValue(int value) {
		
		
		//Creating a new array first
		int[] data2 = new int[data.length +1];
		
		
		//making sure the array copies our old values over
		for(int i = 0; i<data.length; i++){
			
			data2[i] = data[i];
		}
		//Adding new value to array
		data2[data.length] = value;
		data = data2;

	}

	public void addValues(int[] values) {
		
		//Get number of values
		int size = values.length;
		
		//Make new array with space for new values
		int []data3 = new int[data.length + size];
		
		//copy values from old array into new
		for(int i= 0;i<data.length;i++){
			
			data3[i] = data[i];
		}
		
		//Adding values from values array
		int k = 0;
		
		for(int j = data.length; j < data3.length; j++){
			
			data3[j] = values[k];
			k++;
		}
			data = data3;

	}

	public int getMinimumValue() {
		//Get the array length
		int i = data.length;
		
		
		int min = 0;
		
		if(i == 0){
		//if the array length is 0, do nothing;see Fragestellung	
			
		}
		else{
			//make a variable the first value of the array
			int j = data[0];
			
			//checking if any value is smaller than it, in which case it then takes on that value
			for(int check = 0; check<i;check++){
				
				if(data[check] < j){
					
					j = data[check];
					min = j;
				}
				
			}
		}
		
		
		
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int x = data.length;
		int zahl = 0;
		
		//Go through array to see how many are greater than threshold
		for(int i = 0; i< x;i++){
			
			if(data[i]> threshold){
				
				zahl++;
			}
			else{
				
				
			}
			
		}
		int size = zahl;
		
		//create a new array with the size of the values above threshold
			int[] data4 = new int[size];
		
			
			int t = 0;//Helper variable to know where to place values in data4
		for(int go = 0;go<data.length;go++){
			
			if(data[go]> threshold){
				
				data4[t] = data[go];
				t++;
				
			}
			
		}
		
		
		
		
		return data4;
	}

	// --------------------------------------------------------------
	
	public void printData() {
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		Measurement m = new Measurement();
		System.out.println("Neues Measurement-Objekt m erzeugt. m:");
		// ErwarteteAusgabe:
		// []
		m.printData();

		System.out.println("------------------------------------------------------------------");
		
		m.addValue(85);
		System.out.println("Hinzufügen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzfügen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte über 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte über 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
