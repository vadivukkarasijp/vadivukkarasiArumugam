import java.util.Scanner;
public class sumdigit {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b;
	int sum=0;
	while(a!=0){
	b=a%10;
	a/=10;
	sum+=b;
	}
System.out.println(sum);
}
}
