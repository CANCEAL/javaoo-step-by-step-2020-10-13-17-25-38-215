package practice07;

public class Klass {
    int number;

    public Klass(int number) {
        this.number = number;
    }

    public Klass() {

    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }
}
