package Student;

public class AStudBuilder implements StudBuilder{
    private int id;
    private int score;
    private StudType type;

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setType() {
        this.type = StudType.EXCELLENT;
    }

    public Stud build() {
        return new Stud(id, score, type);
    }
}
