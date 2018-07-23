package programs;
import java.util.Scanner;
public class productofdig{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int c=1;
		while(a!=0){
			b=a%10;
			a/=10;
			c*=b;
		}
		System.out.println(c);
		
	}
}
