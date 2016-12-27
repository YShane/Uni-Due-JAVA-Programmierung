
import java.util.*;
public class uebung4 {
	
	
	
	public static void primeNumbers(){
		
		int [] arr = new int[0];
		int index = 0;
		for(int i = 2; i<101;i++){
			boolean check = false;
			for(int x = 2; x<i; x++){
				
				if(i%x==0){
					check = true;
					
				}
			}
			index++;
			if(check==false){
				
				int[] array2 = new int[arr.length+1];
				
				for(int u = 0; u<arr.length; u++){
					array2[u] = arr[u];
					
				}
				array2[array2.length-1] =i;
				arr = array2;
				
			
			}
		}
			
		for(int z:arr){
			
			System.out.println(z);
		}
		
	}
	
	public static void skalarProdukt(double [] a, double [] b){
		
	int	lA = a.length;
	int	lB = b.length;
	
	if(lA != lB){
		System.out.println("Ungleiche Vektoren");
	}
	else{
	
	
	double sum = 0;
	for(int i = 0; i<lA; i++){
	
		sum = sum + (a[i] * b[i]);
		
			}
	System.out.println(sum);
		
			}
	}
	
	public static int [] merge(int[] x, int[] y){
		
		int xL = x.length;
		int yL = y.length;
		
		int [] z = new int [xL + yL];
		
		int zL = z.length;
		
	
	for(int i = 0; i<xL; i++){
		
		z[i] = x[i];
	}
	
	int v = 0;
	for(int h =xL; h< zL;h++){
		
		z[h] = y[v];
		v++;
	}
		
		
	Arrays.sort(z);
	
	return z;
	
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primeNumbers();
		double [] w = {2.3,4.5, 6.8};
		double [] x = {0.8, 6.9, 5.2};
		double [] y = {5.7, 3.8, 8.9,4.5};
		//skalarProdukt(y,x);
		
		int[] a = {10, 54, 78, 90};
		int[] b = {114, 56, 78, 789};
		System.out.println(Arrays.toString(merge(a,b)));
		
		
	}
}
