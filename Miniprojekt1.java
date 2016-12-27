/**
 *
 * @author Shane Yankam
 */

public class Miniprojekt1 {

	public static double endNote(int noteUebung, int noteAusarbeitung,
			int noteVortrag) {
		// hier die Lösung eintragen...
		
		double a = ((double)noteUebung*	1);
		double b = ((double)noteAusarbeitung *3);
		double c = ((double)noteVortrag * 2);
		
	return (a+b+c)/6;
	}

	public static double tarif1(int min) {
		// hier die Lösung eintragen...
		
		 double x = 7.99;
		 double t = min *0.37;
		 return x+t;
	}

	public static double tarif2(int min) {
		// hier die Lösung eintragen...
		
		double x = 19.95;
		double t = min-30;
		return (t* 0.25) + x;
	}

	public static double tarif3(int min) {
		// hier die Lösung eintragen...
		double x = 24.95;
		double t = min-50;
		return (t*0.19)+ x;
	}

	public static boolean tripel(int a, int b, int c) {
		// hier die Lösung eintragen...
		boolean x = false;
		int square = c*c;
		if((a*a)+(b*b)== square){
			x = true;
			
		}
		
		return x;
	}

	public static boolean checkEven(int zahl) {
		
		boolean c = false;
		if(zahl%2==0){
			
			c = true;
		}
		return c;
		// hier die Lösung eintragen...v
	}

	public static boolean checkOdd(int zahl) {
		
		boolean c = true;
		if(zahl%2==0){
			c = false;
		}
		// hier die Lösung eintragen...
		return c;
	}

	public static boolean schaltjahr(int jahr) {
		// hier die Lösung eintragen...
		boolean leap = false;
		if (jahr%4 == 0 && jahr%100 != 0)
        {
           leap = true;
        }
        else if ((jahr%4 == 0) && (jahr%100 == 0) && (jahr%400 == 0))
                {
                   leap = true;
                }
        
        else {
            leap = false;
        }
		return leap;
	}

	public static boolean enthaeltPunkt(int x, int y) {
		// hier die Lösung eintragen...
		boolean b = false;
		
		if((x>2)&& (x<14)){
			
			if((y>-15) && (y<3)){
				
				b = true;
			}
		}
		return b;
	}

	public static double kreisFlaeche(double radius) {
		// hier die Lösung eintragen...
		return Math.PI * (radius*radius);
		
	}

	public static double kreisUmfang(double radius) {
		// hier die Lösung eintragen...
		
		return 2 *Math.PI * radius;
	}

	public static double rechteckFlaeche(double laenge, double breite) {
		
		return laenge* breite;
		// hier die Lösung eintragen...
	}

	public static boolean kreisKleinerRechteck(double radius, double laenge,
			double breite) {
		// hier die Lösung eintragen...
		boolean c = false;
		
		double x =kreisFlaeche(radius);
		double y = rechteckFlaeche(laenge,breite);
		if(x<y){
			c = true;
		}
		return c;
	}
	public static double steigung(double xA, double yA, double xB, double yB){
		
		double up = yB-yA;
		double down = xB - xA;
		
		return up/down;
		// hier die Lösung eintragen...
	}
	public static double rechteck1VergleicheRechteck2(double l1,double b1,double l2,double b2){
		// hier die Lösung eintragen...
		double one = rechteckFlaeche(l1,b1);
		double two = rechteckFlaeche(l2,b2);
		
		double ratio = one/two;
		return ratio;
	}

	public static void main(String[] s) {
		System.out
				.println("Die Endnode von dem Student mit Uebung(70), Ausarbeitung(50) und Vortrag(70): (60 ware richtig): "
						+ endNote(70, 50, 70));
		System.out
				.println("Tarif 1 kostet im Monat für 100 Gesprächsminuten: (44.99) "
						+ tarif1(100));
		System.out
				.println("Tarif 2 kostet im Monat für 130 Gesprächsminuten: (44.95) "
						+ tarif2(130));
		System.out
				.println("Tarif 3 kostet im Monat für 150 Gesprächsminuten: (43.95) "
						+ tarif3(150));
		System.out.println("Die Rueckgabe sollte true sein: "
				+ tripel(20, 21, 29));
		System.out.println("Die Rueckgabe sollte false sein: "
				+ tripel(1, 2, 3));
		System.out.println("Sollte true zurueckgeben: " + checkEven(42));
		System.out.println("Sollte false zurueckgeben: " + checkEven(27));
		System.out.println("Sollte true zurueckgeben: " + checkOdd(33));
		System.out.println("Sollte false zurueckgeben: " + checkOdd(36));
		System.out.println("2016 ist ein Schaltjahr: " + schaltjahr(2016)
				+ " (true waere richtig) ");
		System.out.println("2004 ist ein Schaltjahr: " + schaltjahr(2004)
				+ " (true waere richtig) ");
		System.out
				.println("R(5|4) liegt innerhalb der Flaeche? Sollte false zurueckgeben:  "
						+ enthaeltPunkt(5, 4));
		System.out
				.println("S(-5|-12) liegt innerhalb der Flaeche? Sollte false zurueckgeben:  "
						+ enthaeltPunkt(-5, -12));
		System.out.println("Flaeche Kreis Radius 3: " + kreisFlaeche(3));
		System.out.println("Umfang Kreis Radius 3: " + kreisUmfang(3));
		System.out
				.println("Ist die Flaeche einen Kreises mit Radius 6 kleiner als die Flaeche eines Rechtecks mit laenge 2 und Breite 3? Sollte false zurueckgeben:  "
						+ kreisKleinerRechteck(6, 2, 3));
		System.out
				.println("Die Steigung der Geraden AB mit A(2,2) und (4,6) ist 2: "
						+ steigung(2, 2, 4, 6));
		System.out
				.println("Die Flaeche von Rechteck1 mit der Laenge 3 und Breite 4 ist groesser als die Flaeche von Rechteck2 mit der Laenge 2 und Breite 3 mit dem Faktor 2: "
						+ rechteck1VergleicheRechteck2(3, 4, 2, 3));
	}
}
