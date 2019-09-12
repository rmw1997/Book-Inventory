import java.util.*;
public class Test {
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		Methods<Object> m = new Methods<Object> ();
		
		m.push("David Copperfield","Charles Dickens","9781904775072",50,"Stories & Novels");
		m.push("Great Expectations","Charles Dickens","9781501075445",29,"Stories & Novels");
		m.push("Matilda","Roald Dahl","9788482240145",40,"Stories & Novels");
		m.push("Night Without Stars","Peter F. Hamilton","9780230769496",59,"Stories & Novels");
		m.pop();
		m.push("What if?","Randall Munroe","9780544456860",89,"Science");
		m.push("Why you?","James Reed","9780241970218",39,"Self Improvement");
		m.push("How to Train Your Memory","Phil Chambers","9781509814558",55,"Self Improvement");
		m.pop();
		m.push("Learn to Remember","Dominic O'Brien","9780785834625",19,"Self Improvement");
		m.push("Successful Time Management","Patrick Forsyth","6281072071424",32,"Self Improvement");
		m.push("Data Structures and Algorithms in Java","Adam Drozdek","9789814392785",190,"Science");
		m.push("Discrete Mathematics and Its Applications","Kenneth H. Rose","9789814670135",187,"Science");
		m.push("The Big Questions in Science","Co, Hayley; Stuart Birch, Colin Stuart, Mun Keat Looi","9780233004488",41,"Science");
		m.pop();
		m.push("A History of the Ancient Near East","Marc Van de Mieroop","9781118718179",116,"History");
		m.push("Babylon: Mesopotamia and the Birth of Civilization","Paul Kriwaczek","9781848871571",161,"History");
		m.pop();
		m.push("Thing Explainer: Complicated Stuff in Simple Words","Randall Munroe","9780544668256",79,"Science");
		m.push("Black House","Charles Dickens","9781853260827",15,"Stories & Novels");
		
		
		System.out.println("Welcome to Books Inventory!\n"
				+ "\nPlease choose and enter the number of the style you'd like to view books by:\n"
				+ "1: View All\n"
				+ "2: By genre\n"
				+ "0: Exit the program");
		try{
		int x =input.nextInt();
		
			if (x==1)
				m.printAll();
		
			else if (x==2){
			System.out.println("\nPlease choose and enter the number of the genre you want:\n"
					+ "1: Science\n"
					+ "2: History\n"
					+ "3: Self Improvement\n"
					+ "4: Stories & Novels");
			
			int y = input.nextInt();
			System.out.println("\nBooks available in this genre: (Title, Author, ISBN Number, Price)");
			System.out.println();

			{
				if (y==1){
					m.print("Science");
					}
				else if(y==2){
					m.print("History");
					}
				else if (y==3){
					m.print("Self Improvement");
					}
				else if(y==4){
					m.print("Stories & Novels");
					}
				else if (( (y>4) || (y<0) ))
					throw new Exception();
			}	
		}
		
		else if (x==0)
			System.exit(0);
			
		else if ( (x>2) || (x<0) )
			throw new Exception ();
			
			
			System.out.println("\n\n-------------------------\nNote: the following books\n");
			m.find("How to Train Your Memory");
			m.find("Babylon: Mesopotamia and the Birth of Civilization");
			m.find("Night Without Stars");
			m.find("The Big Questions in Science");
				System.out.println("\nare not available yet.");
			

				
		}
		catch(InputMismatchException ie){
			System.out.println("Invalid input. Only integer numbers are accepted.");
		}
		catch (Exception e){
			System.out.println("Input is out of range.");
		}
		
	}

}

