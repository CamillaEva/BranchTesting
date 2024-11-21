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

    @Override
    String mood(boolean mood) {
        if(mood == true){
            return "logrer";
        } else {
            return "knurrer";
        }
    }


}
