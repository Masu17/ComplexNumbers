package ComplexNumbers;

import java.util.ArrayList;

public class Operations {
    private Complex one;
    private Complex two;
    private ArrayList<Complex> operations;

    public Operations(Complex one, Complex two) {
        this.one = one;
        this.two = two;
        operations = new ArrayList<>();
    }

    public ArrayList<Complex> getOperations() {
        return operations;
    }

    public void setOperations(Complex complex) {
        this.operations.add(complex);
    }

    public Complex getOne() {
        return one;
    }

    public Complex getTwo() {
        return two;
    }

    public Complex performAddition() {
        double realPart = one.getRealPart() + two.getRealPart();
        double imaginaryPart = one.getImaginaryPart() + two.getImaginaryPart();

        return new Complex(realPart, imaginaryPart);
    }

    public Complex performSubtraction() {
        double realPart = one.getRealPart() - two.getRealPart();
        double imaginaryPart = one.getImaginaryPart() - two.getImaginaryPart();

        return new Complex(realPart, imaginaryPart);
    }

    public Complex performMultiplication() {
        double realPart = (one.getRealPart() * two.getRealPart()) - (one.getImaginaryPart() * two.getImaginaryPart());
        double imaginaryPart = (one.getImaginaryPart() * two.getRealPart()) + (one.getRealPart() * two.getImaginaryPart());

        return new Complex(realPart, imaginaryPart);
    }

    public Complex performDivision() {
        double realPart = ((((one.getRealPart() * two.getRealPart()) + (one.getImaginaryPart() * two.getImaginaryPart()))) /
                ((Math.pow(two.getRealPart(), 2) + Math.pow(two.getImaginaryPart(), 2))));
        double imaginaryPart = (((one.getImaginaryPart() * two.getRealPart()) - (one.getRealPart() * two.getImaginaryPart()))) /
                (((Math.pow(one.getRealPart(), 2)) + (two.getImaginaryPart())));

        return new Complex(realPart, imaginaryPart);
    }
}