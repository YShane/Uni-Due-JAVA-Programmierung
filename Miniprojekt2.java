

import java.util.Arrays;

public class Miniprojekt2 {

    /*
     * Wichtig: Die Methodensignatur darf nicht veraendert werden.
     */
    public Miniprojekt2() {

    }

    // Aufgabe 1
    public int sollTeile(int Stunde) {
        // Bitte ergaenzen!
        int ans = 0;

        if (Stunde > 24 || Stunde < 0) {

            System.out.println("Falsche Eingabewert!!");
        } else {

            if (Stunde >= 5 && Stunde < 12) {

                ans = 150;

            } else if (Stunde >= 12 && Stunde < 21) {

                ans = 200;
            } else {
                ans = 120;
            }
        }

        return ans;
    }

    // Aufgabe 2
    public double[] mittlereStdProduktionSchicht(int[][] stundenproduktion, int tag) {
		// Bitte ergaenzen!
        //The use of a single outer "For" loop is equally possible. Not used here due to the possibility of 3 "for" loops.
        //Getting the first value(Frühschicht Sollwerte)
        double prod1 = 0;
        int counter1 = 0;
        for (int i = tag; i < tag + 1; i++) {
            for (int x = 5; x < 12; x++) {
                prod1 = prod1 + stundenproduktion[i][x];
                
                counter1++;
            }

        }

        double ans1 = prod1 / counter1;

        //Getting the second value(Mittagsschicht)
        int counter2 = 0;
        double prod2 = 0;
        for (int i = tag; i < tag + 1; i++) {
            for (int x = 12; x < 21; x++) {
                prod2 = prod2 + stundenproduktion[i][x];
                counter2++;
            }

        }
        double ans2 = prod2 / counter2;

        //Spätschicht divided into 2 because of the hours that carry over to the next day
        int counter3a = 0, counter3b = 0;

        double prod3a = 0;
        double prod3b = 0;
        for (int i = tag; i < tag + 1; i++) {
            for (int x = 21; x < 24; x++) {
                prod3a = prod3a + stundenproduktion[i][x];
                counter3a++;
            }

            for (int y = 0; y < 5; y++) {
                prod3b = prod3b + stundenproduktion[i][y];

                counter3b++;
            }

        }

        double prod3 = prod3a + prod3b;

        double ans3 = prod3 / (counter3a + counter3b);

        double[] ergebnis = {ans1, ans2, ans3};

        return ergebnis;
        // return new double[3];

    }
    
    	
    	
    	
    

    // Aufgabe 3
    public int[] tagesproduktion(int[][] stundenproduktion) {
        // Bitte ergaenzen!

        int tag = 0;

        int tagProd0 = 0;
        int tagProd1 = 0;
        int tagProd2 = 0;
        int tagProd3 = 0;
        int tagProd4 = 0;
        int tagProd5 = 0;
        int tagProd6 = 0;
        int tagProd7 = 0;
        int tagProd8 = 0;
        int tagProd9 = 0;
        for (int i = tag; i < stundenproduktion.length; i++) {
            for (int x = 0; x < stundenproduktion[0].length; x++) {

                if (i == 0) {
                    tagProd0 = tagProd0 + stundenproduktion[i][x];
                }

                if (i == 1) {
                    tagProd1 = tagProd1 + stundenproduktion[i][x];
                }

                if (i == 2) {
                    tagProd2 = tagProd2 + stundenproduktion[i][x];
                }

                if (i == 3) {

                    tagProd3 = tagProd3 + stundenproduktion[i][x];
                }

                if (i == 4) {
                    tagProd4 = tagProd4 + stundenproduktion[i][x];
                }

                if (i == 5) {
                    tagProd5 = tagProd5 + stundenproduktion[i][x];
                }

                if (i == 6) {
                    tagProd6 = tagProd6 + stundenproduktion[i][x];
                }

                if (i == 7) {
                    tagProd7 = tagProd7 + stundenproduktion[i][x];

                }

                if (i == 8) {
                    tagProd8 = tagProd8 + stundenproduktion[i][x];

                }

                if (i == 9) {
                    tagProd9 = tagProd9 + stundenproduktion[i][x];
                }
            }

        }

        int[] ans = {tagProd0, tagProd1, tagProd2, tagProd3, tagProd4, tagProd5, tagProd6, tagProd7, tagProd8, tagProd9};

        return ans;

    }

