public abstract class Animal {

    private String name;


    public Animal(String name){
        this.name = name;
    }


    abstract String makeSound();

    abstract Boolean eat(String foodType);

    abstract String mood(boolean mood);

    abstract String Jump(double distance);
}
