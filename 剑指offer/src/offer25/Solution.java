package offer25;

public class Solution {

	public static int[] multiply(int[]A) {
		if(A.length==0)return new int[0];
		int []b=new int[A.length+1];
		b[0]=1;
		for(int i=1;i<A.length;i++) {
			b[i]=b[i-1]*A[i-1];
		}
		
		return b;
	}
	public static int[] multiply2(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;
            //计算下三角连乘
            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            //计算上三角
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int []b=multiply(a);
		int []c=multiply2(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"  ");
		}
		System.out.println("");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+"  ");
		}
	}
}
