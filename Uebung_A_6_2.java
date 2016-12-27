import java.util.*;

import java.sql.*;

public class Uebung_A_6_2 {
	
	
	public static void printArray(String [] arr){
		
		
		for(String x: arr){
			System.out.println(x);
		}

	}
	
	

	public static void main(String[] args) {
		
				//Real Madrid
				Spieler a1 = new Spieler("Ronaldo", 32, 7, 's');
				Spieler b1 = new Spieler("Bale",26 ,11 , 'm');
				Spieler c1 = new Spieler("Modric", 31, 19, 'm');
				Spieler d1 = new Spieler("Ramos",30 ,4, 'a');
				Spieler e1 = new Spieler("Keylor",29 ,1, 't');
				
				Spieler [] RM = {a1,b1,c1,d1,e1};
				
				//Barca
				Spieler a2 = new Spieler("Messi",29 ,10 ,'s');
				Spieler b2 = new Spieler("Neymar", 24,11 ,'m');
				Spieler c2 = new Spieler("Iniesta",32 ,8  ,'m');
				Spieler d2 = new Spieler("Pique", 29,3 ,'a');
				Spieler e2 = new Spieler("Ter Stegen",24 ,1 ,'t');
				
				
				Spieler [] B = {a2,b2,c2,d2,e2};
				
				
				Mannschaft RealMadrid = new Mannschaft("Real Madrid", RM);
				Mannschaft Barcelona = new Mannschaft("FC Barcelona", B);
				
				int [] score = {5,4};
				
				Fussballspiel classico = new Fussballspiel(RealMadrid,Barcelona, score);
				
				System.out.println(classico.getErgebnis());
				
				 printArray(Barcelona.getPlayersPerPosition('t'));
				
				 System.out.println(e2); 
		
				 
//##############################################################################################################################

		/**
         * 3306 is the default port for MySQL in XAMPP. Note both the 
         * MySQL server and Apache must be running. 
         */
        String url = "jdbc:mysql://localhost:3306/";
        
        /**
         * The MySQL user.
         */
        String user = "root";
        
        /**
         * Password for the above MySQL user. If no password has been 
         * set (as is the default for the root user in XAMPP's MySQL),
         * an empty string can be used.
         */
        String password = "";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(url, user, password);
            
            Statement stt = con.createStatement();
            
            /**
             * Create and select a database for use. 
             */
      //      stt.execute("CREATE DATABASE IF NOT EXISTS test");
            stt.execute("USE teams");
            
            /**
             * Create an example table
             */
   /*        stt.execute("DROP TABLE IF EXISTS people");
            stt.execute("CREATE TABLE people (" +
                    "id BIGINT NOT NULL AUTO_INCREMENT,"
                    + "fname VARCHAR(25),"
                    + "lname VARCHAR(25),"
                    + "PRIMARY KEY(id)"
                    + ")");   
                    */
            
            /**
             * Add entries to the example table
             */
            stt.execute("INSERT INTO people (fname, lname) VALUES" + 
                    "('Joe', 'Bloggs'), ('Mary', 'Bloggs'), ('Jill', 'Hill')");
            
            /**
             * Query people entries with the lname 'Bloggs'
             */
            ResultSet res = stt.executeQuery("SELECT * FROM people WHERE lname = 'Bloggs'");
            
            /**
             * Iterate over the result set from the above query
             */
            while (res.next())
            {
                System.out.println(res.getString("fname") + " " + res.getString("lname"));
            }
            System.out.println("");
            
            /**
             * Same as the last query, but using a prepared statement. 
             * Prepared statements should be used when building query strings
             * from user input as they protect against SQL injections
             */
            PreparedStatement prep = con.prepareStatement("SELECT * FROM people WHERE lname = ?");
            prep.setString(1, "Bloggs");
            
            res = prep.executeQuery();
            while (res.next())
            {
                System.out.println(res.getString("fname") + " " + res.getString("lname"));
            }
            
//####################################################################################################################### 
            Statement zoom = con.createStatement();
            zoom.execute("USE teams");
            
           
            	
            			
            
          for(Spieler x:RealMadrid.getplayers()){
            PreparedStatement go = con.prepareStatement("insert into real_madrid(name,age,jersey_number,role VALUES" + 
          "(" + "'" + x.getName() + "'," + " '" + x.getAlter() + "'," + " '" + x.getNummer() + "'," + " '" + x.getPosition() 
          +"'" + ")");
            			
          }
            		
            
            
            res = prep.executeQuery();
            while (res.next())
            {
                System.out.println(res.getString("fname") + " " + res.getString("lname"));
            }
            /**
             * Free all opened resources
             */
            res.close();
            stt.close();
            prep.close();
            con.close();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    


		
		

	
	}

}
