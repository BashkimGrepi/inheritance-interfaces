package inheritence.animal;

public class Dog implements Soundable, Movable{
    @Override
    public void makeSound(){
        System.out.println("wuf wuf");

        
    }

     @Override
     public void move(){
        System.out.println("dog is moving");
     }

}
