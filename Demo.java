import java.nio.CharBuffer;
import java.util.*;


public class Demo {
	
	
	public static int arrayLength(int[] t){
	int z =	t.length;
		return z;
	}
	
	public static double dtr(int zahl){
		
		double c = 65.98;
		return zahl/c;
	}
	
	public static void twoDimensionalArrayLength(){
		
		int [][] arrayx= new int [10][24] ;
		System.out.println(arrayx.length);
		
		System.out.println(arrayx[0].length);
	}
	
	public static int cryMore(int wert, double cheers){
		
		int ans = wert * (int)cheers;
		
		return ans;
		
	}
	
	public static void printArray(int [] array){
		
		for(int x: array){
			
			System.out.println(x);
		}
	}
	
	

	
	public static int arrayLength(){
		
		int [][] gui = new int [10][24];
		return gui[1].length;

		
	}
	
	public static void arrays(){
		
		int [] cry2;
		
		int [] cry = {10, 12,14,15,16};
		int [] cry3 = new int [5];
		
		
	
		for (int x: cry){
			System.out.println(x);
			System.out.println("New Array");
		}
		
		for(int i = 0; i< cry.length; i++){
			
			cry3[i] = cry[i];
		}
		
		for (int x: cry3){
			System.out.println(x);
		}
	}
	
	public static void dimensionalArrayArrangement(){
		
		int[][] q = new int[][]{{8,1,6},{3,5,7},{4,9,2}};
		
		for(int i = 0; i< 2; i++){
			for(int x = 0;x< q[0].length;x++){
				System.out.println(q[i][x]);
			}
			System.out.println("NEXT");
		}
		
	}
	
	public static int rekursionFaktorialTest(int n){
		
		if(n == 1){
			return 1;
		}
		else {
			return n*rekursionFaktorialTest(n-1);
		}
		
	}
	
	public static double harmonic(int n) { 
		   if (n == 0) return 0.0;
		   return harmonic(n-1) + 1.0/n; 
		}
	
	
	public void tryBuffer(){
		
		CharBuffer test = CharBuffer.allocate(8);
	}
	
	public static int howManyAddsTill100(){
		
		int i = 0;
		int z = 0;
		int counter = 0;
		while(i<101){
			
			
			i = z +1;
			z = i;
			
			
			counter++;
			
		}
		return counter;
	}
	
	
	
	public static void main(String[]args){
		
	/*	clean:
		for(int i= 0;i<10;i++){
			
			System.out.println(i);
			if(i==5){
				break clean;
			}
		}
	
	 int [] u = {1,2,3};+/
	/*System.out.println(arrayLength(u));
	System.out.println(dtr(56));
	twoDimensionalArrayLength();
	System.out.println(arrayLength());*/
   //arrays();
   //dimensionalArrayArrangement();
		
	//System.out.println(rekursionFaktorialTest(5));
	
	//System.out.println(harmonic(5));
	System.out.println(howManyAddsTill100());

	}
	
	
	
	

}
