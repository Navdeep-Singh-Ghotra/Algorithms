package searching;

public class LinearSearch {
	//logic for linear search 
	public int search(int arr[], int x)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x)
                return i;
        }
  
        // If element not found, Return -1
        return -1;
    }

}
