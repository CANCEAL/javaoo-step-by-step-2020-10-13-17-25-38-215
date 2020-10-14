package practice08;

public class Teacher extends Person {
    Klass klass = new Klass();;

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
        String teacherIntroduction = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. ";
        String teacherHasClass = "I teach Class " + getNumber() + ".";
        String teacherHasNoClass = "I teach No Class.";

        return getNumber() != 0 ? teacherIntroduction + teacherHasClass : teacherIntroduction + teacherHasNoClass;
    }

    public String introduceWith(Student studentName) {
        String teacherIntroduction = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. ";
        String teacherHasStudent = "I teach " + studentName.getName() + ".";
        String teacherHasNoStudent = "I don't teach " +  studentName.getName() + ".";

        return klass.getNumber() == studentName.getNumber() ? teacherIntroduction + teacherHasStudent : teacherIntroduction + teacherHasNoStudent;
    }
}