    // Aufgabe 4
    public int[] istSollVergleich(int[][] stundenproduktion) {
        // Bitte ergaenzen!

        int[] istWerte = new int[10];

       istWerte = this.tagesproduktion(stundenproduktion);

        int[] sollWerte = {3810, 3810, 3810, 3810, 3810, 3810, 3810, 3810, 3810, 3810};

        int pos0 = 0;
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;
        int pos4 = 0;
        int pos5 = 0;
        int pos6 = 0;
        int pos7 = 0;
        int pos8 = 0;
        int pos9 = 0;

        for (int i = 0; i < 10; i++) {

            if (i == 0) {
                pos0 = sollWerte[i] - istWerte[i];
            }

            if (i == 1) {
                pos1 = sollWerte[i] - istWerte[i];
            }

            if (i == 2) {
                pos2 = sollWerte[i] - istWerte[i];
            }

            if (i == 3) {
                pos3 = sollWerte[i] - istWerte[i];

            }

            if (i == 4) {

                pos4 = sollWerte[i] - istWerte[i];
            }

            if (i == 5) {
                pos5 = sollWerte[i] - istWerte[i];

            }

            if (i == 6) {

                pos6 = sollWerte[i] - istWerte[i];
            }

            if (i == 7) {

                pos7 = sollWerte[i] - istWerte[i];
            }

            if (i == 8) {

                pos8 = sollWerte[i] - istWerte[i];
            }

            if (i == 9) {

                pos9 = sollWerte[i] - istWerte[i];
            }
        }

        int[] ans = {pos0, pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9};

        return ans;
    }

    // Aufgabe 5
    public int minMittlereStdProd(int[][] stundenproduktion, int tag) {
		// Bitte ergaenzen!
	/*	Possible to write a full method but preferred to use the result array from the other method.
         int prod1 = 0;
         int prod2 = 0;
         int prod3a = 0;
         int prod3b = 0;
		
         //Use of a single outer loop is also possible. Not used here due to the possibility of 3 "for" loops.
         int counter1 = 0;
         for(int i = tag; i<tag+1; i++){
         for(int x = 5; x< 12;x++){
				
         prod1 = prod1 + stundenproduktion[i][x];
         counter1++;
         }
			
         }
         int counter2 = 0;
         for(int i = tag; i<tag+1; i++){
         for(int x = 12; x< 21;x++){
				
         prod2 =  prod2 + stundenproduktion[i][x];
         counter2++;
         }
			
         }
         int counter3a = 0;
         int counter3b = 0;
         for (int i=tag; i<tag+1;i++){
         for(int x = 21; x< 24;x++){
         prod3a = prod3a + stundenproduktion[i][x];
         counter3a++;
         }
				
			
			
         for(int y = 0; y<5; y++){
         prod3b = prod3b + stundenproduktion[i][y];
         counter3b++;
         }
			
         }*/

        double[] mschicht = this.mittlereStdProduktionSchicht(stundenproduktion, tag);
		//System.out.println(Arrays.toString(mschicht));  //testing received array

        //Didn't use a hash Table because it hasn't been handled in class yet
        boolean duplicates = false; //value that checks if any number appears more than once

        for (int j = 0; j < mschicht.length; j++) {
            for (int k = j + 1; k < mschicht.length; k++) {
                if (k != j && mschicht[k] == mschicht[j]) {
                    duplicates = true;
                }
            }
        }

        double least = mschicht[0]; // attributing first value
        double least1 = least;

        int pos = 0;
        if (duplicates == false) //Nearly lost it here because the compiler doesn't point out "duplicates = false" as an error. Remember, to compare boolean, use ==
        {
            for (int val = 1; val < mschicht.length; val++) {
                if (mschicht[val] < least) {
                    least = mschicht[val];
                    pos = val;
                }

            }

        } else {
            if (mschicht[0] == least) {
                pos = 0;
            } else if (mschicht[0] != least) {

                if (mschicht[1] == least) {
                    pos = 1;
                } else {
                    pos = 2;
                }

            }

        }

        return pos;
    }

