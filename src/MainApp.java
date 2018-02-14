import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		DataManager data = new DataManager();
		data.setData("Artyom", "Utkin", 21, 8800);
		
		InterfaceManager.mainMenu();
		
		Scanner scan = new Scanner(System.in);
		int s = 0;
		//
		System.out.println("before loop");
		//
		while(s >= 0) {
			try {
				s = scan.nextInt();
				switch(s) {
					case 1:
						InterfaceManager.printNotes(data.getNote());
						break;
					case 2:
						InterfaceManager.addNotes();
						// "\\s+" - remove spaces regEx
						//String[] inputString = scan.next().replaceAll("\\s+","").split(",");
						String[] inputString = scan.next().split(",");
						for(String str : inputString) {
							System.out.println(str);
						}
						data.setData(inputString[0], inputString[1], Integer.parseInt(inputString[2]), Integer.parseInt(inputString[3]));
						break;
					case 3:
						break;
					case 4:
						break;
					default:
						System.out.println("Choose between 1-4 number");
						break;
				}
					
			} catch (InputMismatchException e) {
				System.out.println("Enter correct value (number)");
				scan.next();
			} catch (Exception e) {
				System.out.println("Unknown error");
				System.out.println("Programm should be closed");
			}
		}
		scan.close();
	}

}
