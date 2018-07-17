import java.util.Scanner;
public class swapbitwise {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n= sc.nextInt();
    m = m ^ n;
    n = m ^ n;
    m = m ^ n;
    System.out.println(m+" "+n);
}
}
