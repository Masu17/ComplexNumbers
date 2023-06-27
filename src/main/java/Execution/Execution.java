package Execution;

import ComplexNumbers.Complex;
import ComplexNumbers.Operations;

import java.util.ArrayList;
import java.util.Collections;

public class Execution {
    private ArrayList<Complex> list = new ArrayList<>();

    public ArrayList<Complex> getList() {
        return list;
    }

    public void executeOperations(Operations op) {

        op.setOperations(op.performAddition());
        op.setOperations(op.performSubtraction());
        op.setOperations(op.performMultiplication());
        op.setOperations(op.performDivision());
        op.getOne().calculateAbsoluteValue();
        op.getTwo().calculateAbsoluteValue();

    }

    public Complex generateNewComplex(Operations op) {

        double realPart = Double.parseDouble(String.format("%.3f", op.getOne().getAbsoluteValue()).replace(",", "."));
        double imaginaryPart = Double.parseDouble(String.format("%.3f", op.getTwo().getAbsoluteValue()).replace(",", "."));

        return new Complex(realPart, imaginaryPart);

    }

    public void sortComplexNumbers(Complex numOne, Complex numTwo, Complex numThree, Complex numFour) {

        numThree.calculateAbsoluteValue();
        numFour.calculateAbsoluteValue();

        list.add(numOne);
        list.add(numTwo);
        list.add(numThree);
        list.add(numFour);

        Collections.<Complex>sort(list);

    }
}