    // Aufgabe 6
    public int maxMittlereStdProd(int[][] stundenproduktion, int tag) {

		// Bitte ergaenzen!
        double[] mschicht = this.mittlereStdProduktionSchicht(stundenproduktion, tag);
		//System.out.println(Arrays.toString(mschicht));  //testing received array

        //Didn't use a hash Table because it hasn't been handled in class yet
        boolean duplicates = false; //value that checks if any number appears more than once

        for (int j = 0; j < mschicht.length; j++) {
            for (int k = j + 1; k < mschicht.length; k++) {
                if (k != j && mschicht[k] == mschicht[j]) {
                    duplicates = true;
                }
            }
        }

        double most = mschicht[0]; // attributing first value
        double most1 = most;

        int pos = 0;
        if (duplicates == false) //Nearly lost it here because the compiler doesn't point out "duplicates = false" as an error. Remember, to compare boolean, use ==
        {
            for (int val = 1; val < mschicht.length; val++) {
                if (mschicht[val] > most) {
                    most = mschicht[val];
                    pos = val;
                }

            }

        } else {
            if (mschicht[2] == most) {
                pos = 2;
            } else if (mschicht[2] != most) {

                if (mschicht[1] == most) {
                    pos = 1;
                } else {
                    pos = 0;
                }

            }

        }

        return pos;

    }

    // Aufgabe 7
    public int[] minSchichtProd(int[][] stundenproduktion) {
		// Bitte ergaenzen!

    	//Getting the "schicht" with the production. Remember 2 = Nachtschicht 
    	int[] ans = new int [3]; //final array
        int[] days = new int[8]; //array for the days

        for (int x = 1; x < 9; x++) {
            int wert = minMittlereStdProd(stundenproduktion, x);
            days[x - 1] = wert;
        }

     //   System.out.println(Arrays.toString(ans)); //testing received array
        
        int tag = 0;
        int  schicht = 0;
        int prod = 0;
        boolean duplicates = false; //value that checks if any number appears more than once

        for (int j = 0; j < days.length; j++) {  //should seriously consider writing a method for duplicate checking.
            for (int k = j + 1; k < days.length; k++) {
                if (k != j && days[k] == days[j]) {
                    duplicates = true;
                }
            }
        }
        
        if(duplicates == true){
        	
        	int check = 0;
        	
        	int min = days[0];
        	for(int i = 1; i<days.length;i++){
        		if(days[i]< min){
        			min = days[i];
        		}
        		
        	}
        	
        	for(int i = 0; i<days.length; i++){
        		if(days[i] == min){
        			check = i;
        			break;  //breaks loop when it reaches the first minimum value
        		}
        	}
        	
        	tag = check;
        	schicht = min;
        	
        	double [] u =	this.mittlereStdProduktionSchicht(stundenproduktion, tag);
        	if(schicht ==0){
        		prod = (int)u[0] *7;
        	}
        	else if(schicht ==1){
        		prod = (int)u[1] *9;
        	}
        	else if(schicht ==2){
        		prod = (int)u[2] * 8;
        	}
        	else{
        		System.out.println("There's a fuck up somewhere!!");
        	}
        	
        	ans[0] = tag +1;
        	ans[1] = schicht;
        	ans[2] = prod;
        	
        	
        }
        else{
        	//if there are no duplicates
        	int min = days[0];
        	
        	int check = 0;
        	for(int i = 1;i <days.length;i++){
        		if(days[i]< min){
        			check = i;
        			min = days[i];
        			
        		}
        	}
        	
        	
        	
        	tag = check;
        	schicht = min;
        	
        double [] u =	this.mittlereStdProduktionSchicht(stundenproduktion, tag);
        	if(schicht ==0){
        		prod = (int)u[0] *7;
        	}
        	else if(schicht ==1){
        		prod = (int)u[1] *9;
        	}
        	else if(schicht ==2){
        		prod = (int)u[2] * 8;
        	}
        	else{
        		System.out.println("There's a fuck up somewhere!!");
        	}
        	
        	ans[0] = tag +1;
        	ans[1] = schicht;
        	ans[2] = prod;
        }
        
        return ans;
    }
    
    
    
    
    
    

