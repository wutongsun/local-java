package offer8;

public class Solution {

	public static int JumpFloor(int n) {
		if(n==1)
			return 1;
		else if(n==2) 
			return 2;
		else return JumpFloor(n-1)+JumpFloor(n-2);
	}
	public static int Jump2(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
			int first=0;
			int last=1;
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum=first+last;
				first=last;
				last=sum;
			}
			return sum;
		}
	}
	public static void main (String[] args) {
		System.out.println(JumpFloor(10));
		System.out.println(Jump2(10));
		
	}
	
}
