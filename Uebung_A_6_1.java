
public class Uebung_A_6_1 {
	
	
	public static int groesstesVolumen(Quader [] Array){
		
		double a = Array[0].getVolumen();
		
		double run;
		int index = 0;
		
		for(int i = 1; i < Array.length;i++){
			
			
			run = Array[i].getVolumen();
			if(run>a){
				
				a = run;
				index = i;
			}
			
			
		}
		
		
		return index;
		
	}
	
	public static int groessteOberflaeche(Quader [] Array){
double a = Array[0].getOberflaeche();
		
		double run;
		int index = 0;
		
		for(int i = 1; i < Array.length;i++){
			
			
			run = Array[i].getOberflaeche();
			if(run>a){
				
				a = run;
				index = i;
			}
			
			
		}
		
		
		return index;
		
		
		
		
	}
	
	public static void main(String[] args){
		
		Quader a = new Quader(10,10,10);
		Quader b = new Quader(20,20,20);
		Quader c = new Quader(30,30,30);
		Quader d = new Quader(40,40,40);
		Quader e = new Quader(50,50,50);
		Quader f = new Quader(60,60,60);
		
		Quader [] test = {a,f,e,d,c,b};
		
		System.out.println(groessteOberflaeche(test));
		//System.out.println(groesstesVolumen(test));
	}

}
