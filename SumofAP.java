import java.util.Scanner;
public class SumofAP {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=(c/2)*((2*a)+(c-1)*b);
	System.out.println(d);
	
}
}
