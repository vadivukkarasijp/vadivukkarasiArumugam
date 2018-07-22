import java.util.Scanner;
public class gcd {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int number1 = sc.nextInt();
	 int number2 = sc.nextInt();
	 System.out.println(findGCD(number1,number2));
	 } 
private static int findGCD(int number1, int number2) {
	 if(number2 == 0){
         return number1;
     }
  return findGCD(number2, number1%number2);
}
}
