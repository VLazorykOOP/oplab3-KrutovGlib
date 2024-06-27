package Student;

public class Director {
    private StudBuilder builder;

    public void setBuilder(StudBuilder builder) {
        this.builder = builder;
    }

    public Stud buildStud(int id, int score) {
        builder.setId(id);
        builder.setScore(score);
        builder.setType();
        return builder.build();
    }
}
