package inheritence.animal;

public abstract class AnimalBase {

    abstract void makeSound(); //abstrakti metodi

    public void sleep(){ // konkreettinen metodi
        System.out.println("Animal is sleeping");
    }

}
