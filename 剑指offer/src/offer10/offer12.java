package offer10;

import java.util.ArrayList;

public class offer12 {
	public static ArrayList<Integer> printMatrix(int [][]lis){
		int c=lis[0].length;
		int k=lis.length;
		int tem=c>k?k:c;
		ArrayList<Integer> list=new ArrayList<Integer>();
		int numCir=0;
		while(numCir<((tem-1)/2+1)) {
			if(list.size()==c*k) break;
			for(int i=numCir;i<c-numCir;i++) {
				list.add(lis[numCir][i]);
			}
			if(list.size()==c*k) break;
			for(int i=numCir+1;i<k-numCir;i++) {
				list.add(lis[i][c-1-numCir]);
			}
			if(list.size()==c*k) break;
			for(int i=c-numCir-2;i>=numCir;i--) {
				list.add(lis[k-numCir-1][i]);
			}
			if(list.size()==c*k) break;
			for(int i=k-numCir-2;i>numCir;i--) {
				list.add(lis[i][numCir]);
			}
			numCir++;
        }
        System.out.print(list.size()+"[");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.print("]");
		return list;
	}
    
    public static void main(String []args) {
    	int[][]list= {{1},{2},{3},{5}};
    	offer12.printMatrix(list);
    }
}
