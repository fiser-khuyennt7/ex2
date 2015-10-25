import java.lang.*;
public class Chuyen {
	public static void main (String [] args) {
		String g = "line";
		char c = g.charAt(0);
		char[] c_arr = g.toCharArray();
		int do_dai = c_arr.length;
		for(int i = 0; i <= do_dai; i++) {
			System.out.println(c_arr[i]);
		}
	}
}