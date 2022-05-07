import java.util.*;
import java.util.Scanner;

class UseRectangle {

	public static void main(String[] args) {
		Rectangle first = new Rectangle();
		Scanner integer = new Scanner(System.in);

		System.out.println("Enter the length and breadth of second rectangle");

		double length = integer.nextDouble();
		double breadth = integer.nextDouble();
		double bottomLeft[] = new double[2];
		System.out.println("Enter the bottom left coordinates of second triangle");
		for (int i = 0; i < 2; i++)
			bottomLeft[i] = integer.nextDouble();

		Rectangle second = new Rectangle(length, breadth, bottomLeft);// three arguments being passed to constructor

		second.setBreadth(-4.5);

		System.out.println("(x coordinate)bottomLeft point of first trianlge is " + first.getbottomleft1());
		System.out.println("(y coordinate)bottomLeft point of first trianlge is " + first.getbottomleft2());
		System.out.println();
		System.out.println("(x coordinate)bottomLeft point of second trianlge is " + second.getbottomleft1());
		System.out.println("(y coordinate)bottomLeft point of second trianlge is " + second.getbottomleft2());
		System.out.println();
		System.out.println("The first rectangle length is " + first.getlength());
		System.out.println("The first rectangle breadth is " + first.getBreadth());
		System.out.println();
		System.out.println("The second rectangle Length is " + second.getlength());
		System.out.println("The second rectangle breadth is " + second.getBreadth());
		System.out.println();
		System.out.println("The area  of first  rectangle  is " + first.getArea());
		System.out.println("The area of second  rectangle  is " + second.getArea());
		System.out.println();
		System.out.println("The perimeter of first  rectangle  is " + first.getPerimetre());
		System.out.println("The perimeter of second  rectangle  is " + second.getPerimetre());

	

	}

}