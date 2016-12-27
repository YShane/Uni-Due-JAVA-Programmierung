
public class RElement {

	private Piste piste; // != null, wenn Routenelement auf eine Piste verweist
	private Lift lift;   // != null, wenn Routenelement auf einen Lift verweist
	
				 // Achtung:
				 // --------
				 // Jedes Routenelement verweist entweder auf eine Piste
				 // oder einen Lift!
	
	private RElement nF; // nachfolgendes Routenelement
	
	

	RElement() {
		// bleibt leer
	}
	
	RElement(Piste[] p, Lift[] l, boolean[] t) {
		// p ist ein Array aller auf der Route enthaltenen Pisten (in der gefahrenen Reihenfolge)
		// l ist ein Array aller auf der Route enthaltenen Lifte (in der benutzten Reihenfolge)
		// t ist so lang wie p + l und gibt für jedes Routenelement an, ob es sich um eine Piste (true)
		//   oder einen Lift (false) handelt
		
		// Beispiel:
		// ---------
		// new RElement(new Piste[]{m.pZinsbergAbfahrt},
		//              new Lift[]{m.lGondelbahnAuf, m.lZinsbergLift, m.lGondelbahnAb},
		//              new boolean[]{false,false,true,false});
		//
		// erzeugt die Route: lGondelbahnAuf->lZinsberg->pZinsbergAbfahrt->lGondelbahnAb
		
		this(p, l, t, 0, 0, 0);
	}
	
	
	private RElement(Piste[] p, Lift[] l, boolean[] t, int ip, int il, int it) {
		// privater Konstruktor, der die Route nach den oben beschriebenen Regeln erzeugt
		
		if (t!=null) {
			if (t[it]) {
				this.piste = p[ip];
			}
			else {
				this.lift = l[il];
			}
			if (it<t.length-1) {
				this.nF = new RElement(p, l, t, (t[it]?ip+1:ip), (t[it]?il:il+1), it+1);
			}
		}
	}
	
	public Piste getPiste() {
		return piste;
	}

	public void setPiste(Piste piste) {
		this.piste = piste;
	}

	public Lift getLift() {
		return lift;
	}

	public void setLift(Lift lift) {
		this.lift = lift;
	}

	public RElement getnF() {
		return nF;
	}

	public void setnF(RElement nF) {
		this.nF = nF;
	}
}
	