    // Aufgabe 8
    public int[] maxSchichtProd(int[][] stundenproduktion) {
        // Bitte ergaenzen!
    	
    	int[] ans = new int [3]; //final array
        int[] days = new int[8]; //array for the days

        for (int x = 1; x < 9; x++) {
            int wert = this.maxMittlereStdProd(stundenproduktion, x);
            days[x - 1] = wert;
        }

       // System.out.println(Arrays.toString(days)); //testing received array
        
        int tag = 0;
        int  schicht = 0;
        int prod = 0;
        boolean duplicates = false; //value that checks if any number appears more than once

        for (int j = 0; j < days.length; j++) {  //should seriously consider writing a method for duplicate checking.
            for (int k = j + 1; k < days.length; k++) {
                if (k != j && days[k] == days[j]) {
                    duplicates = true;
                }
            }
        }
        
        if(duplicates == true){
        	
        	int check = 0;
        	
        	int max = days[0];
        	for(int i = 1; i<days.length;i++){
        		if(days[i]> max){
        			max = days[i];
        		}
        		
        	}
        	
        	for(int i = 0; i<days.length; i++){
        		if(days[i] == max){
        			check = i;
        			break;  //breaks loop when it reaches the first minimum value
        		}
        	}
        	
        	tag = check;
        	schicht = max;
        	
        	double [] u =	this.mittlereStdProduktionSchicht(stundenproduktion, tag);
        	if(schicht ==0){
        		prod = (int)u[0] *7;
        	}
        	else if(schicht ==1){
        		prod = (int)u[1] *9;
        	}
        	else if(schicht ==2){
        		prod = (int)u[2] * 8;
        	}
        	else{
        		System.out.println("There's a fuck up somewhere!!");
        	}
        	
        	ans[0] = tag +1;
        	ans[1] = schicht;
        	ans[2] = prod;
        	
        	
        }
        else{
        	//if there are no duplicates
        	int max = days[0];
        	
        	int check = 0;
        	for(int i = 1;i <days.length;i++){
        		if(days[i]> max){
        			check = i;
        			max = days[i];
        			
        		}
        	}
        	
        	
        	
        	tag = check;
        	schicht = max;
        	
        double [] u =	this.mittlereStdProduktionSchicht(stundenproduktion, tag);
        	if(schicht ==0){
        		prod = (int)u[0] *7;
        	}
        	else if(schicht ==1){
        		prod = (int)u[1] *9;
        	}
        	else if(schicht ==2){
        		prod = (int)u[2] * 8;
        	}
        	else{
        		System.out.println("There's a fuck up somewhere!!");
        	}
        	
        	ans[0] = tag +1;
        	ans[1] = schicht;
        	ans[2] = prod;
        }
        
        return ans;
    	
    	
        
    }
    // Aufgabe 9


public int[] differentStdProd(int[][] stundenproduktion, int tag) {

        // Bitte ergaenzen!
    	
    	
    	int run = 0;
    	int [] ans = new int [1];
    	for(int i = tag;i< tag+1; i++){
    		for(int x = 0; x< stundenproduktion[0].length; x++){
    			
    			if(ans.length==1){
    				
    				
    				ans[0] = stundenproduktion[i][0];
    				int [] ans1 = new int [1];
    				for(int c =0; c<ans.length; c++){
    					ans1[c] = ans[c];
    				}
    				ans = new int[2];
    				for(int u =0; u<ans.length; u++){
    					ans[u] = ans1[u];
    				}
    			}
    			
    			
	    		else{
	    			
	    			
	    			int [] ans1 = new int[ans.length];
	    			for(int z=0;z<1;z++){
	    				ans1[z] = ans[z];
	    			}
	    			
	    			
	    			if(ans[x-1] != stundenproduktion[i][x]){
	    				
	    				ans = new int[x+1];
	        			for(int h = 0; h<ans.length;h++){
	        				ans[h] = ans1[h];
	        				
	        			}
	        			
	        			ans[x] = stundenproduktion[i][x];
	        			
	        			
	    			}
	    			else{
	    				
	    			}
	    		}
    			
    		
    		}
    	}
    	
        return ans;
    }


