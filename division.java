import java.util.Scanner;
public class division {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=0;
	while(a%2==0){
		a=a/2;
	}
	System.out.println(a);
	}
}
