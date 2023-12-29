public class Test {
    public static void main(String[] args) {

    }
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    void displayInfo() {
        System.out.println(name);
    }
}