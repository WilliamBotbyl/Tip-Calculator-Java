import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the bill amount.");
		double initialBill = input.nextDouble();

		System.out.println("Enter the gratuity rate in a percent form, i.e.  10 or 20");
		double tipRate = input.nextDouble();

		input.close();

		double tipAmount = tipRate / 100 * initialBill;

		double totalBill = tipAmount + initialBill;
		System.out.printf("The total amount due is %.2f", totalBill);

	}

}
