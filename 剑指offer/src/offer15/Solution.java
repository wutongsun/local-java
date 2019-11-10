package offer15;

public class Solution {
	 public static int TreeDepth(TreeNode root,int num) {
	        if(root==null)return num;
	        else{
	            int left=TreeDepth(root.left,num+1);
	            int right=TreeDepth(root.right,num+1);
	            if(left>right){
	                return left;
	            }else{
	                return right;
	            }
	        }
	    }
	 public static void main(String[] args) {
		 TreeNode t=new TreeNode(1);
		 t.left=new TreeNode(2);
		 System.out.println(Solution.TreeDepth(t, 0));
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