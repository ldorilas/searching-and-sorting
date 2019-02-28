import java.util.Scanner;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	public void intBubbleSort (int[] intlist) {
		//some stuff
	}
	
	public void strBubbleSort (String[] strlist) {
		//some stuff
	}
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		SearchAndSort sorting = new SearchAndSort();

		System.out.println("What algorithm would you like to execute?");
		String choice = in.nextLine();
		switch (choice) {
		case "intbubble":
			sorting.intBubbleSort(intlist);
			break;
		case "stringbubble":
			sorting.strBubbleSort(strlist);
		}
		
		System.out.println("What type of data?");
		String data = in.nextLine();
		System.out.println("How is it stored?");
	}
}
