package offer1;

public class test {

	static String x="1";
	static int y=1;
	static int z;
	public static void main(String[] args) {
		//static int z=2;  X
		//static int f=3;
		
		int x1=0;
		int y1=0;
		int z1=0;
		for(int t=0;t<5;t++) {
			if((++x1>2)&&(++y1>2)&&(z1++>2)) {
				x1++;
				++y1;
				z1++;
				System.out.println("x1="+x1+"  y1="+y1+" z1="+z1);
				
			}
			System.out.println("x1="+x1+"  y1="+y1+" z1="+z1);
		}
		System.out.println("x1="+x1+"  y1="+y1+" z1="+z1);
		System.out.println(x+y+z);
		
		
		int list[]= {1,2,3,4,5,6,7};
		reOrderArray(list);
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}
	public static void reOrderArray(int [] array) {
        if(array==null||array.length==0){
            return;
        }
        int []list=new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                list[j++]=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                list[j++]=array[i];
            }
        }
        for(int i=0;i<list.length;i++) {
			System.out.print(list[i]);
		}
        
        array=new int[7];
        array=list;
        array[1]=4325;
        
    }
}
