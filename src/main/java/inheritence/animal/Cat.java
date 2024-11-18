package inheritence.animal;

public class Cat implements Soundable, Movable{
    @Override
    public void makeSound(){
        System.out.println("meow meow");

    }

    @Override
    public void move(){
        System.out.println("cat is moving");
    }

}
