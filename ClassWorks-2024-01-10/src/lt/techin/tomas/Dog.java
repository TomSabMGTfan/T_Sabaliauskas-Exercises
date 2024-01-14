package lt.techin.tomas;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        //super.makeSound();
        System.out.println("Dog make sound ...");
    }
//    public void showColor(){
//        System.out.println(color);
//    }
}
