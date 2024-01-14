package lt.techin.tomas;

public class Main {
    public static void main(String[] args) {
//    Box myBox1 = new Box(); //First Box
//    myBox1.setHeight(-10);
//    myBox1.setLenght(-20);
//    myBox1.setWight(8);
//       double volume1 = myBox1.showVolume();
//        System.out.println("My Box1: " + volume1);
//        Box myBox2 = new Box();
////        myBox2.height = 5.6;
////        myBox2.lenght = 10.4;
////        myBox2.wight = 10.8;
//        double volume2 = myBox2.showVolume();
//        System.out.println(volume2);
//
//        Box myBox3 = new Box(15, 45, 48);
//        System.out.println(myBox3.showVolume());
//
//        Box myBox4 = new Box(15);
//        System.out.println(myBox4.showVolume());
//
//        Box myBox5 = new Box(-15);
//        System.out.println(myBox5.showVolume());

//        System.out.println("Kazkas? " + Box.showVolume());
//
//        Student student1 = new Student("Tomas ", 45);
//        Student student2 = new Student("Egle ", 21);
//        System.out.println(Student.studentCounter);
//        MyMath myMath = new MyMath(10);
//        //myMath.PI = 6.28;
//        System.out.println(myMath.getArea());

        Animal animal1 = new Animal("Bird", 4);
        Animal animal2 = new Animal("Dog", 10);

        animal1.makeSound();
        animal2.makeSound();

        Bird bird1 = new Bird("Pingvinas", 2);
        Dog dog1 = new Dog("Reksas", 8);

        bird1.makeSound();
        dog1.makeSound();

    }
}
