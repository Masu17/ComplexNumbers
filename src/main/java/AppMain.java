import ComplexNumbers.Complex;
import ComplexNumbers.Operations;
import Execution.Execution;
import InputOutput.InputOutput;

public class AppMain {
    public static void main(String[] args) {
        AppMain app = new AppMain();
        app.program();
    }

    private void program() {
        InputOutput io = new InputOutput();
        Execution exec = new Execution();

        Complex numOne = io.enterNumber(1);
        Complex numTwo = io.enterNumber(2);

        Operations op = new Operations(numOne, numTwo);

        exec.executeOperations(op);
        io.showOperations(op);

        Complex newComplex = exec.generateNewComplex(op);
        Complex clonedComplex = newComplex.clone();

        io.showNewCloned(newComplex, clonedComplex);
        exec.sortComplexNumbers(numOne, numTwo, newComplex, clonedComplex);
        io.showSortedArrayList(exec.getList());
    }
}
