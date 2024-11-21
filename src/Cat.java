public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "MEOW!";
    }

    @Override
    Boolean eat(String foodType) {
        return true;
    }

    @Override
    String mood(boolean mood) {
       if (mood==true){
           return "spinder";
       } else {
           return "hvæser";
       }
    }
}
