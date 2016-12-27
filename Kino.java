/*
 * Diese Klasse stellt ein Kino dar.
 * Ein Kino besteht aus einem rechteckigen Saal,
 * der durch das boolean Array symbolisiert wird.
 * Dabei bedeutet der Wert false, dass der Platz an dieser
 * Stelle nicht reserviert, also frei ist, und true,
 * dass der Platz schon reserviert ist.
 */
public class Kino
{
	private boolean[][] plaetze;//Das Array, welches die Plaetze darstellt.
								//true bedeutet, Platz ist reserviert, false bedeutet, Platz ist frei.
	
	/*
	 * Der Konstruktor initialisiert ein neues Kino mit der uebergebenen Groesse.
	 */
	public Kino(int reihen, int plaetzeProReihe)
	{
		plaetze = new boolean[reihen][plaetzeProReihe];
	}
	
	/*
	 * Gibt zurueck, ob der uebergebene Platz frei ist.
	 * ACHTUNG: Dieser Platz muss existieren, damit hier
	 * keine Exception auftritt.
	 */
	public boolean frei(int reihe, int platz)
	{
		if(plaetze[reihe][platz] == false)
		{
			return true;
		}
		else//plaetze[reihe][platz] == true
		{
			return false;
		}
	}
	
	/*
	 * Diese Methode reserviert den Platz, der uebergeben wird.
	 * Falls der Platz erfolgreich reserviert werden konnte,
	 * wird true zurueck gegeben, sollte der Platz schon
	 * reserviert sein, wird false zurueckgegeben.
	 * Auch hier gilt: Der uebergebene Platz muss existieren.
	 */
	public boolean reserviere(int reihe, int platz)
	{
		if(frei(reihe, platz))//Platz ist frei
		{
			plaetze[reihe][platz] = true;
			return true;
		}
		else//Platz ist nicht frei
		{
			return false;
		}
	}
	
	/*
	 * Gibt zurueck, wie viele Reihen von
	 * Sitzplaetzen das Kino hat.
	 */
	public int reihen()
	{
		return plaetze.length;
	}
	
	/*
	 * Gibt zurueck, wie viele Sitzplaetze
	 * in jeder Reihe des Kinos sind.
	 */
	public int plaetzeProReihe()
	{
		return plaetze[0].length;
	}
	
	/*
	 * Diese Methode gibt das Kino auf der Konsole aus.
	 */
	public void print()
	{
		for(int i = 0; i < plaetze.length; i++)
		{
			System.out.print("[");
			for(int j = 0; j < plaetze[i].length-1; j++)
			{
				if(plaetze[i][j] == true)
				{
					System.out.print("reserviert");
				}
				if(plaetze[i][j] == false)
				{
					System.out.print("   frei   ");
				}
				System.out.print("|");
				
			}
			if(plaetze[i][plaetze[i].length-1] == true)
			{
				System.out.print("reserviert");
			}
			if(plaetze[i][plaetze[i].length-1] == false)
			{
				System.out.print("   frei   ");
			}
			System.out.println("]");
		}
	}
}