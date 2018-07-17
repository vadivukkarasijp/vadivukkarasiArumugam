import java.util.Scanner;
public class Fibbonaci{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a;
	a=sc.nextInt();
	int n1=0;
	int n2=1;
	System.out.print(n2+" ");
	int n3=0;
	for(int i=2;i<=a;i++){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+" ");
	}
}
}
