package offer18;
import java.util.ArrayList;
public class Solution {
    private static ArrayList<TreeNode>list=new ArrayList<TreeNode>();
    static TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(k==0)return null;
        tree(pRoot);
        if(k>list.size())return null;
        return list.get(k-1);
    }
    private static void tree(TreeNode tem){
        if(tem!=null){
            if(list.size()==0)list.add(tem);
            else {
            	if(tem.val<list.get(0).val)list.add(0,tem);
            	else {
            		for(int i=list.size()-1;i>=0;i--) {
            			if(list.get(i).val<tem.val) {
            				list.add(i+1,tem);
            				break;
            			}
            		}
            	}
            }
            tree(tem.left);
            tree(tem.right);
        }
    }
    public synchronized static void main(String[] args) {
    	TreeNode test=new TreeNode(8);
    	test.left=new TreeNode(6);
    	test.right=new TreeNode(10);
    	test.left.left=new TreeNode(5);
    	test.left.left.left=new TreeNode(7);
    	test.right.left=new TreeNode(9);
    	test.left.right=new TreeNode(11);
    	
    	System.out.println(KthNode(test,3).val);
    	for(int i=0;i<list.size();i++)
    	System.out.print(list.get(i).val+" ");
    }

}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}