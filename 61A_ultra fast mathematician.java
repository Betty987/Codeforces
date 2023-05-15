
import java.util.Scanner;
//time=O(n) space=O(n)

public class ultrafastmathematician {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s1 = sc.next();
		String s2 = sc.next();
		String res = "";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {//if they are different we append 1
				res+="1";
			}
			else {
				res+="0";
			}
		}
		
		System.out.print(res);
	}

}
