import java.util.Scanner;
public class minimumelement {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	for(int i=0;i<10;i++){
		a[i]=sc.nextInt();
	}
	int min=a[0];
	for(int i=1;i<10;i++){
		if(min>a[i]){
			min=a[i];
		}
	}
System.out.println(min);
}
}
