public class IntArrays
{
	/*
	 * Diese Methode soll den Durchschnitt aus allen Zahlen im Array array
	 * berechnen und zurueckgeben. Der Durchschnitt ist dabei
	 * (array[0] + array[1] + ... + array[n-2] + array[n-1])/n
	 * wobei n die Anzahl der Werte im Array ist.
	 */
	public static double durchschnitt(int[] array)
	
	{
		int l = array.length;
		//int c = l-1;
		int z = 0;
		for(int i = 0; i<l; i++){
			z = z + array[i];
			
		}
		;
		return ((double)z/l);
	}
	
	/*
	 * Diese Methode soll den Median aus einem Array berechnen und zurueckgeben.
	 * Der Median ist diejenige Zahl, die in einem sortierten Array in der Mitte steht.
	 * Hat das Array eine gerade Anzahl von Elementen, ist es der Durchschnitt von beiden Zahlen,
	 * die in der Mitte stehen.
	 * Du kannst bei der Bearbeitung dieser Aufgabe davon ausgehen, dass das Array bereits sortiert ist.
	 */
	public static double median(int[] array)
	{
		double ans;
		int l = array.length;
		if(l%2==0){
			
			int c = l/2;
			int d = c-1;
			
			ans = ((array[c] + array[d])/2);
		}
		else{
			
			int f = (l-1)/2;
			ans = array[f];
			
		}
		return ans;
	}
	
	/*
	 * Die Main Methode. Du kannst dir hier verschiedene Testfaelle ausdenken und testen.
	 */
	public static void main(String[] args) {
		int[] test = {3, 4, 5, 9, 12, 16, 56};
		System.out.println("Beim Aufruf der Methode 'public static double durchschnitt(int[] array)' mit dem Parameter test sollte herauskommen:"
				+ "\n 15"
				+ "\n Bei dir kommt heraus:"
				+ durchschnitt(test));
		System.out.println("Beim Aufruf der Methode 'public static double median(int[] array)' mit dem Parameter test sollte herauskommen:"
				+ "\n 9"
				+ "\n Bei dir kommt heraus:"
				+ median(test));
	}
}
