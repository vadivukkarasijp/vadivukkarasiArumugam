import java.util.Scanner;
public class Average{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int c=0;
	int b[]=new int[a];
	for(int i=0;i<a;i++){
		b[i]=sc.nextInt();
	}
	for(int i=0;i<a;i++){
	 c+=b[i];
	}
	System.out.println(c/a);
	
}
}
