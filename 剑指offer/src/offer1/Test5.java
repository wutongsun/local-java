package offer1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {

	 public static void f(int x){
	        if(x>=0&&x<2){
	            System.out.println("y="+d((double)(-x+2.5)));
	        }else if(x>=2&&x<4){
	            System.out.println("y="+d((double)(2-1.5*(x-3)*(x-3))));
	        }else if(x>=4&&x<6){
	            System.out.println("y="+d(((double)(x)/2-1.5)));
	        }
	    }
	    public static String d(double value){
	        return String.format("%.1f", value).toString();
	    }
	    public static void main(String[] args){
	        Scanner r=new Scanner(System.in);
	        long m=r.nextLong();
	        for(int i=0;i<m;i++){
	            Long x=r.nextLong();
	            System.out.println(f1(x));
	        }
	        ArrayList<Integer>list=new ArrayList<Integer>();
	    }
	    
	    public static Long f1(Long n){
	        Long sum=(long) 1;
	        while(n>=1){
	            sum*=n;
	            n--;
	        }
	        return sum;
	    }
}
