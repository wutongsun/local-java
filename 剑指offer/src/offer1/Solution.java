package offer1;

/**
 * 思路
 * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增
 * 因此从左下角开始查找，当要查找数字比左下角数字大，右移，小则上移(或者从右上角）
 * @author wutong
 *
 */
//从右上角开始找
public class Solution {
	public static boolean Find(int [][]array,int target) {
		int row=0;  				//行
		int col=array[0].length-1;	//列
		while(row<=array.length-1&&col>=0) {
			if(target==array[row][col]) {
				return true;
			}else if(target>array[row][col]) {
				row++;
			}else
				col--;
		}
		return false;
	}
	public static void main(String[] args) {
		int [][]array= { {1,2,3,4},{5,6,7,8,9},{10,12,13,14},{15,16,17,18},{20,21,22,23}};
		int target=10;
		if(Find(array,target)) {
			System.out.println("找到"+target+"了");
		}else {
			System.out.println("没有找到");
		}
	}
}
