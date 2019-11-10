package offer13;

public class Solution {
	 public static int FirstNotRepeatingChar(String s) {
         int []c= {0};
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
       }
       for(int i=0;i<s.length();i++){
           if(c[s.charAt(i)]==1)return i;
       }
       return -1;
   }
	 public static void main(String[] args) {
		 System.out.println(Solution.FirstNotRepeatingChar("google"));
		 
	 }
}
