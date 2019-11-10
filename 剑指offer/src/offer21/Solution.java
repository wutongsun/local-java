package offer21;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {

	public static ArrayList<String>Permutation(String str){
		ArrayList<String>list=new ArrayList<String>();
		StringBuilder stb=new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				swap(stb,i,j);
				list.add(new String(stb));
				swap(stb,i,j);
			}
		}
		
		return list;
	}
	public static void  swap(StringBuilder stb,int i,int j) {
		char ti=stb.charAt(i);
		char tj=stb.charAt(j);
		stb.deleteCharAt(i);
		stb.insert(i, tj);
		stb.deleteCharAt(j);
		stb.insert(j, ti);
		
	}
	public static void main(String[]args) {
		String str="abcd";
		ArrayList<String> list=Permutation(str);
		Comparator c=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int i=0;
				while(i<o1.length()&&(o1.charAt(i)>=o2.charAt(i))) {
					if(o1.charAt(i)==o2.charAt(i))i++;
					else 
						return 1;
				}
				return -1;
			}
		};
		//list.sort(c);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
