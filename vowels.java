import java.util.Scanner;
class vowels{
public static void main(String[] args){
Char a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if((a>='a' &&a<='z')||(a>='A' && a<='Z')){
if((a=='a' ||a=='e' ||a=='i'||a=='o'||a=='u') ||(a=='A' ||a=='E'||a=='I'||a=='O'||a=='U'))
System.out.println("vowel");
else
System.out.println("consonant");
}
else
System.out.println("Invalid String");
