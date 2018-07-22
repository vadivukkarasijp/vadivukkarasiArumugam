import java.util.Scanner;
public class composite {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int i,j;
	int count=0;
	for(i=0;i<=a;i++){
		count=0;
		for(j=2;j<=i;j++){
			if(i%j==0){
				count++;
			}
		}
	}
	if(count!=1){
		System.out.println("yes");
		}
	else{
		System.out.println("NO");
	}
}}
