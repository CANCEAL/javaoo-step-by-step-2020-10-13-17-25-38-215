package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    final String teacherIntroduction = " I am a Teacher. I ";

    Klass klass = new Klass();
    LinkedList<Klass> linkedList = new LinkedList<Klass>();
    private int classNumber;

    public Klass getKlass(){
        return klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public int getNumber() {
        return klass.getNumber();
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        if (getClasses().contains(student.getKlass())) {
            return true;
        } else {
            return false;
        }
    }

    public String introduce(){
        if(getClasses().size() != 0){
            String classNumbers = "";
            for(Klass klass: getClasses()){
                classNumbers += klass.getNumber() + ", ";
            }
            return super.introduce() + teacherIntroduction + "teach Class " + classNumbers.substring(0,classNumbers.length()-2) + ".";
        }
        return super.introduce() + teacherIntroduction + "teach No Class.";
    }

    public String introduceWith(Student studentName) {
        classNumber = getClasses().indexOf(studentName.getKlass());
        return classNumber == 0 ? super.introduce() + teacherIntroduction + "teach " + studentName.getName() + "." :
                super.introduce() + teacherIntroduction + "don't teach " +  studentName.getName() + ".";
    }
}
