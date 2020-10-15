package practice09;

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
        if(this.number == student.getNumber()) {
            this.studentLeader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student jerry) {
    }
}
