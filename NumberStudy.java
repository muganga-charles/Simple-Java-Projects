import java.util.*;
public class NumberStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number; 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		number = input.nextInt();
		if (number < 10)
			
			System.out.println("The number is less");
		else
			System.out.println("Thank u");
		
		switchStatement(number);
		System.out.println(getProduct(number));
		
		display2(number);
			
	}
	
	public static void switchStatement(int number) {
		switch(number) {
		case 1:
			System.out.println("Male");
			break;
		case 2:
			System.out.println("female");
			break;
		default:
			System.out.println("Enter one or two ");
			break;
		}
	}
	public static int getProduct(int number) {
		return number*4;
	}
	
	public static void display(int number) {
		if (number > 10)
			
			for(int i = 1; i<=number; i++)
				System.out.println(i);
	}
	
	public static void display1 (int number) {
		int i = 0;
		
		if (number > 10) {
			while (i<=number) {
				System.out.println(i);
				i+=1;
				}
	}
				
	}
	
	public static void display2 (int number) {
		int i = 0;
		if (number > 10) {
		do {
			System.out.println(i);
			i+=1;
		}while(i <= number);
	
		}
	}
	

}

