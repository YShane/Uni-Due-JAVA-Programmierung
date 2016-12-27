import java.util.*;

public class Miniprojekt3 {

	public void zeigeSkigebiet(Station[] skigebiet) {
		// Gib das ganze Skigebiet zeilenweise in Textform aus. Durchlaufe
		// hierfür das Array
		// skigebiet und gib für jede Station alle dort ausgehenden
		// Liftverbindung (Array lifte) und
		// alle dort ausgehenden Pisten (Array pisten) mit ihrem jeweiligen Ziel
		// aus.
		//
		// KEINE BEWERTUNG DURCH JACK

		for (Station go : skigebiet) {

			System.out.print("Station Name: " + go.getName() + "\n");

			if (go.getLifte() != null) {

				System.out.println("Lifts: ");

				for (Lift c : go.getLifte()) {

					System.out.println(c.getName() + " -> " + c.getZiel().getName());
				}

			}

			else {

				System.out.print("");

			}

			if (go.getPisten() != null) {

				System.out.println("Pisten: ");

				for (Piste d : go.getPisten()) {

					System.out.println(d.getName() + " -> " + d.getZiel().getName());
				}

			} else {

				System.out.print("");

			}

			System.out.println("\n");

		}

		// Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public void zeigeRoute(RElement r) {
		// Gib zeilenweise alle Lifte und Pisten auf der Route r in der
		// gegebenen Reihenfolge aus.
		//
		// KEINE BEWERTUNG DURCH JACK

		// Bitte ersetzen Sie diese Zeile durch Ihre Lösung!

		while (r.getnF() != null) {

			if (r.getPiste() != null) {

				System.out.println(r.getPiste().getName());

			} else {
				System.out.println(r.getLift().getName());
			}

			r = r.getnF();
		}

		if (r.getPiste() != null) {

			System.out.println(r.getPiste().getName());

		} else {
			System.out.println(r.getLift().getName());
		}

	}

