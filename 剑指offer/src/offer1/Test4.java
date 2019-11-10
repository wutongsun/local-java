package offer1;

import java.util.Scanner;

public class Test4 {

	 public static void main(String[] args){
	        Scanner r=new Scanner(System.in);
	        while(r.hasNext()){
	            int n=r.nextInt();
	            int Y1,Y2;
	            if(n%2==1){
	                Y1=n;
	                Y2=n-1;
	            }else{
	                Y2=n;
	                Y1=n-1;
	            }
	            System.out.println(y1(Y1)+" "+y2(Y2));
	        }
	    }
	    public static int y1(int n){//    奇数
	        if(n<=0)
	        return 0;
	        int sum=0;
	        for(int i=1;i<=n;i=i+2){
	            sum+=f(i);
	        }
	        return sum;
	    }
	    public static int y2(int n){//偶数
	        if(n<=0)
	        return 0;
	        int sum=0;
	        for(int i=2;i<=n;i=i+2){
	            sum+=f(i);
	        }
	        return sum;
	    }
	    public static int f(int n){
	        int sum=1;
	        while(n>=1){
	            sum*=n;
	            n--;
	        }
	        return sum;
	    }
}
