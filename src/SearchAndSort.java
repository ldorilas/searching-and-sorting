import java.util.Scanner;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	public void bubbleSort (int bubble[]) {
		int n = intlist.length;
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (intlist[j] > intlist[j+1]) 
                	{	 
                    		int temp = intlist[j]; 
                    		intlist[j] = intlist[j+1]; 
                    		intlist[j+1] = temp; 
                		} 
			}
		}
		return intlist;
	}
	
	public void bubbleSort (String strlist[]) {
		int n = strlist.length;
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (strlist[j] > strlist[j+1]) 
                	{	 
                    		int temp = strlist[j]; 
                    		strlist[j] = strlist[j+1]; 
                    		strlist[j+1] = temp; 
                		} 
			}
		} 
		return strlist;
	}
	
	public void selectionSort (int intselect[]) {
		int n = intselect.length; 
		for (int i = 0; i < n-1; i++) 
		{ 
		    int min_idx = i; 
		    for (int j = i+1; j < n; j++) {
		    	if (intselect[j] < intselect[min_idx]) {
				min_idx = j; 
			}
		    }
		int temp = intselect[min_idx]; 
	    	intselect[min_idx] = intselect[i]; 
	    	intselect[i] = temp; 
		} 
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
		case "linear":
			sorting.linearSort(linear);
		}
		
		System.out.println("What type of data?");
		String data = in.nextLine();
		switch (data) {
		case "
		
		System.out.println("How is it stored?");
		String store = in.nextLine();
		if (store == "array") {
		
		}
	}
}
