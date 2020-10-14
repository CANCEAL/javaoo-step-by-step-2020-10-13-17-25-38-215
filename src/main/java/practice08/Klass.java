package practice08;

public class Klass {
    int number;
    public Student studentLeader;

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

    public Student getLeader() {
        return studentLeader;
    }

    public void assignLeader(Student student) {
        if(this.number != student.getNumber()) {
            System.out.println("...");
        } else {
            this.studentLeader = student;
        }
    }
}
