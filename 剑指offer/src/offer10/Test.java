package offer10;

public class Test {

	 public int StrToInt(String str) {
	        int len=str.length()-1;
	        for(int i=0;i<str.length();i++){
	            if((i==len)||(str.charAt(len)=='+'||str.charAt(len)=='-')){
	                return 1;
	            }else{
	                if(str.charAt(i)>='0'&&str.charAt(i)<='9');
	                else return 0;
	            }
	        }
	        return 0;
	    }
}
