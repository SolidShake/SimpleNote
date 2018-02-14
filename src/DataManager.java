import java.util.*;

public class DataManager {
	
	private ArrayList<Note> notes = new ArrayList<Note>();
	
	public void setData(String firstName, String lastName, int age, int number) {
		Note note = new Note();
		note.setFirstName(firstName);
		note.setLastName(lastName);
		note.setAge(age);
		note.setNumber(number);
		
		notes.add(note);
	}
	public Note getData(String firstName, String lastName) {
		for(Note n : notes) {
			if (n.getFirstName() == firstName && n.getLastName() == lastName) {
				return n;
			} 
		}
		
		return null;
	}
	public ArrayList<Note> getNote() {
		return notes;
	}
	
}
