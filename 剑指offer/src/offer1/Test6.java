package offer1;

import java.util.ArrayList;

public class Test6 {

	 public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        ArrayList<Integer>list=new ArrayList<Integer>();
	        for(int i=0;i<array.length;i++){
	            if(list.indexOf(array[i])==-1){
	                list.add(array[i]);
	            }else{
	                list.remove(list.indexOf(array[i]));
	            }
	        }
	        num1[0]=list.get(0);
	        num2[0]=list.get(1);
	        System.out.println(list.get(0)+" "+list.get(1)+list.toString());
	    }
	 public static void main(String[] args) {
		 System.out.println(Test6.Sum_Solution(10));
	 }
	 public static int Sum_Solution(int n) {
	        int sum=n;
	        boolean t=(n>0)&&((sum+=Sum_Solution(n-1))>0);
	        return sum;
	    }
	 
}
