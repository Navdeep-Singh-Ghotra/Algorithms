package searching;

public class Driver {

	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		
		int [] arr = {2,4,6,8};
		
		System.out.println(linearSearch.search(arr, 1));

	}

}
