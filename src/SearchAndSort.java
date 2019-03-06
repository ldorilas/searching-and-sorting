import java.util.Scanner;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	public void bubbleSort (int intlist[]) {
		int n = intlist.length;
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (arr[j] > arr[j+1]) 
                	{	 
                    		int temp = arr[j]; 
                    		arr[j] = arr[j+1]; 
                    		arr[j+1] = temp; 
                		} 
			}
		}
		return intlist;
	}
	
	public void bubbleSort (String strlist[]) {
		int n = intlist.length;
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (arr[j] > arr[j+1]) 
                	{	 
                    		int temp = arr[j]; 
                    		arr[j] = arr[j+1]; 
                    		arr[j+1] = temp; 
                		} 
			}
		} 
		return strlist;
	}
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		SearchAndSort sorting = new SearchAndSort();

		System.out.println("What algorithm would you like to execute?");
		String choice = in.nextLine();
		switch (choice) {
		case "bubble":
			sorting.bubbleSort(bubble);
			break;
		case "selection":
			sorting.selectionSort(select);	
			break;
		case "insertion":
			sorting.insertionSort(insert);
			break;
		case "merge":
			sorting.mergeSort(merge);
			break;
		
		}
		
		System.out.println("What type of data?");
		String data = in.nextLine();
		
		System.out.println("How is it stored?");
		String store = in.nextLine();
		if (store == "array") {
		
		}
	}
}
