package offer2;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	 public String replaceSpace(StringBuffer str) {
	    	StringBuffer tem=new StringBuffer();
	        StringBuffer t=new StringBuffer("%20");
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)==' '){
	                tem.append(t);
	            }else{
	                tem.append(str.charAt(i));
	            }
	        }
	        return new String(tem);
	    }

	 static StringBuffer R(String str) {
		 StringBuffer s=new StringBuffer();
		 for(int i=str.length()-1;i>=0;i--) {
			 s.append(str.charAt(i));
		 }
		 return s;
	 }
	 public static String ReverseSentence(String str) {
	 
		 String[]tem=str.split(" ");
		 StringBuffer t=new StringBuffer();
		 for(int i=tem.length-1;i>0;i--) {
			 t.append((tem[i])+" ");
		 }
		 t.append(R(tem[0]));
		 return new String(t);
	 }
	 public static void main(String[] args) {
		 System.out.println(ReverseSentence("I am a student."));
	 }
}
