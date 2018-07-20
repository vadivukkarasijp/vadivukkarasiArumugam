import java.util.Scanner;
public class nearestmultipleten {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b[]={10,20,30,40,50,60,70,80,90,100};
	int c=0;
	for(int i=0;i<b.length;i++){
		if((b[i]-a)<=10){
			c=b[i];
		}
	}
	System.out.println(c);
}
}
