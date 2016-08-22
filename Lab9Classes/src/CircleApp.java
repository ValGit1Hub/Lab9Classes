
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		String choice = "Y";
		Scanner sc = new Scanner(System.in);
		double input =0d;
		final double PI =Math.PI;
		int cnt = 0;
		System.out.println("Welcome to the Circle Tester");
		while (choice.equalsIgnoreCase("y")) {
			// get the radius from the user
			System.out.println("Enter radius: ");
			input = sc.nextDouble();
			sc.nextLine(); // garbage line.
			while (input<1){
					System.out.println("You must enter an integer greater than 0. Enter radius: ");
					input = sc.nextDouble();//move to method readValidnum
					sc.nextLine();
				
			}
			// set the radius.
			c1.setRadius(input);
			System.out.println("Circumference: " + c1.getFormattedCircumference(PI));
			System.out.println("Area: " + c1.getFormattedArea(PI));
		    cnt++;
			System.out.println("Another? Y or N");
			choice = sc.nextLine();
		}//end of while
		System.out.println("You built "+cnt+" circles. Thanks for Playing. Goodbye");
		sc.close();
	}

}
