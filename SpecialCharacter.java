import java.util.Scanner;
public class SpecialCharacter{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a="";
	a=sc.nextLine();
	char b[]=a.toCharArray();
	int count=0;
	for(int i=0;i<b.length;i++){
		if(!((b[i]>='A' && b[i]<='Z')||(b[i]>='a' && b[i]<='z')||(b[i]>='0'&&b[i]<='9') ||(b[i]==' ')))
		count++;
		}
	System.out.println(count);
}
}
