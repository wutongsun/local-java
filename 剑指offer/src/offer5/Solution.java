package offer5;

import java.util.Stack;

//队列  规定队头删除，队尾加入
public class Solution {
	private Stack<Integer> stack1=new Stack<Integer>();//入队列
	private Stack<Integer> stack2=new Stack<Integer>();//出队列
	public void push(int node) {
		stack1.push(node);
	}
	int pop() {
		if(stack1.empty()&&stack2.empty()) {
			throw new RuntimeException("Queue is empty! ");
		}
		if(stack2.empty()) {
			while(!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
