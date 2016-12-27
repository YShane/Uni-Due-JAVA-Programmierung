
public class Fussballspiel {

	private Mannschaft heim;  //Accessed only from its own class
	Mannschaft gast;  //No modifier means package-private; Can be accessed only within its own package. Why didn't i know this shit before?
	protected int [] tore;  //Accessed only from its own package & by subclass of its class in another package
	
	
	public Fussballspiel(Mannschaft home, Mannschaft away, int [] goals){
		
		this.heim = home;
		this.gast = away;
		this.tore = goals;
	}
	
	public String getErgebnis(){
		
	return	"The final score of this one folks, is  \n"  +
			heim.getName() + "  "  + tore[0]  +  "  -  "  +  tore[1] + "  " + gast.getName(); 
		
	}
	
	
	
}
