package practice04;

import practice03.Person;

public class Student extends Person {
    int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass(){
        return klass;
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at Class "+ getKlass() + ".";
        //My name is Tom. I am 21 years old.I am a Student. I am at Class 2.
    }
}