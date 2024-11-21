public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Woof!";
    }

    @Override
    Boolean eat(String foodType) {
        return true;
    }


}
