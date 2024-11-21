public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("angela");
        Animal dog = new Dog("pluto");


        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());

        System.out.println(cat.eat("catFood"));
        System.out.println(dog.eat("dogFood"));
    }
}