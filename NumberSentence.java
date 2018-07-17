import java.util.Scanner;
public class NumberSentence {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a="";
	a=sc.nextLine();
	char b[]=a.toCharArray();
	int count=0;
	for(int i=0;i<b.length;i++){
		if(b[i]=='.')
		count++;
		}
	System.out.println(count+1);
}
}
