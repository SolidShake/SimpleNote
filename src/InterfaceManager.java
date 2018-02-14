import java.util.ArrayList;

public class InterfaceManager {
	
	public static void mainMenu() {
		System.out.println("********************");
		System.out.println("**** SimpleNote ****");
		System.out.println("1. Print all Notes");
		System.out.println("2. Add Note");
		System.out.println("3. Edit Note");
		System.out.println("4. Delete Note");
		System.out.println("");
		System.out.println("-1. To exit");
		System.out.println("********************");
	}
	public static void printNotes(ArrayList<Note> n) {
		for(Note note : n) {
			System.out.println("First Name: " + note.getFirstName());
			System.out.println("Last Name: " + note.getLastName());
			System.out.println("Age: " + note.getAge());
			System.out.println("Number: " + note.getNumber());
			System.out.println("------------------");
		}
	}
	public static void addNotes() {
		System.out.println("For add Note input \"firstname, lastname, age, number\"");
	}
	public static void getNotes() {
		System.out.println("For search the Note input \"firstname, lastname\"");
	}
	public static void deleteNotes() {
		System.out.println("For delete the Note input \"firstname, lastname\"");
	}

}
