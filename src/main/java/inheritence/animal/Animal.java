package inheritence.animal;

public class Animal {

    public void makeSound(){
        System.out.println("ääni");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
        Animal animal = new Animal();
        animal.makeSound();

        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
