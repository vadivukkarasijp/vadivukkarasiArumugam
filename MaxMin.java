import java.util.Scanner;
public class MaxMin {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b[]=new int[a];
	for(int i=0;i<a;i++){
		b[i]=sc.nextInt();
	}
	int max=b[0];
	int min=b[0];
	for(int i=1;i<a;i++){
	if(max<b[i]){
		max=b[i];
	}
	if(min>b[i]){
		min=b[i];
	}
	}
	System.out.println(min +""+max);
}
}
