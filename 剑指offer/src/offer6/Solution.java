package offer6;

public class Solution {

	public static int minNumberInRotateArray(int [] array) {
		if(array.length==0) {
			return 0;
		}
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1]) {
				return array[i];
			}
		}
		return array[0];
	}
	public static void main(String[] args) {
		int [] array= {4,3,2,5,6};
		System.out.println(minNumberInRotateArray(array));
	}
}
