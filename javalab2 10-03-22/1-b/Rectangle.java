import java.util.*;

class Rectangle {
    // Instance Variables
    private double[] bottomLeft;
    private double length;
    private double breadth;

    // Constructors
    public Rectangle() {
        // Null rectangle concept
        System.out.println("Enter the length and breadth of first rectangle");

        Scanner integer = new Scanner(System.in);

        length = integer.nextInt();
        breadth = integer.nextInt();

        /*
         * length = 1.0;
         * breadth = 0.0;
         */

        bottomLeft = new double[2];
        System.out.println("Enter the bottom left coordinates");

        for (int i = 0; i <= 1; i++) {
            bottomLeft[i] = integer.nextdouble);

        }
        /*
         * bottomLeft[0] = 0.0;
         * bottomLeft[1] = 0.0;
         */
    }

  	public Rectangle(double length, double breadth, double bottomLeft[]) {
		this.length = length;
		this.breadth = breadth;
		this.bottomLeft = new double[2];
		bottomleft=new double[2];

		for (int i = 0; i < 2; i++)
			this.bottomLeft[i] = bottomLeft[i];
	}
        /*
         * bottomLeft[0] = 0.0;
         * bottomLeft[1] = 0.0;
         */
    }

    // Methods

    public double getArea() {
        return length * breadth;
    }

    public double getPerimetre() {
        return (length + breadth) * 2;
    }

    public void setBreadth(double breadth) {
        if (breadth >= 0.0) {
            this.breadth = breadth;
        }
    }

    public double getBreadth() {
        return breadth;
    }

    public double getlength() {
        return length;
    }



	public double getbottomleft1() {

		return bottomLeft[0];

	}

	public double getbottomleft2() {

		return bottomLeft[1];

	}

}



