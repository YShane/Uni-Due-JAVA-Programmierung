
public class Uebung_A_6_3 {
	
	
	
	public static int ggT(int a, int b) {
		// Berechnet den ggT von a und b nach dem Euklidischen Algorithmus 
		if (a == 0) {
			return b; 
			}
		else { 
			while (b != 0) {
				
				if (a > b) {
					a = a - b; 
					}
				else { 
					b = b - a; 
					}
				}
			return a; 
				
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
