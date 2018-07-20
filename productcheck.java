import java.util.Scanner;
public class productcheck {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	if((m*n)%2==0){
		System.out.println("even");
	}
	else{
		System.out.println("odd");
	}
	}
}
