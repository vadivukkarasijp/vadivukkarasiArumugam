import java.util.Scanner;
public class arraynumber{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c[]=new int[a];
	int count=0;
	for(int i=0;i<a;i++){
		c[i]=sc.nextInt();
	}
	for(int i=0;i<a;i++){
		if(c[i]==b){
			count++;
		}
	}
	System.out.println(count);
}
}
