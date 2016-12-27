import java.util.*;

public class Uebung5 {
	
	
	
	
	public static int magischeZahl(int n){
		
		int ans = 0;
	ans =	(int)((Math.pow(n, 2)+1)*n)/2;
		return ans;
	}
	
	public static boolean istMagisch(int [][] q){
		
		int columns = q.length;
		int rows = q[0].length;
		boolean ans = false;
		int[] sums = new int [columns];
		Scanner reader = new Scanner(System.in);
		
		if (columns != rows || columns%2 == 0){
			System.out.println("There's something fucked up about your input, dog.");
			System.out.println("Are you sure the arrays are of the same length? ");
			System.out.println("Yes or No??!!");
			
			String op = reader.nextLine();
			if(op.toUpperCase().equals("YES")){
				
				System.out.println("Well, you are one fucking borderline retared individual.");
				System.out.println("Get the hell out of here and may the good Lord have mercy on your soul.");
			}
			else{
				
			}
			
		}
		else{
			for(int i = 0; i<columns;i++){
				int sum = 0;
				for(int x = 0; x<columns; x++){	//Should use rows here but since it's always = columns...
					
					sum = sum + q[i][x];
				}
				sums[i] = sum;
			}
			
			System.out.println(Arrays.toString(sums));
			
		     	boolean same = true;	     
				int o = sums[0];
				for(int i = 1;i<sums.length;i++){
					if(sums[i]!=o){
						same = false;
					}
				}
			
			int add1 = 0;
			for(int i = 0;i<columns;i++){
			add1 = add1 + q[i][i];
			}
		//	System.out.println(add1);
			
			int add2 = 0;
			for(int i=columns-1;i>-1;i--){
				
				add2 = add2 + q[i][i];
			}
		//	System.out.println(add2);
			
			if(add1 != add2){
				ans = false;
			}
				else{
				
					if(same ==true){
						ans = true;
					}
			
				}
			
			
			
		}
		
		//System.out.println(Arrays.toString(sums)); Testing the array output
		return ans;
	}
	
	
	
	
	public static int [][] erzeugeMQ(int n){
		
		int max = magischeZahl(n);
		

		

        int[][] ans = new int[n][n];

        int row = n-1;
        int col = n/2;
        ans[row][col] = 1;
        
        //ausgabe(ans);

        for (int i = 2; i <= n*n; i++) {
            if (ans[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
                // don't change col
            }
            ans[row][col] = i;
        }
		
		return ans;
	}
	public static void ausgabe(int[][] q) {
		 
		int n = q.length; 
		for (int i = 0; i < n; i++){ 
			for (int j = 0; j < n; j++) {
		 System.out.print(String.format("%3d ", q[i][j])); } System.out.println(); 
			} 
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] three = new int[][]{{8,1,6},{3,5,7},{4,9,2}};
		int[][] threefalse = new int[][]{{8,1,6},{3,5,9},{1,9,2}};  //unmagisches quadrat
		int[][] five = new int[][]{{1,20,19,2,23},{18,14,15,10,8},{21,9,13,17,5},{22,16,11,12,4},{3,6,7,24,25}};
		int[][] fivefalse = new int[][]{{1,20,1,2,23},{1,14,15,10,8},{21,9,13,17,5},{22,16,11,12,4},{3,6,7,24,25}}; //unmagisches quadrat
		//System.out.println(magischeZahl(5));
		System.out.println(istMagisch(fivefalse));
		
		ausgabe(erzeugeMQ(3));
		
	}

}
