import java.util.Scanner;
public class Number {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>=1 && a<=10){
	System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
}
}
