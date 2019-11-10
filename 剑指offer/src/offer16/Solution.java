package offer16;

import java.util.ArrayList;

public class Solution {
	 public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	        int first=0;
	        int next=0;
	        for(int i=0;i<array.length;i++){
	            for(int j=i+1;j<array.length;j++){
	                if(array[i]+array[j]==sum){
	                    if(first==0&&next==0){
	                        first=i;
	                        next=j;
	                    }else if(array[i]*array[j]<array[first]*array[next]){
	                        first=i;
	                        next=j;
	                    }
	                    break;
	                }
	            }
	        }
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        if(first==0&&next==0)return null;
	        list.add(array[first]);
	        list.add(array[next]);
	        return list;
	    }
	 
	 public static void main(String[] args) {
		 int []array= {1,2,4,7,11,16};
		 String a="StringTest";
		 char[]list=new char [a.length()];
		 a.getChars(2, a.length()-1, list, 0);
		 System.out.println(Solution.FindNumbersWithSum(array, 10));
	 }
}
