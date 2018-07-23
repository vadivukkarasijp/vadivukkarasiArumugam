import java.util.Arrays;
import java.util.Scanner;
public class lexicographicalorder {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	char ch[]=a.toCharArray();
	Arrays.sort(ch);
	for(int i=0;i<ch.length;i++){
		System.out.print(ch[i]+" ");
	}
	}
  }
