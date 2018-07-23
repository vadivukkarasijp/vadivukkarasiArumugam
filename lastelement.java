package programs;
import java.util.Scanner;
public class lastelement{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int b=sc.nextInt();
		System.out.println(a.substring(a.length()-b));
		
	}
}
