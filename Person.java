import java.util.*;
public class Person {
	private int age = 0;
	private double height = 0;
	private double weight = 0;
	private String name;
	private int id;
	private static ArrayList<String> noms;
	private static int numberOfPeople = 0;
	

	
	public Person(String name){
		
		numberOfPeople = numberOfPeople +1;
		this.name = name;
		this.id = numberOfPeople;
				
		
			}	
	
	
	
/*	public void setName(String nameFromUser){
		
		this.name = nameFromUser;
	}*/
	
	public void setAge(int ageGiven){
		this.age = ageGiven;
		
	}
	public void setWeight(double weightGiven){
		this.weight = weightGiven;
		
	}
	public void setHeight(double heightGiven){
		this.height = heightGiven;
		
	}
/*	public static void makeNameToObject(String u){
		
		name = u;
	}*/
	
	public static void giveList(ArrayList<String> c){
		
		noms = c;
		
	}
	public static ArrayList<String> shitList(){
		
		return noms;
	}
	
	public String toString(){
		
	
		return "Name: " + this.name + " Age: " + this.age +  " height: " + this.height + " weight: " + this.weight + " id " + this.id;
		
	}
	
	public String toString1(String f){
		name = f;
		return "Name: " + this.name + " Age: " + this.age +  " height: " + this.height + " weight: " + this.weight + " id " + this.id;
	}
	
	
	
	
}


