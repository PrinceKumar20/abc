import java.util.*;
public class Main {
    
    static int countNo(String str) {
	 int n = str.length();
	 int len = 0;
	 for(int i=0; i<n; i++) {
		 if(str.charAt(i)=='A'|| str.charAt(i)=='B'|| str.charAt(i)=='C'|| str.charAt(i)=='D'|| str.charAt(i)=='E'|| str.charAt(i)=='F'||str.charAt(i)=='G'|| str.charAt(i)=='H'|| str.charAt(i)=='I'|| str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='L'||str.charAt(i)=='M'||str.charAt(i)=='N'||str.charAt(i)=='O'||str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R'||str.charAt(i)=='S'||str.charAt(i)=='T'||str.charAt(i)=='U'||str.charAt(i)=='V'||str.charAt(i)=='W'||str.charAt(i)=='X'||str.charAt(i)=='Y'||str.charAt(i)=='Z') {
			 len++;
		 } 
	 }
	 return len;
 }
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
		    String str = sc.nextLine();
			System.out.println(countNo(str));
		}

	}
	

}