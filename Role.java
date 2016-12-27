
public enum Role {
	
		t, 
		a, 
		m,
		s;
	
	
	
	public String toString() {
		
		if(this.name().equals(t)){
			return "Tor";
			
		}
		else if(this.name().equals(a)){
			
			return "Abwehr";
		}
		else if(this.name().equals(m)){
			
			return "Mittelfeld";
			
		}
		else if(this.name().equals(s)){
			
			return "Stürmer";
			
		}
		else{
			return "WAAAAHHHHNNNNNSSSSSIIIIINNNNNN!!!!!!";
		}
		
		
	}
	
	
}
