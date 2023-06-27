package InputOutput;

import ComplexNumbers.Complex;
import ComplexNumbers.Operations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputOutput {

    public Complex enterNumber(int number) {


        String realPart = "";
        String imaginaryPart = "";

        while (realPart.equals("") && imaginaryPart.equals("")) {

            Scanner sc = new Scanner(System.in);

            do {
                System.out.printf("Enter the real part [a] of the %s complex number (integer part with two decimals and floating part with three decimals): ", (number == 1) ? "first" : "second");

                realPart = sc.next();

            } while (!checkDecimals(realPart));

            do {
                System.out.printf("Enter the imaginary part [b] of the %s complex number (integer part with two decimals and floating part with three decimals): ", (number == 1) ? "first" : "second");

                imaginaryPart = sc.next();

            } while (!checkDecimals(imaginaryPart));
        }

        realPart = realPart.replace(",", ".");
        imaginaryPart = imaginaryPart.replace(",", ".");

        return new Complex(Double.parseDouble(realPart), Double.parseDouble(imaginaryPart));

    }

    private boolean checkDecimals(String number) {

        String regex = "^-?\\d{2}(,\\d{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            return true;
        } else if (number.contains(".")) {
            System.out.println("The number does not accept the format with \",\"");
            return false;
        } else {
            System.out.println("The number does not contain decimals");
            return false;
        }
    }

    public void showOperations(Operations op) {
        System.out.println("\n---------Displaying Operations---------\n");
        System.out.printf("%s + %s = %s\n", op.getOne().toString(), op.getTwo().toString(), op.getOperations().get(0));
        System.out.printf("%s - %s = %s\n", op.getOne().toString(), op.getTwo().toString(), op.getOperations().get(1));
        System.out.printf("%s * %s = %s\n", op.getOne().toString(), op.getTwo().toString(), op.getOperations().get(2));
        System.out.printf("%s / %s = %s\n", op.getOne().toString(), op.getTwo().toString(), op.getOperations().get(3));

        System.out.printf("|%s| = %f\n", op.getOne().toString(), op.getOne().getAbsoluteValue());
        System.out.printf("|%s| = %f\n", op.getTwo().toString(), op.getTwo().getAbsoluteValue());
    }

    public void showNewCloned(Complex newNum, Complex clonedNum) {

        System.out.printf("[i] A new complex number has been generated: (%.3f + %.3fi)\n", newNum.getRealPart(), newNum.getImaginaryPart());
        System.out.printf("The generated number has been cloned. Real part: %.3f, Imaginary part: %.3f\n", clonedNum.getRealPart(), clonedNum.getImaginaryPart());

    }

    public void showSortedArrayList(ArrayList<Complex> list) {

        System.out.println("\n----Sorted List of Complex Numbers----\n");

        System.out.print("[");
        for (Complex numero :
                list) {
            System.out.print(numero + ",");
        }
        System.out.print("]\n");

        System.out.print("[");
        for (Complex numero :
                list) {
            System.out.printf("%.3f, ", numero.getAbsoluteValue());
        }
        System.out.print("]");

    }

}
