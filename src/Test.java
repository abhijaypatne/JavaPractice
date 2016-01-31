import java.util.Arrays;

import javax.naming.BinaryRefAddr;

public class Test {
	
	private Test(){
		System.out.println("IN private constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[]{1,6,7, 223, 8, 3, 4};
	
		Arrays.sort(arr);
		System.out.println("index " + Arrays.binarySearch(arr, 4));
		for(int a : arr){
			System.out.println(a);
		}
	}

}