	public int offeneLifte(Station[] skigebiet) {
		// Zähle, wie viele derzeit offene Lifte es im Skigebiet gibt und
		// liefere
		// diesen Wert zurück.

		int zahl = 0;

		for (Station x : skigebiet) {

			if (x.getLifte() != null) {
				for (Lift c : x.getLifte()) {

					if (c.isStatus() == true) {
						zahl++;
					}

				}
			}

		}

		return zahl; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public int pistenMeter(Station[] skigebiet) {
		// Liefere die insgesamt vorhandenen Pistenmeter im Skigebiet
		// (unabhängig davon, ob
		// die Pisten gesperrt oder offen sind).

		int met = 0;
		for (Station x : skigebiet) {

			if (x.getPisten() != null) {

				for (Piste c : x.getPisten()) {

					met = met + c.getLaenge();
				}
			}
		}

		return met; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public int verbrauchtePunkte(RElement r) {

		int track = 0;
		// Liefere die auf der Route r verbrauchten Liftpunkte.

		while (r.getnF() != null) {

			if (r.getLift() != null) {

				track++;

			}

			r = r.getnF();
		}
		if (r.getLift() != null) {

			track++;

		}

		return track; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public char maxFarbe(RElement r) {
		// Liefere die auf der Route r maximal vorkommende Pisten-Schwierigkeit,
		// entsprechend
		// ihrer Farbe: b)lau = leicht, r)ot = mittel, s)chwarz = schwer.
		// Hinweis: Da 'b' im Alphabet vor 'r' kommt und 'r' vor 's', können Sie
		// die
		// Vergleichsoperatoren <, >, = für den character-Wert "farbe" genau wie
		// beim Vergleich
		// von Zahlen verwenden!

		int blau = 0;
		int rot = 0;
		int schwarz = 0;
		char ans = '?';

		while (r.getnF() != null) {

			if (r.getPiste() != null) {

				if (r.getPiste().getFarbe() == 'b') {
					blau++;

				} else if (r.getPiste().getFarbe() == 'r') {
					rot++;

				} else if (r.getPiste().getFarbe() == 's') {
					schwarz++;
				}

			} else {

			}

			r = r.getnF();
		}

		if (r.getPiste() != null) {

			if (r.getPiste().getFarbe() == 'b') {
				blau++;

			} else if (r.getPiste().getFarbe() == 'r') {
				rot++;

			} else if (r.getPiste().getFarbe() == 's') {
				schwarz++;
			}

		} else {

		}

		int[] u = { blau, rot, schwarz };

		int t = u[0];

		for (int x = 1; x < u.length; x++) {
			if (u[x] > t) {
				t = u[x];
			}
		}

		if (blau != rot && blau != schwarz) {

			if (t == blau) {
				ans = 'b';
			} else if (t == rot) {
				ans = 'r';
			} else if (t == schwarz) {
				ans = 's';
			} else {

			}
		} else {

		}
		return ans;
	}

	public int maxHoehe(RElement r) {
		// Liefere die maximal auf der Route r erreichte Höhe ALS DIFFERENZ VOM
		// START DER ROUTE AUS
		// GEMESSEN.
		// Achtung: Dieser Wert hängt sowohl von den gefahrenen Pisten als auch
		// von den benutzten
		// Liften ab!

		int height1 = 0;

		/*
		 * if (r.getPiste() != null) {
		 * 
		 * height1 = r.getPiste().getHdiff();
		 * 
		 * System.out.println("MAMA" + height1);
		 * 
		 * } else { height1 = r.getLift().getHdiff();
		 * System.out.println("MAMAMIA" + height1); }
		 */

		while (r.getnF() != null) {

			if (r.getPiste() != null) {

				height1 = height1 + r.getPiste().getHdiff();

			} else {

				height1 = height1 + r.getLift().getHdiff();

			}

			r = r.getnF();
		}

		if (r.getPiste() != null) {

			height1 = height1 + r.getPiste().getHdiff();

		} else {

			height1 = height1 + r.getLift().getHdiff();

		}

		return height1; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public int anzahlHuetten(RElement r) {
		// Liefere die Anzahl aller auf der Route r erreichten Hütten.
		// Bitte beachten Sie:
		// *) Die Startstation kann ignoriert werden.
		// *) Wenn die Route an einer bereits zuvor erreichten Hütte erneut
		// vorbeiführt,
		// treten Mehrfachzählungen auf. Das ist im Kontext dieser Aufgabe ok!

		int ans = 0;

		while (r.getnF() != null) {

			if (r.getPiste() != null) {

				if (r.getPiste().getZiel().isHuette() == true) {
					ans++;

				}

			} else {
				if (r.getLift().getZiel().isHuette() == true) {
					ans++;
				}
			}

			r = r.getnF();
		}
		if (r.getPiste() != null) {

			if (r.getPiste().getZiel().isHuette() == true) {
				ans++;

			}

		} else {
			if (r.getLift().getZiel().isHuette() == true) {
				ans++;
			}
		}

		return ans; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public boolean parallelePistenVon(Station s) {
		// Prüfe, ob es von Station s AUSGEHEND mindestens zwei Pisten mit
		// gleichem Ziel gibt.

		boolean z = false;
		if (s.getPisten() != null) {

			Piste[] a = s.getPisten();
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {

					if (a[j].getZiel().equals(a[i].getZiel())) {

						z = true;
					}

				}

			}

		} else {
			z = false;
		}

		return z; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public boolean keinLiftAbwaertsZu(Station[] skigebiet, Station s) {
		// Liefert true, wenn kein zu Station s HINFÜHRENDER Lift abwärts geht
		// (hdiff < 0).
		boolean z = true;
		String name = s.getName();

		Lift[] a = new Lift[0];

		for (Station x : skigebiet) {

			if (x.getLifte() != null) {

				Lift[] b = x.getLifte();
				for (Lift c : b) {

					if (c.getZiel().getName().equals(name)) {

						a = new Lift[a.length + 1];
						a[a.length - 1] = c;
					}
				}
			}
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i].getHdiff() < 0) {

				z = false;
				break;
			}
		}

		return z; // Bitte durch Ihre Lösung ersetzen!
	}

	public boolean hatAnfaengerRoute(Station s) {
		// Liefert true, falls es von Station s ausgehend einen Lift gibt, an
		// dessen Ziel
		// eine blaue Piste beginnt, die wiederum direkt zu s zurückführt ODER
		// umgekehrt.
		
		// Umgekehrt: Liefert true, falls es von Station s ausgehend eine blaue Piste gibt,
		//  an deren Ziel ein Lift ist, der wiederum direkt zu s zurückführt.
	boolean ans = false;	
		
		if(s.getLifte()!= null){
			Lift[] a = new Lift[s.getLifte().length];
			a = s.getLifte();
			
			for(Lift x: a){
				
				if(x.getZiel().getPisten()!= null){
					
					Piste [] z = x.getZiel().getPisten();
					
					for(Piste g: z){
						if(g.getFarbe()=='b'  && g.getZiel().equals(s)){
							
							ans = true;
						}
					}
			
				}
			}
		}else {
			
			Piste [] b = new Piste[s.getPisten().length];
			b = s.getPisten();
			
			for(Piste x: b){
				
				if(x.getZiel().getLifte()!= null){
					
					Lift [] z = x.getZiel().getLifte();
					
					if(x.getFarbe() == 'b'){
					
					for(Lift g: z){
						if(g.getZiel().equals(s)){
							ans = true;
						}
					}
				}
				}
					
			}
			
		}
		
		


		return ans; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public int befahrbarBis(RElement r) {
		// Liefere die Anzahl der Pistenmeter, bis zu der die Route r befahrbar
		// (also nicht
		// gesperrt) ist.
		int dis = 0;
		boolean see = true;

		while (r.getnF() != null) {

			if (r.getPiste() != null) {
				if (r.getPiste().isStatus() == true) {

					dis = dis + r.getPiste().getLaenge();
				} else {
					see = false;
					break;
				}

			} else {
				if(r.getLift().isStatus()==true){
				dis = dis + r.getLift().getLaenge();
				}
				else{
					see = false;
					break;
				}
			}

			r = r.getnF();
		}
		if(see==true){

		if (r.getPiste() != null) {

			dis = dis + r.getPiste().getLaenge();

		} else {
			dis = dis + r.getLift().getLaenge();
		}
		}
		else{
			
		}
		return dis; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}

	public boolean sindDisjunkt(RElement r1, RElement r2) {
		// Liefere true, falls die beiden Routen r1 und r2 disjunkt sind, d. h.
		// kein Lift sowohl
		// in r1 und r2 vorkommt und keine Piste sowohl in r1 als auch r2
		// vorkommt.
	
		//Not sure about MP but this method would be a lot better divided in 2
		boolean ans = true;
		ArrayList<Piste> a = new ArrayList<Piste>();
		ArrayList<Lift> b = new ArrayList<Lift>();
		
		while (r1.getnF() != null) {

			if (r1.getPiste() != null) {
				
				a.add(r1.getPiste());

			} else {
				
				
				b.add(r1.getLift());
			}

			r1 = r1.getnF();
		}
		
		if (r1.getPiste() != null) {

			a.add(r1.getPiste());

		} else {
			b.add(r1.getLift());
		}
		

		/*for(Piste y: a){
			System.out.println(y.getName());
		}*/
		
		ArrayList<Piste> c = new ArrayList<Piste>();
		ArrayList<Lift> d = new ArrayList<Lift>();
		
		
		while (r2.getnF() != null) {

			if (r2.getPiste() != null) {
				
				c.add(r2.getPiste());

			} else {
				
				
				d.add(r2.getLift());
			}

			r2 = r2.getnF();
		}
		
		if (r2.getPiste() != null) {

			c.add(r2.getPiste());

		} else {
			d.add(r2.getLift());
		}
		
		/*for(Lift y: d){
		System.out.println(y.getName()); 
	}*/
		
		for(Piste t: a){
			if(c.contains(t)){
				
				ans = false;
			}
		}
		
		for(Lift u: b){
			if(d.contains(u)){
				ans = false;
			}
		}
		
		
		

		return ans; // Bitte ersetzen Sie diese Zeile durch Ihre Lösung!
	}
	
	

	public static void main(String[] args) {
		// alle Stationen
		Station sBrixen = new Station("Brixen", false);
		Station sChoralpe = new Station("Choralpe", true);
		Station sFilzboden = new Station("Filzboden", false);
		Station sOberberg = new Station("Oberberg", false);
		Station sZinsberg = new Station("Zinsberg", false);
		Station sSeidlalm = new Station("Seidlalm", true);

		// alle Pisten
		Piste pQuerverbindung = new Piste("Querverbindung", 'r', 800, -200, true, sFilzboden);
		Piste pBuckelpiste = new Piste("Buckelpiste", 's', 500, -200, false, sZinsberg);
		Piste pZinsbergAbfahrt = new Piste("Zinsberg-Abfahrt", 'b', 800, -300, false, sChoralpe);
		Piste pSeidlalmAbfahrt = new Piste("Seidlalm-Abfahrt", 'r', 3800, -400, true, sSeidlalm);
		Piste pTalabfahrtMittel = new Piste("Talabfahrt (mittel)", 'r', 4000, -600, true, sBrixen);
		Piste pTalabfahrtLeicht = new Piste("Talabfahrt (leicht)", 'b', 4200, -600, true, sBrixen);

		// alle Lifte
		Lift lGondelbahnAuf = new Lift("Gondelbahn (auf)", 30, 1800, 500, true, sChoralpe);
		Lift lGondelbahnAb = new Lift("Gondelbahn (ab)", 30, 1800, -500, true, sBrixen);
		Lift lOberbergLift = new Lift("Oberberg-Lift", 16, 1700, 700, true, sOberberg);
		Lift lZinsbergLift = new Lift("Zinsberg-Lift", 14, 400, 300, false, sZinsberg);

		// ausgehende Lifte und Pisten pro Station
		Lift[] alBrixen = new Lift[] { lGondelbahnAuf };
		Piste[] apBrixen = null;

		Lift[] alChoralpe = new Lift[] { lZinsbergLift, lGondelbahnAb };
		Piste[] apChoralpe = new Piste[] { pQuerverbindung };

		Lift[] alZinsberg = null;
		Piste[] apZinsberg = new Piste[] { pZinsbergAbfahrt };

		Lift[] alFilzboden = new Lift[] { lOberbergLift };
		Piste[] apFilzboden = null;

		Lift[] alOberberg = null;
		Piste[] apOberberg = new Piste[] { pBuckelpiste, pSeidlalmAbfahrt };

		Lift[] alSeidlalm = null;
		Piste[] apSeidlalm = new Piste[] { pTalabfahrtMittel, pTalabfahrtLeicht };

		// ausgehende Lifte und Pisten für alle Stationen
		Lift[][] ausgLifte = new Lift[][] { alBrixen, alChoralpe, alZinsberg, alFilzboden, alOberberg, alSeidlalm };
		Piste[][] ausgPisten = new Piste[][] { apBrixen, apChoralpe, apZinsberg, apFilzboden, apOberberg, apSeidlalm };

		// erstelle Skigebiet als Array aller Stationen und setze ausgehende
		// Lifte und Pisten für jede Station
		Station[] skigebiet = new Station[] { sBrixen, sChoralpe, sZinsberg, sFilzboden, sOberberg, sSeidlalm };
		for (int is = 0; is < skigebiet.length; is++) {
			skigebiet[is].setzeAusgehendeLifte(ausgLifte[is]);
			skigebiet[is].setzeAusgehendePisten(ausgPisten[is]);
		}

		// erstelle Miniprojekt
		Miniprojekt3 m = new Miniprojekt3();

		// Beispielroute
		RElement r = new RElement(new Piste[] { pZinsbergAbfahrt },
				new Lift[] { lGondelbahnAuf, lZinsbergLift, lGondelbahnAb },
				new boolean[] { false, false, true, false });

		// Personal BspRoute

		RElement r2 = new RElement(
				new Piste[] { pZinsbergAbfahrt, pQuerverbindung, pZinsbergAbfahrt, pTalabfahrtLeicht },
				new Lift[] { lGondelbahnAuf, lZinsbergLift, lGondelbahnAb, lOberbergLift },
				new boolean[] { false, false, true, false, true, true, true, false });
		
		
		RElement r3 = new RElement(new Piste[] { pSeidlalmAbfahrt },
				new Lift[] { lOberbergLift },
				new boolean[] { false, true});
		
		// An dieser Stelle können Sie unabhängig von JACK Ihre Methoden testen.
		// Anhand der Skizze auf dem Aufgabenblatt sowie den oben in der Klasse
		// Miniprojekt3
		// erstellten Objekten für Lifte, Stationen und Pisten (ergänzen Sie bei
		// Bedarf die
		// Skizze um Höhenangaben etc.) können Sie leicht von Hand ermitteln,
		// welche Ergebnisse
		// Ihre Methoden für bestimmte Parameterwerte liefern müssten.
		//

		//m.zeigeSkigebiet(skigebiet);
		// m.zeigeRoute(r2);
		// System.out.println(m.offeneLifte(skigebiet));
		// System.out.println(m.pistenMeter(skigebiet));
		// System.out.println(m.verbrauchtePunkte(r));
		// System.out.println(m.maxFarbe(r));
		// System.out.println(m.maxHoehe(r2));
		// System.out.println(m.anzahlHuetten(r));
		// System.out.println(m.parallelePistenVon(sFilzboden));
		//System.out.println(m.keinLiftAbwaertsZu(skigebiet, sChoralpe));
		//System.out.println(m.befahrbarBis(r2));
		System.out.println(m.sindDisjunkt(r3, r));
	}

}
