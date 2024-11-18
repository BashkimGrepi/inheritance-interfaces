package inheritence.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat mCat = new Cat();
        Dog mDog = new Dog();

        List<Soundable> animals =  new ArrayList<>();
        animals.add(mDog);
        animals.add(mCat);

        for (Soundable animal : animals) {
            animal.makeSound();
        }

        mDog.move();
        mDog.makeSound();
        System.out.println();

        mCat.move();
        mCat.makeSound();


        Kissa kissa = new Kissa();
        kissa.makeSound();
        kissa.sleep();

        System.out.println();
        Koira koira = new Koira();
        koira.makeSound();
        koira.sleep();
    }
}
