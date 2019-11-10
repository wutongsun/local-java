package offer10;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	private int size;
	private int min=Integer.MAX_VALUE;
	private Stack minStack=new Stack();
	private Integer[] elements=new Integer[10];
	public void push(int node) {
		
		elements[size++]=node;
		if(node<=min) {
			minStack.push(node);
			min=(int) minStack.peek();
		}else {
			minStack.push(min);
		}
	}
	
	private void pop() {
		Integer top=top();
		if(top!=null) {
			elements[size-1]=(Integer)null;
		}
		size--;
		minStack.pop();
		min=(int)minStack.peek();
	}
	private int top() {
		if(!this.empty()) {
			if(size-1>=0) {
				return elements[size-1];
			}
		}
		return (Integer)null;
	}
	public boolean empty() {
		return size==0;
	}
	public int min() {
		return min;
	}
	
}
