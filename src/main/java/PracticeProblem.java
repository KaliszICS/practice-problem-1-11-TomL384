import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static void q1() {
		//Write question 1 code here
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = ip.nextDouble();
		ip.nextLine();
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = ip.nextDouble();
		ip.nextLine();
		System.out.print("Input another number: ");
		double num1;
		num1 = ip.nextDouble();
		ip.nextLine();
		double num2;
		num2 = num/num1;
		System.out.println(Math.floor(num2));
		System.out.println(Math.ceil(num2));

	}

	public static void q3() {
		//Write question 3 code here
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = ip.nextDouble();
		ip.nextLine();
		System.out.println(Math.round(Math.sqrt(num)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = ip.nextDouble();
		ip.nextLine();
		System.out.print("Input another number: ");
		double num1;
		num1 = ip.nextDouble();
		ip.nextLine();
		System.out.println(Math.pow(num,num1));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = ip.nextDouble();
		ip.nextLine();
		System.out.print("Input another number: ");
		double num1;
		num1 = ip.nextDouble();
		ip.nextLine();
		System.out.print("Input one more number: ");
		double num2;
		num2 = ip.nextDouble();
		ip.nextLine();
		double num3;
		num3 = Math.max(num,num1);
		double num4;
		num4 = Math.min(num,num1);

		System.out.println(Math.max(num3,num2));
		System.out.println(Math.min(num4,num2));

	}

}
