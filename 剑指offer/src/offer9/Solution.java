package offer9;

public class Solution {

	public static int Jump(int n) {
		if(n==1) {
			return 1;
		}else if(n>=2) {
			return (int)Math.pow(2, n-1);
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(Jump(10));
	}
}
