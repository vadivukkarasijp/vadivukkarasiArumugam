import java.util.Scanner;
public class SplitDig {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	int temp=a;
	int i=0;
	while(a!=0){
		a/=10;
		count++;
	}
	int b[]=new int[count];
	while(temp!=0){
		int c=temp%10;
		temp/=10;
		b[i]=c;
		i++;
	}
	for(int j=i-1;j>=0;j--){
		System.out.print(b[j]+" ");
	}
	
}
}
