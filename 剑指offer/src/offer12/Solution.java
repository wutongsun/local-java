package offer12;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public ArrayList<String> Permutation(String str) {
		char[]tem=str.toCharArray();
		
		
		return null;
    }
	public static void p(char[] arr,int start,int end) {
		if(start==end) {
			String res="";
			for(int i=0;i<arr.length;i++) {
				res+=arr[i];
			}
		StringBuffer str=new StringBuffer ();
		
		}
	}
	 private static int[] c=new int[300];
	    private StringBuffer str=new StringBuffer();
	    //Insert one char from stringstream
	    public void Insert(char ch)
	    {
	        c[(int)ch]++;
	        str.append(ch);
	    }
	  //return the first appearence once char in current stringstream
	    public char FirstAppearingOnce()
	    {
	        for(int i=0;i<str.length();i++){
	            if(c[(int)str.charAt(i)]==1)return str.charAt(i);
	        }
	        return '#';
	    }
}
