package Student;

public class TermExpression implements Expression{
    private String data;

    public TermExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        return context.contains(data);
    }
}
