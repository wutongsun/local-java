package offer24;

import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer>maxInWindows(int [] num, int size){
		ArrayList<Integer>list=new ArrayList<Integer>();
		if(num.length==0||size<=0)return list;
		int tem=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>tem)tem=num[i];
		}
		if(size>num.length) {
			list.add(tem);
			return list;
		}
		for(int i=0;i<num.length-size+1;i++) {
			tem=num[i];
			for(int j=1;j<size;j++) {
				if(tem<num[j+i])tem=num[j+i];
			}
			list.add(tem);
		}
		return list;
	}
	public static void main(String[]args) {
		int []num= {10,14,12,11};
		ArrayList<Integer> list=maxInWindows(num,0);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
	
	
}
