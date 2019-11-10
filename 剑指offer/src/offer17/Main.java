package offer17;
import java.util.Scanner;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        int m=r.nextInt();
        int n=r.nextInt();
        ArrayList<Integer>list=Main.f(m,n);
        for(int i=0;i<list.size();i++) {
        	if(i%10==9) {
        		System.out.println(list.get(i));
        	}else {
        		System.out.print(list.get(i)+" ");
        	}
        }
    }
    public static ArrayList<Integer>f(int m,int n){
        ArrayList<Integer>list=new ArrayList<Integer>();
        int num=2;
        for(int i=1;i<m;num++){
            if(Main.shushu(num)){
                i++;
            }
        }
        for(int i=m;i<=n;num++){
            if(Main.shushu(num)){
                i++;
                list.add(num);
            }
        }
        return list;
    }
    public static boolean shushu(int n){
        int i=2;
        while(true){
            if(n==2)return true;
            if(n%i==0)return false;
            if(i>=n/2+1)return true;
            i++;
        }
    }
}