import java.util.Arrays;

public class shc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(quersumme2(366));
		//factorial();
		//zwischen();
		//quersumme(16535);
	}
	
	public static void zwischen(){
		
		for(int i = 100; i<501;i++){
			
			if(i%9==0 && i%17==0){
				
				System.out.println(i);
			}
		}
	}
	
	public static void zwischen2(){
		int i = 100;
		while(i<501){
			
			i++;
			if(i%9==0 && i%17==0){
				System.out.println(i);
			}
		}
		
	}
	
	
	public static void tagesZins(){
		
		double start = 1.00;
		double zins = 0.0035; //DOn't fall into the trap of 0.35
		double buffer;
		int jahr = 0;
		boolean boo = true;
		
		while(boo){
			
		start += (start*zins);
		
			if(start>=1000000){
				
				boo = false;
			}
			jahr ++;
		}
		
		System.out.println(jahr);
	}
	
	
	public static void factorial(){
		
		int i = 17;
		long ans = 1;
		long buff = 0;
		while(i>0){
			ans = i*ans;
		i--;
		}
		System.out.println(ans);
	}
	
	public static void factorial2(){
		
		  int i;
		  long fact=1;  
		  int number=17;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println(fact);    
	}
	
	
	public static void quersumme(int zahl){
		int y = 1;
		String temp = Integer.toString(zahl);
		int[] letters = new int [temp.length()];
		for(int i = 0; i<letters.length;i++){
			letters[i] = temp.charAt(i) - '0';  //why -0 ? Without 0, array becomes [49, 50, 51, 52]
		}
		for(int h = 0;h< letters.length;h++){
			
			
			y = y* letters[h];
		}
		
		
		System.out.println(temp);
		System.out.println(Arrays.toString(letters));
		System.out.println(y);
	}
	public static int quersumme2(int zahl){
		int i = 0;
		while(zahl != 0){
			i = i + (zahl%10);
			zahl = zahl/10;
		}
		return i;
	}
	
	

		
}


