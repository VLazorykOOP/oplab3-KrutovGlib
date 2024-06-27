import java.util.ArrayList;
import java.util.List;
import Student.Director;
import Student.Stud;
import Student.StudBuilder;
import Student.AStudBuilder;
import Student.NormalStudBuilder;
import Student.TermExpression;
import Student.Expression;
import Student.PrinterAdapter;

public class Main {
    public static void main(String[] args) {
        List<Stud> ST = new ArrayList<>();

        Director director = new Director();
        StudBuilder a = new AStudBuilder();
        StudBuilder n = new NormalStudBuilder();
        Expression isA = new TermExpression("5");

        for (int i = 0; i < 100; ++i) {
            boolean A = isA.interpret(Integer.toString(i));
            Stud stud;
            if (A) {
                director.setBuilder(a);
                stud = director.buildStud(i, 1500);
            } else {
                director.setBuilder(n);
                stud = director.buildStud(i, 1000);
            }
            ST.add(stud);
        }

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(ST);
    }
}
