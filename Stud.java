package Student;

public class Stud {
    private int id;
    private int score;
    private StudType type;

    public Stud(int id, int score, StudType type) {
        this.id = id;
        this.score = score;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public StudType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Stud{id=" + id + ", score=" + score + ", type=" + type + "}";
    }
}
