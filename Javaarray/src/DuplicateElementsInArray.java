
public class DuplicateElementsInArray
{
	public static void main(String[] args) 
	{ 
		boolean flag = false;
		int arr[] = { 10,20,30,40,20,50,40};

		for (int i = 0; i < arr.length; i++) {

		for (int j = i + 1; j < arr.length; j++) {

		if (arr[i] == arr[j]) {
		System.out.println("found duplicate element : " + arr[i]);
		flag = true;
		}
		}

		}
		if (flag == false) {
		System.out.println("Duplicate Element Not found");
		}

		}
		}

