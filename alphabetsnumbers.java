import java.util.Scanner;
public class alphabetsnumbers {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	char c[]=a.toCharArray();
	String d="";
	String e="";
	for(int i=0;i<c.length;i++){
		if((c[i]>='a'&& c[i]<='z')||(c[i]>=' ')||(c[i]=='.')||(c[i]>='A' && c[i]<='Z')||(c[i]>='0' && c[i]<='9')){
			e+=c[i];
		
		}
	}
	int count=0;
	char b[]=e.toCharArray();
	for(int i=0;i<b.length;i++){
		if(b[i]>='0'&& b[i]<='9'){
			d="yes";
			count++;
		}
		else if(count==0){
			d="no";
		}
	}
	System.out.println(d);
	
}
}
