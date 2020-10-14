package practice08;

public class Student extends Person {
    Klass klass = new Klass();

    public Klass getKlass(){
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public int getNumber(){
        return klass.getNumber();
    }

    public String introduce() {
        String studentIntroduction = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. ";
        String studentLeader = "I am Leader of Class " + getNumber() + ".";
        String studentNotLeader = "I am at Class " + getNumber() + ".";

        return klass.getLeader() != null ? studentIntroduction + studentLeader : studentIntroduction + studentNotLeader;
    }

}
