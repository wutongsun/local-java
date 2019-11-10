package offer14;

import java.util.LinkedList;

public class Solution {

	LinkedList list=new LinkedList();
    public void Insert(Integer num) {
        for(int i=0;i<list.size();i++) {
        	if(num<(int)list.get(i)) {
        		list.add(i,num);
        	}
        } 
    }

    public Double GetMedian() {
       if(list.size()%2==1)return (double)list.get(list.size()/2);
       else {
    	   int t=list.size()/2;
    	   return ((double)list.get(t)+(double)list.get(t-1));
       }
    }
}
