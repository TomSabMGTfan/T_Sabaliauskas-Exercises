package lt.techin.tomas;

public class Student {
    String name;
    int age;
    static int studentCounter;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCounter++;
    }
}
