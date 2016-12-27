/*
 * Die Kinokasse verwaltet das Kino.
 */
public class Kinokasse
{
	//Das Kino, das diese Kasse verwalten soll.
	private Kino kino;
	
	//Im Kostruktor wird das Kino uebergeben.
	//Danach kann die Kinokasse durch die Variable
	//kino mit diesem Kino arbeiten.
	public Kinokasse(Kino kino)
	{
		this.kino = kino;
	}
	
	//Hier beginnt der zu bearbeitende Bereich
	
	/*
	 * Diese Methode soll den uebergebenen Platz im Kino reservieren.
	 * Sollte der Platz frei sein, soll der Platz reserviert werden
	 * und es soll "Platz reserviert" zurueckgegeben werden.
	 * Sollte der Platz schon belegt sein, soll "Platz belegt"
	 * zurueckgegeben werden.
	 * Sollte der uebergebene Platz nicht vorhanden sein,
	 * soll "Platz nicht vorhanden" zurueckgegeben werden.
	 */
	public String reserviere(int reihe, int platz)
	{
		
		if(reihe<0 || reihe > this.kino.reihen()){
			System.out.println("Platz nicht vorhanden");
			
		}
		else if(
				for(int i = reihe; i<reihe+1; i++){
					for(int i =0;i<kino. ;i++)
				}
				
				){
			
		}
		else{
		if(kino.frei(reihe, platz)== true){
			
			kino.reserviere(reihe, platz);
		System.out.println("Platz reserviert");
		}
		else if(kino.frei(reihe, platz)==false){
			System.out.println("Platz belegt");
		}
		
		
		}
		return null;
	}
	
	/*
	 * Diese Methode soll zurueckgeben,
	 * ob der uebergebene Platz im Kino frei ist.
	 * Falls also der Platz existiert und frei ist,
	 * wird true zurueckgegeben, sonst false.
	 */
	public boolean frei(int reihe, int platz)
	{
		return false;
	}
	
	/*
	 * Diese Methode soll zurueckgeben,
	 * wie viele Plaetze im Kino noch frei sind.
	 */
	public int freiePlaetze()
	{
		return 0;
	}
	
	/*
	 * Diese Methode soll zurueckgeben,
	 * wie viele Plaetze im Kino nicht
	 * mehr frei sind.
	 */
	public int plaetzeBelegt()
	{
		return 0;
	}
	
	/*
	 * Diese Methode soll den Anteil
	 * der freien Plaetz im Kino zurueckgeben.
	 * Dieser Anteil berechnet sich mit
	 * anzahlFreiePlaetze/anzahlPlaetzeGesamt.
	 */
	public double anteilFreiePlaetze()
	{
		return 0;
	}
	
	/*
	 * Hier ist die main Methode.
	 * Du kannst hier verschiedene Testfaelle selbst
	 * schreiben und dann testen.
	 * Es sind auch schon ein paar Testfaelle vorgegeben.
	 */
	public static void main(String[] args)
	{
		Kino k = new Kino(2,3);
		Kinokasse kasse = new Kinokasse(k);
		System.out.println("So sieht das Kino aus:");
		k.print();
		System.out.println("Ein freier Platz wird reserviert. Es sollte Platz reserviert ausgegeben werden:");
		System.out.println(kasse.reserviere(1, 1));
		System.out.println("So sieht das Kino jetzt aus:");
		k.print();
		System.out.println("Es wird versucht, einen Platz zu reservieren, der nicht vorhanden ist. Es sollte Platz nicht vorhanden ausgegeben werden:");
		System.out.println(kasse.reserviere(0, 10));
		System.out.println("Ein freier Platz wird reserviert. Es sollte Platz reserviert ausgegeben werden:");
		System.out.println(kasse.reserviere(0, 0));
		System.out.println("Ein freier Platz wird reserviert. Es sollte Platz reserviert ausgegeben werden:");
		System.out.println(kasse.reserviere(0, 1));
		System.out.println("Ein bereits belegter Platz soll reserviert werden. Es sollte Platz belegt ausgegeben werden:");
		System.out.println(kasse.reserviere(1, 1));
		System.out.println("So sieht das Kino jetzt aus:");
		k.print();
		System.out.println("Ist Platz (1, 1) frei? Es sollte false ausgegeben werden:");
		System.out.println(kasse.frei(1, 1));
		System.out.println("Ist Platz (1, 10) frei? Es sollte false ausgegeben werden:");
		System.out.println(kasse.frei(10, 10));
		System.out.println("Ist Platz (0, 2) frei? Es sollte true ausgegeben werden:");
		System.out.println(kasse.frei(0, 2));
		System.out.println("Es sind so viele Plaetze im Kino frei (3 waere richtig):");
		System.out.println(kasse.freiePlaetze());
		System.out.println("So viele Plaetze sind belegt (3 waere richtig):");
		System.out.println(kasse.plaetzeBelegt());
		System.out.println("Der Anteil an freien Plaetzen betraegt (0.5 waere richtig):");
		System.out.println(kasse.anteilFreiePlaetze());
	}
}