package L1;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}
