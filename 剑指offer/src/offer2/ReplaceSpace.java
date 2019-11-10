package offer2;

public class ReplaceSpace {

	public static String replaceSpace(StringBuffer str) {
		return str.toString().replaceAll(" ", "%20");
		//return str.toString().replaceAll("\\s", "%20");
	}
	public static void main(String[] args) {
		System.out.println(replaceSpace(new StringBuffer("We will never say never !")));
	}
}
