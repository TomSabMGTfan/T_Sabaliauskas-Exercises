package lt.techin.tomas;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        //super.makeSound();
        System.out.println("Bird make sound ...");
    }
}
