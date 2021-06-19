import java.lang.*;
import java.util.*;

class Bank{
    double a;
	double b;
	Bank(double a){
		this.a = a;
	}
	
	public void checkBalance(double a) {
		System.out.println("You have " + a + " $");
	}
	
	public void deposite(double b) {
		System.out.println("You have diposited "+ b +" $");
		System.out.println("Your balance is now "+(a + b) +" $");
	}
	public void withdrawl(double b) {
		if(b > a) {
			throw new ArithmeticException("Insufficient Balance");
		}else {
			System.out.println("You have diposited " + b + " $");
			System.out.println("You have "+(a - b)+" left");
		}
	}
}

public class banking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		Bank c = new Bank(a);
		c.checkBalance(a);
		c.deposite(b);
		c.withdrawl(b);

	}

}
