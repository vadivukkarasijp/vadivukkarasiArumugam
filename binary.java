import java.util.Scanner;
public class binary {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String d="";
	int count=0;
	while(a!=0){
		int b=a%10;
		a/=10;
		if(!(b==0 ||b==1)){
			d="no";
			count++;
		}
	}
		if(count==0){
			d="yes";
}
	System.out.println(d);
}
}