    // Aufgabe 10
    public int secondStundeProd(int[][] stundenproduktion, int std) {
        // Bitte ergaenzen!

        return std;
    }

    // Aufgabe 11
    public int[] maxProfitMargin(int[][] stundenproduktion) {
        // Bitte ergaenzen!
        return null;
    }

    // Aufgabe 12
    public int[] maxLostSchicht(int[][] stundenproduktion) {
        // Bitte ergaenzen!
        return null;
    }

    public void ausgabeA(int[][] array) {
        if (array == null) {
            System.out.println("null");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
        }
    }

    public void ausgabeA(int[] array) {
        if (array == null) {
            System.out.println("null");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("[" + array[i] + "]");
            }
        }
    }

    public void ausgabeA(double[] array) {
        if (array == null) {
            System.out.println("null");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("[" + array[i] + "]");
            }
        }
    }

    public static void main(String[] args) {

        Miniprojekt2 mini2 = new Miniprojekt2();
		// Konstruktor initialiert das Array SollTeile wie folgt
		/*
         * Loesung[0-11] = 937 Loesung[12-18]= 503 Loesung[19-23]= 700.
         */
        int tag = 0;

        int[][] stundenproduktion = new int[][]{
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120},
            {120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 120, 120, 120}};

        System.out.println("Aufgabe 1) sollTeile(5)" + mini2.sollTeile(5));
        System.out.println("Aufgabe 1) sollTeile(12)" + mini2.sollTeile(12));
        System.out.println("Aufgabe 1) sollTeile(21)" + mini2.sollTeile(21));

        /*
         * Erwartete Loesung: Aufgabe 1) sollTeile(0)150 Aufgabe 1)
         * sollTeile(12)200 Aufgabe 1) sollTeile(21)120
         */
        double[] stundenprod = mini2.mittlereStdProduktionSchicht(stundenproduktion, tag);
        System.out.println("Aufgabe 2) mittlereStdProduktionSchicht");
        mini2.ausgabeA(stundenprod);
        /*
         * Erwartete Loesung: [150.0] [200.0] [120.0]
         */

        int[] tagesProd = mini2.tagesproduktion(stundenproduktion);
        System.out.println("Aufgabe 3) tagesproduktion");
        mini2.ausgabeA(tagesProd);
        /*
         * Erwartete Loesung: [3810] [3810] [3810] [3810] [3810] [3810] [3810]
         * [3810] [3810] [3810]
         */

        int[] sollIstV = mini2.istSollVergleich(stundenproduktion);
        System.out.println("Aufgabe 4) istSollVergleich ");
        mini2.ausgabeA(sollIstV);

        /*
         * Erwartete Loesung: [0] [0] [0] [0] [0] [0] [0] [0] [0] [0]
         */
        System.out.println("Aufgabe 5) minMittlereStudProd: " + mini2.minMittlereStdProd(stundenproduktion, tag));

        /*
         * Erwartete Loesung: minMittlereStudProd --> 2 (Nachtschicht)
         */
        System.out.println("Aufgabe 6) maxMittlereStdProd: " + mini2.maxMittlereStdProd(stundenproduktion, tag));

        /*
         * Erwartete Loesung: maxMittlereStdProd --> 1  (Mittangsschicht)
         */
		// Self-written test cases
        
        //A7
        int [] minschichtp = mini2.minSchichtProd(stundenproduktion);
        System.out.println("Aufgabe 7) minSchichtprod: ");
        mini2.ausgabeA(minschichtp);
        
        //8
        int [] maxschichtp = mini2.maxSchichtProd(stundenproduktion);
        System.out.println("Aufgabe 8) minSchichtprod: ");
        mini2.ausgabeA(maxschichtp);
        
        //9
        int [] diffstd = mini2.differentStdProd(stundenproduktion, 3);
        System.out.println("Aufgabe 9) minSchichtprod: ");
        mini2.ausgabeA(diffstd);;
    }

}

