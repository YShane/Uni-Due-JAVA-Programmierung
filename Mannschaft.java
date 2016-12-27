
public class Mannschaft {
	
	private String name;
	
	private Spieler[] spieler;
	
	
	public Mannschaft(String nom, Spieler [] players){
		
		this.name = nom;
		this.spieler = players;
		
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public String [] getPlayersPerPosition(char pos){
			
		String [] ans = new String [0];
		
		for(Spieler x : this.spieler){
			
			if(x.getPosition()==(pos)){
				
			ans = this.biggerAndCopiedArray(ans);	
			
			ans[ans.length-1] = x.getName();
			
				
			}
		}
		
		return ans;
	}
	
	public Spieler [] getplayers(){
		
		return this.spieler;
	}
	
	
	
	private String [] biggerAndCopiedArray(String [] arr){
		
		String [] arr1 = new String [arr.length+1];
		
		for(int i = 0; i<arr.length; i++){
			
			arr1[i] = arr[i];
		}
		
		return arr1;
	}

}
