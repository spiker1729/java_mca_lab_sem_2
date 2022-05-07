public class Complex {
    private double first, second;

    public Complex(double real, Double img) {
        first = real;
        second = img;

    }

    Complex addition(Complex num1) {

        Double real = num1.first + this.first;
        Double img = num1.second + this.second;
        return new Complex(real, img);
    }

    Complex subtraction(Complex num1) {

        Double real = this.first - num1.first;
        Double img = this.second - num1.second;
        return new Complex(real, img);
    }

    Complex multiplication(Complex num1) {

        Double real = (this.first * num1.first) - (this.second * num1.second);
        Double img = (this.first * num1.second) + (this.second * num1.first);
        return new Complex(real, img);
    }

    Complex division(Complex temp) {

        Double real = (((this.first * temp.second) + (this.second * temp.second))
                / (Math.pow(temp.first, 2) + Math.pow(temp.second, 2)));
        Double img = (((this.second * temp.second) - (this.second * temp.first))
                / (Math.pow(temp.first, 2) + Math.pow(temp.second, 2)));
        return new Complex(real, img);
    }

    void display() {
        System.out.println("Complex number is =: "
                + first + " + "
                + "i(" + second + ")");
    }

}