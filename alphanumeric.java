import java.util.Arrays;
import java.util.Scanner;
public class Alphanumberic {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	char ch[]=a.toCharArray();
	for(int i=0;i<ch.length;i++){
		if(ch[i]>='0' && ch[i]<='9'){
			System.out.print(ch[i]);
		}
	}
	
}
}
