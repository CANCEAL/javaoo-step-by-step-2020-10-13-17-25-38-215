package practice09;

public class Teacher extends Person {
    final String teacherIntroduction = " I am a Teacher. I ";
    Klass klass = new Klass();

    public Klass getKlass(){
        return klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public int getNumber() {
        return klass.getNumber();
    }

    public String introduce() {
        return getNumber() != 0 ? super.introduce() + teacherIntroduction + "teach Class " + getNumber() + "." :
                super.introduce() + teacherIntroduction + "teach No Class.";
    }

    public String introduceWith(Student studentName) {
        return klass.getNumber() == studentName.getNumber() ? super.introduce() + teacherIntroduction + "teach " + studentName.getName() + "."
                : super.introduce() + teacherIntroduction + "don't teach " + studentName.getName() + ".";
    }
}
