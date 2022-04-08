package arraylistAndHashmaps;

import java.util.HashMap;
import java.util.Map;

class Book{
int id;
String Name, Author, Publisher;
int quantity;
public Book(int id, String Name, String Author, String Publisher, int Quantity){
	this.id = id;
	this.Name = Name;
	this.Author = Author;
	this.Publisher = Publisher;
	this.quantity = Quantity;
	
	
}
}
/*
public class HashMapAdvance {

	
	public static void main(String args[]) {
		// Create Map of books
		HashMap<Integer,Book> map = new HashMap<Integer,Book>();
		
		// Create Books
		Book b1 = new Book(101, "ABC", "XYZ" ,"ASD",1);
		
		map.put(1, b1);
		
		
		
		
	}
	}

}
	
	*/

