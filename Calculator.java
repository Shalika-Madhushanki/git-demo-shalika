package cakeLabs;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[]){
		int a;
		int b;
		String operation;
		int answer;
		
		System.out.println("....Welcome to my Calculator....");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number=");
		a= scanner.nextInt();
		System.out.println("Enter second number=");
		b= scanner.nextInt();
		System.out.println("Enter the Operation=");
		operation=scanner.next();
		 
		if ("+".equals(operation)){
			answer=add(a,b);
			System.out.println("Answer="+answer);
		}else{
			System.out.println("invalid operation");
		}
	}
	
	public static int add(int a,int b){
		return (a+b);
	}
}
