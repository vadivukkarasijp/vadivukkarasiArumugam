import java.util.Scanner;
public class indexsum{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int c=sc.nextInt();
	int b[]=new int[a];
	int i=0;
	for(i=0;i<a;i++){
		b[i]=sc.nextInt();
	}
	for(i=0;i<a;i++){
		if(c==i){
			System.out.println(b[i-1]);
		}
	}
}
}
