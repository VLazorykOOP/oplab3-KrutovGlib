package Student;

import java.util.List;

public class PrinterAdapter implements StudListPrinter {
    private Printer printer = new Printer();

    public void print(List<Stud> students) {
        for (Stud student : students) {
            printer.printStudent(student);
        }
    }
}
