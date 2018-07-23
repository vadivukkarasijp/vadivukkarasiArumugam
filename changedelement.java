package programs;
import java.util.Scanner;
public class changedelement{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a];
		int i,j;
		int count=0;
		for(i=0;i<a;i++){
			b[i]=sc.nextInt();	
		}
		for(i=0;i<a;i++){
			for(j=i+1;j<a;j++){ 
				count++;
				if(((1+b[i])!=b[j] && count>2)){
					System.out.println(b[j]-1);
				}
				i++;
				}
			break;
		}
	}
}
