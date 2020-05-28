import java.util.Scanner;

public class Scan {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Enter any option");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction\r"
				+ "Press 0 to exit");
		int n = sc.nextInt();
	    if(n == 0)
			System.exit(0);
		System.out.println("Enter two values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(n == 1) {
			add(x,y);
		}
		else if(n==2) {
			sub(x,y);
		}
		}
	
	}
	public static void add(int a, int b) {
		int sum = a +  b;
		System.out.println("sum = " + sum);
		
	}
	public static void sub(int a, int b) {
		int sub  = a  -  b;
		System.out.println("subtraction = " + sub);
	}

}
