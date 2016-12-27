
public class Spieler {
	
	private String name;
	private int alter;
	private int nummer;
	private char rolle;
	
	
	public Spieler(String nom, int age, int num, char role){
		
		
		this.name = nom;
		this.alter = age;
		this.nummer = num;
		
		if(role=='t'||role=='a'||role=='m'||role=='s'){
			
			this.rolle = role;
		}
		else{
			
		}
		
		
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setName(String nom){
		
		this.name = nom;
		
	}
	
	public char getPosition(){
		
		return this.rolle;
	}
	
	public void setPosition(char pos){
		
		this.rolle = pos;
	}
	
	public int getNummer(){
		
		return this.nummer;
		
	}
	
	public void setNummer(int num){
		
		this.nummer = num;
	}
	
	public int getAlter(){
		
		return this.alter;
	}
	
	public void setAlter(int age){
		
		this.alter = age;
	}
	
	private String positionName(char pos){
		if(this.rolle=='t'){
			
			return "Tor";
		}
		else if(this.rolle=='a'){
			
			return "Abwehr";
		}
		else if(this.rolle=='m'){
			
			return "Mittelfeld";
		}
		else if(this.rolle=='s'){
			
			return "Stürmer";
			
		}
		else{
			return "Undecided";
		}
	}

	public String toString(){
		
		return "Player Name: " + this.getName() + "\n" +
			   "Player Age: " + this.getAlter() + "\n" +
			   "Player Number: " + this.getNummer() + "\n" +
			   "Player Position: " + this.positionName(this.getPosition());
				
	}

	
	

}
