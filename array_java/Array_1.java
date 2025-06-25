package array_java;
//what is an array?
// An array is a collection of similar data types stored in contiguous memory locations.

// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
public class Array_1 {
	public Array_1() {
		//create an array using new keyword
		
		int[] arr = new int[5];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		arr[3]=15;
		arr[4]=16;  
		//array of using new keyword
		//create an array using array literal
		int[] arr2 = {1, 2, 3, 4, 5}; //declaration,instantiation and initialization
		//printing the array
		for(int i=0;i < arr.length;i++) {
			System.out.println("first array: " + arr[i]);
		}
		for(int i=0;i < arr2.length;i++) {
			System.out.println("second arry: " + arr2[i]);
		}
        //for each loop
		for(int ele : arr2) {
			System.out.println("for each loop: :" + ele);
		}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
