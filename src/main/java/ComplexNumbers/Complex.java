package ComplexNumbers;

    public class Complex implements Cloneable, Comparable {
    private double realPart;
    private double imaginaryPart;
    private double absoluteValue;

    public Complex(double real, double imaginary) {
        realPart = real;
        imaginaryPart = imaginary;
    }

    public Complex(double real) {
        realPart = real;
        imaginaryPart = 0;
    }

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

// Getters and setters

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getAbsoluteValue() {
        return absoluteValue;
    }

// Methods

    @Override
    public String toString() {
        String complexNumber = "(" + realPart + " + " + imaginaryPart + "i)";
        if (realPart == 0 && imaginaryPart == 0) {
            complexNumber = "0";
        } else if (imaginaryPart == 0) {
            complexNumber = "(" + realPart + ")";
        }
        return complexNumber;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Complex) {
            if (this.absoluteValue == ((Complex) o).absoluteValue) {
                return 0;
            } else if (this.absoluteValue > ((Complex) o).absoluteValue) {
                return 1;
            } else if (this.absoluteValue < ((Complex) o).absoluteValue) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public Complex clone() {
        try {
            return (Complex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void calculateAbsoluteValue() {
        //| a+bi | = sqrt(a² + b²)
        absoluteValue = Math.sqrt(((Math.pow(this.realPart, 2)) + (Math.pow(this.imaginaryPart, 2))));
    }
}