//Other more comprehensive solutiom
/*
  import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Miniprojekt2 {

	/*
	 * Wichtig: Die Methodensignatur darf nicht veraendert werden.
	 */
/*
	public Miniprojekt2() {

	}

	// Aufgabe 1
	public int sollTeile(int Stunde) {

		if (Stunde > 4 && Stunde < 12)
			return 150;
		else if (Stunde > 4 && Stunde < 21)
			return 200;
		else
			return 120;
	}

	// Aufgabe 2
	public double[] mittlereStdProduktionSchicht(int[][] stundenproduktion, int tag) {
		// Bitte ergaenzen!
		double[] ergebnis = { 0, 0, 0 };
		int h = 5;
		for (int count = 0; count < 24; count++) {
			if (h == 24) {
				h = 0;
				tag += 1;
			}
			if (h > 4 && h < 12)
				ergebnis[0] += stundenproduktion[tag][h];
			else if (h > 4 && h < 21)
				ergebnis[1] += stundenproduktion[tag][h];
			else
				ergebnis[2] += stundenproduktion[tag][h];
			h++;
		}
		ergebnis[0] /= 7;
		ergebnis[1] /= 9;
		ergebnis[2] /= 8;
		return ergebnis;
	}

	// Aufgabe 3
	public int[] tagesproduktion(int[][] stundenproduktion) {
		int[] tagesproduktion = new int[10];
		for (int tag = 0; tag < 10; tag++) {
			for (int h = 0; h < 24; h++) {
				tagesproduktion[tag] += stundenproduktion[tag][h];
			}
		}

		return tagesproduktion;

	}

	// Aufgabe 4
	public int[] istSollVergleich(int[][] stundenproduktion) {
		// Bitte ergaenzen!
		int[] vergleich = { -3810, -3810, -3810, -3810, -3810, -3810, -3810, -3810, -3810, -3810 };
		for (int tag = 0; tag < 10; tag++) {
			for (int h = 0; h < 24; h++) {
				vergleich[tag] += stundenproduktion[tag][h];
			}
		}

		return vergleich;
	}

	// Aufgabe 5
	public int minMittlereStdProd(int[][] stundenproduktion, int tag) {
		// Bitte ergaenzen!
		double[] a = mittlereStdProduktionSchicht(stundenproduktion, tag);
		if (a[2] < a[1] && a[2] < a[0])
			return 2;
		else if (a[1] < a[0])
			return 1;
		else
			return 0;
	}

	// Aufgabe 6
	public int maxMittlereStdProd(int[][] stundenproduktion, int tag) {

		double[] a = mittlereStdProduktionSchicht(stundenproduktion, tag);
		if (a[0] > a[1] && a[0] > a[2])
			return 0;
		else if (a[1] > a[2])
			return 1;
		else
			return 2;
	}

	// Aufgabe 7
	public int[] minSchichtProd(int[][] stundenproduktion) {
		int[] minschicht = new int[3];
		minschicht[2] = 2349912;
		int j = 5;
		for (int i = 1; i < 9; i++) {
			int frueschicht = 0;
			int mittschicht = 0;
			int nachtschicht = 0;

			for (int counter = 0; counter < 24; counter++) {
				j++;
				if (j == 24)
					j = 0;
				if (j > 4 && j < 12)
					frueschicht += stundenproduktion[i][j];
				else if (j > 11 && j < 21)
					mittschicht += stundenproduktion[i][j];
				else
					nachtschicht += stundenproduktion[i][j];
			}

			if (frueschicht < minschicht[2]) {
				minschicht[2] = frueschicht;
				minschicht[0] = i;
				minschicht[1] = 0;
			}
			if (mittschicht < minschicht[2]) {
				minschicht[2] = mittschicht;
				minschicht[0] = i;
				minschicht[1] = 1;
			}
			if (i != 8) {
				if (nachtschicht < minschicht[2]) {
					minschicht[2] = nachtschicht;
					minschicht[0] = i;
					minschicht[1] = 2;
				}
			}

		}
		return minschicht;
	}

	// Aufgabe 8
	public int[] maxSchichtProd(int[][] stundenproduktion) {

		int[] minschicht = new int[3];
		minschicht[2] = 0;
		int j = 5;
		for (int i = 1; i < 9; i++) {
			int frueschicht = 0;
			int mittschicht = 0;
			int nachtschicht = 0;

			for (int counter = 0; counter < 24; counter++) {
				j++;
				if (j == 24)
					j = 0;
				if (j > 4 && j < 12)
					frueschicht += stundenproduktion[i][j];
				else if (j > 11 && j < 21)
					mittschicht += stundenproduktion[i][j];
				else
					nachtschicht += stundenproduktion[i][j];
			}

			if (frueschicht > minschicht[2]) {
				minschicht[2] = frueschicht;
				minschicht[0] = i;
				minschicht[1] = 0;
			}
			if (mittschicht > minschicht[2]) {
				minschicht[2] = mittschicht;
				minschicht[0] = i;
				minschicht[1] = 1;
			}
			if (i != 8) {
				if (nachtschicht > minschicht[2]) {
					minschicht[2] = nachtschicht;
					minschicht[0] = i;
					minschicht[1] = 2;
				}
			}

		}
		return minschicht;
	}
	// Aufgabe 9

	public int[] differentStdProd(int[][] stundenproduktion, int tag) {
		int laenge = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int h = 0; h < 24; h++) {
			if (!list.contains(stundenproduktion[tag][h])) {
				list.add(stundenproduktion[tag][h]);
				laenge++;
			}
		}
		int[] prods = new int[laenge];
		list.sort(null);
		for (int i = 0; i < laenge; i++) {
			prods[i] = list.get(i);
		}
		return prods;
	}

	// Aufgabe 10
	public int secondStundeProd(int[][] stundenproduktion, int std) {
		int höchsteprod = 0;
		int zweiteprod = 0;
		for (int i = 0;i<stundenproduktion.length;i++) {
			if (stundenproduktion[i][std] >= höchsteprod){
				zweiteprod = höchsteprod;
				höchsteprod = stundenproduktion[i][std];
			} else {
				if (stundenproduktion[i][std] >= zweiteprod) zweiteprod = stundenproduktion[i][std];
			}
			
		}
		return zweiteprod;
	}
	
	//Extra-methoden für aufgabe 11:
	static int calctag(int d, int h) {
		if (h==24) d += 1;
		if (h==-1) d -= 1;
		return d;
	}
	static int calcstunde(int h) {
		if (h==24) h=0;
		if (h==-1) h=23;
		return h;
	}
	
	
	// Aufgabe 11
	public int[] maxProfitMargin(int[][] stundenproduktion) {
		
		int[] profitmargin = {0, 0, 0 };
		
		for (int i = 1;i<9;i++){
			for (int j = 0;j<24;j++){
				
				// Die stunde 0 von tag 1 und die stunde 23 von tag 8 dürfen nicht verwendet werden, da es für sie nicht
				// ausreichend Werte in der Tabelle gibt
				if ((i != 1 || j != 0) && (i != 8 || j != 23) ) {
					if (
							stundenproduktion[i][j] > stundenproduktion[calctag(i-1, j-1)][calcstunde(j-1)] && 
							stundenproduktion[i][j] > stundenproduktion[i][calcstunde(j-1)] && 
							stundenproduktion[i][j] > stundenproduktion[calctag(i+1, j-1)][calcstunde(j-1)] &&
							stundenproduktion[i][j] > stundenproduktion[i-1][j] && 
							stundenproduktion[i][j] > stundenproduktion[i+1][j] &&
							stundenproduktion[i][j] > stundenproduktion[calctag(i-1, j+1)][calcstunde(j+1)] && 
							stundenproduktion[i][j] > stundenproduktion[i][calcstunde(j+1)] && 
							stundenproduktion[i][j] > stundenproduktion[calctag(i+1, j+1)][calcstunde(j+1)] &&
							stundenproduktion[i][j] >= profitmargin[2]
						) {
						profitmargin[0]=i;
						profitmargin[1]=j;
						profitmargin[2]=stundenproduktion[i][j];
					}
				}
			}
		}
		
		return profitmargin;
	}

	// Aufgabe 12
	public int[] maxLostSchicht(int[][] stundenproduktion) {
		
		int[] maxLost = new int[3];
		
		for (int i = 0; i < stundenproduktion.length;i++){
			for (int j = 0; j < stundenproduktion[i].length;j++) {
				int verlust = stundenproduktion[i][j] - sollTeile(j);
				if (verlust <= maxLost[2]) {
					maxLost[0] = i;
					if (j > 4 && j < 12)	maxLost[1] =  0;
					else if (j > 4 && j < 21)	maxLost[1] =  1;
					else maxLost[1] = 2;
					maxLost[2] = verlust;
				}
			}
		}
		
		return maxLost;
	}

	public void ausgabeA(int[][] array) {
		if (array == null) {
			System.out.println("null");
		} else {
			for (int i = 0; i < array.length; i++) {
				System.out.println(Arrays.toString(array[i]));
			}
		}
	}

	public void ausgabeA(int[] array) {
		if (array == null) {
			System.out.println("null");
		} else {
			for (int i = 0; i < array.length; i++)
				System.out.println("[" + array[i] + "]");
		}
	}

	public void ausgabeA(double[] array) {
		if (array == null) {
			System.out.println("null");
		} else {
			for (int i = 0; i < array.length; i++)
				System.out.println("[" + array[i] + "]");
		}
	}

	public static void main(String[] args) {

		Miniprojekt2 mini2 = new Miniprojekt2();
		// Konstruktor initialiert das Array SollTeile wie folgt
		/*
		 * Loesung[0-11] = 937 Loesung[12-18]= 503 Loesung[19-23]= 700.
		 */
	/*	int tag = 0;

		int[][] stundenproduktion = new int[][] {
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 },
				{ 120, 120, 120, 120, 120, 150, 150, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 200, 200, 200,
						200, 120, 120, 120 } };

		System.out.println("Aufgabe 1) sollTeile(5)" + mini2.sollTeile(5));
		System.out.println("Aufgabe 1) sollTeile(12)" + mini2.sollTeile(12));
		System.out.println("Aufgabe 1) sollTeile(21)" + mini2.sollTeile(21));

		/*
		 * Erwartete Loesung: Aufgabe 1) sollTeile(0)150 Aufgabe 1)
		 * sollTeile(12)200 Aufgabe 1) sollTeile(21)120
		 */
