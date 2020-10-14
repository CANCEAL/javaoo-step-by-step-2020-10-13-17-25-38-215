package practice06;

public class Teacher extends Person {
    int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        String firstString = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. ";
        String secondString = "I teach Class " + getKlass() + ".";
        String secondStringNull = "I teach No Class.";

        return klass != 0 ? firstString + secondString : firstString + secondStringNull;
    }
}
