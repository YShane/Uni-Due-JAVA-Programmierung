
public class Taschenrechner {
	
	/*
	 * Diese Methode soll a und b nach dem arithmetischen Symbol zeichen berechnen.
	 * rechne(3, 5, "+") --> 8
	 * rechne(10,5, "-") --> 5
	 * Als a und b werden dabei beliebige int Werte übergeben, zeichen ist eins der folgenden Zeichen:
	 * +,-,*,/
	 * 
	 * Die Zeichen können mit der Methode boolean String.equals(String) verglichen werden.
	 * zB:
	 * "abc".equals("abc") gibt true zurueck, zeichen.equals("potenz") gibt nur dann
	 * true zurueck, wenn zeichen tatsaechlich die Zeichenkette "potenz" enthaelt,
	 * sonst false.
	 * 
	 * Die Methode soll also bei zeichen = "+" a und b addieren, bei zeichen = "-"
	 * b von a subtrahieren, bei "*" a und b multiplizieren, und bei "/" a durch b dividieren.
	 */
	public static int rechne(int a, int b, String zeichen)
	{
		if(zeichen.equals("+")){
			return a+b;
		}
		
	if(zeichen.equals("-")){
		return a-b;
	}
	if(zeichen.equals("/")){
		return a/b;
		
	}
	if(zeichen.equals("*")){
		
		return a*b;
	}
			return 0;
	}
	
	/*
	 * hier kann die Methode getestet werden.
	 * Aendern Sie den Code wie Sie es fuer Ihre Tests fuer notwendig halten
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println("Das Ergebnis von "  + a  + " + " + b + 
				" sollte " + (a+b) + " sein.\nDein Ergebnis ist " +
				"            " + rechne(a, b, "+"));
		System.out.println("Das Ergebnis von "  + a  + " / " + b + 
				" sollte " + (a/b) + " sein.\nDein Ergebnis ist " +
				"            " + rechne(a, b, "/"));
	}
}
