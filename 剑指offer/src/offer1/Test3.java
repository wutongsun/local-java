package offer1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {

	 public int MoreThanHalfNum_Solution(int [] array) {
		 ArrayList<Integer>list=new ArrayList<Integer>();
		 
	        for(int i=0;i<((array.length/2)+1);i++){
	            int tem=1;
	            for(int n=i+1;n<array.length;n++){
	                if(array[i]==(array[n])){
	                    tem++;
	                }
	                if(tem>(array.length/2)){
	                	 return array[i];
	                }
	            }
	            if(tem>(array.length/2)){
	                    return array[i];
	            }
	        }
	       return 0;
	 }
	    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        for(int i=0;i<k;i++){
	            for(int j=i+1;j<k;j++){
	                if(input[i]>input[j]){
	                    int tem=input[i];
	                    input[i]=input[j];
	                    input[j]=tem;
	                }
	            }
	        }
	       
	        for(int t=k;t<input.length;t++){
	            int i=k-1;
	            while(i>=0&&input[t]<=input[i])i--;
	            if(i<k-1){
	                //i+1-->k-1
	                int x=k-1;
	                while(x>i+1){
	                    input[x]=input[x-1];
	                    x--;
	                }
	                input[i+1]=input[t];
	            }
	        }
	        for(int i=0;i<k;i++) {
	        	list.add(input[i]);
	        }
	        return list;
	    }
	    public static int LastRemaining_Solution(int n, int m) {
	        int []isM=new int[n];
	        int len=n;
	        int t=0;
	        for(int i=0;i<n;i++){
	            isM[i]=0;
	        }
	        while(len>1){
	        	 for(int i=0;i<m;i++) {
	 	        	while(isM[t]!=0)t=(t+1)%n;
	 	        	t=(t+1)%n;
	 	        }
	 	        isM[(t+n-1)%n]=1;
	 	       while(isM[t]!=0)t=(t+1)%n;
	 	        for(int i=0;i<n;i++) {
	 	        	System.out.print(isM[i]+" ");
	 	        }
	 	        System.out.println();
	            len--;
	        }
	        return t;
	    }
	    public static boolean isUgly(long num) {
	        while(num%2==0) {
	        	num=num/2;
	        }
	        while(num%5==0) {
	        	num=num/5;
	        }
	        while(num%3==0) {
	        	num=num/3;
	        }
	        if(num==1)return true;
	        return false;
	    }
	    public static long GetUglyNumber_Solution(int index) {
	        long  num=1;
	        for(int i=1;i<=index;){
	            if(isUgly(num)){
	                i++;
	                num++;
	            }else{
	                num++;
	            }
	        }
	        return num-1;
	    }
	    public static void main(String[] args) {
	    	Scanner r=new Scanner(System.in);
	    	while(r.hasNext()) {
	    		String t=r.next();
		    	System.out.println(t);
	    	}
	    	
	    }
}
/**
运行时间：13ms

占用内存：9444k
**/