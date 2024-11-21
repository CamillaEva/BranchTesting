public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Cleo");
        Animal dog = new Dog("Pluto");


        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());

        System.out.println(cat.eat("catFood"));
        System.out.println(dog.eat("dogFood"));

        System.out.println(cat.mood(true));
        System.out.println(dog.mood(false));

        System.out.println("hej med dig");
    }
}