/*
		double[] stundenprod = mini2.mittlereStdProduktionSchicht(stundenproduktion, tag);
		System.out.println("Aufgabe 2) mittlereStdProduktionSchicht");
		mini2.ausgabeA(stundenprod);
		/*
		 * Erwartete Loesung: [150.0] [200.0] [120.0]
		 */
/*
		int[] tagesProd = mini2.tagesproduktion(stundenproduktion);
		System.out.println("Aufgabe 3) tagesproduktion");
		mini2.ausgabeA(tagesProd);
		/*
		 * Erwartete Loesung: [3810] [3810] [3810] [3810] [3810] [3810] [3810]
		 * [3810] [3810] [3810]
		 */
/*
		int[] sollIstV = mini2.istSollVergleich(stundenproduktion);
		System.out.println("Aufgabe 4) istSollVergleich ");
		mini2.ausgabeA(sollIstV);

		/*
		 * Erwartete Loesung: [0] [0] [0] [0] [0] [0] [0] [0] [0] [0]
		 */
/*
		System.out.println("Aufgabe 5) minMittlereStudProd: " + mini2.minMittlereStdProd(stundenproduktion, tag));

		/*
		 * Erwartete Loesung: minMittlereStudProd --> 2 (Nachtschicht)
		 */
/*
		System.out.println("Aufgabe 6) maxMittlereStdProd: " + mini2.maxMittlereStdProd(stundenproduktion, tag));

		/*
		 * Erwartete Loesung: maxMittlereStdProd --> 1 (Mittangsschicht)
		 */
/*
	}

}
*/
