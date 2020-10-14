package practice07;

public class Student extends Person {
    Klass klass = new Klass();

    public Klass getKlass(){
        return klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getNumber(){
        return klass.getNumber();
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at Class "+ klass.getNumber() + ".";
    }

}
