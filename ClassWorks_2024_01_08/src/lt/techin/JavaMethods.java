package lt.techin;

public class JavaMethods {
    public static void main(String[] args) {

        System.out.println(Math.abs(100));
        Person person = new Person();
        String personData = person.getPersonData();
        System.out.println(personData);
        System.out.println(person.getPersonData("BMW"));
        String carModel = "Toyota";
        System.out.println(person.getPersonData(carModel));
        hello("Jonas ");
        hello("Jonas ");
    }

    public static void hello() {
        System.out.println("Hello");

    }

    public static void hello(String name) {
        System.out.println("Hello" + name + " " );
    }
}

