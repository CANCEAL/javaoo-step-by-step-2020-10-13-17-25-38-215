package practice10;

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
        return klass.getLeader() != null ? super.introduce() + " I am a Student. I am Leader of Class " + getNumber() + "."
                : super.introduce() + " I am a Student. I am at Class " +  getNumber() + ".";
    }

}
