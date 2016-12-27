
public class TagCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toString(25);
		System.out.println(calendar(23));
	
		
	}
	
	
	public static String calendar(int tag){
		
		
		
		
		
		String res = "";
		if(tag>0 && tag<3){
			res = "Der " + tag + ". Oktober 2016 ist ein " + tear(tag)+ "\n Er liegt in der 0. Woche des Monats.";
		}
		else if(tag<10){
			res = "Der " + tag + ". Oktober 2016 ist ein " + tear(tag)+ "\n Er liegt in der 1. Woche des Monats.";
		}
		else if(tag<17){
			res = "Der " + tag + ". Oktober 2016 ist ein " + tear(tag)+ "\n Er liegt in der 2. Woche des Monats.";
		}
		else if(tag<24){
			res = "Der " + tag + ". Oktober 2016 ist ein " + tear(tag) + "\n Er liegt in der 3. Woche des Monats.";
		}
		else if(tag<31){
			res = "Der " + tag + ". Oktober 2016 ist ein " + tear(tag) + "\n Er liegt in der 4. Woche des Monats.";
		}
		else if(tag ==31){
			res = "Der " + tag + ". Oktober 2016 ist ein " + tear(tag) + "\n Er liegt in der 5. Woche des Monats.";
		}
		else{
			res = "Fuck off!!";
		}

		
		
	return res;	

}
	
	public static String tear(int value){
		
		
		if(value%7==3){
			
			return "Montag";
		}
		else if(value%7==4){
			return "Dienstag";
		}
		else if(value%7==5){
			
			return "Mittwoch";
		}
		else if(value%7==6){
			
			return "Donnerstag";
		}
		else if(value%7==0){
			return "Freitag";
		}
		else if(value%7==1){
			return "Samstag";
		}
		else if(value%7==2){
			
			return "Sonntag";
		}
		else{
			return "hmmm...";
		}
	}
	
	
	public static double modMe(double value){
		return value%7;
	}
	
	
	public static String toString(int wert){
		
		
		return "" + calendar(wert);
	}

}