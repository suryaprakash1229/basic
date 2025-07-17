package javastart;
import java.util.Scanner;
public class num{
	public static void main(String[]args) {
		Scanner SC = new Scanner(System.in);
		int a=SC.nextInt();
		int s=3;
		for(int i=0;i<a;i++){
		    System.out.print(s);
		     s=s*10+ 3;
		    System.out.print(",");
		}
	}
	
}