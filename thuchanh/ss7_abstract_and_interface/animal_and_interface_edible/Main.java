package module2.thuchanh.ss7_abstract_and_interface.animal_and_interface_edible;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Tiger();
        Animal animal2 = new Chicken();

        animal1.makeSound();
        animal2.makeSound();
//            System.out.println(animal.makeSound());
//
//            if (animal instanceof Chicken) {
//                Edible edibler = (Chicken) animal;
//                System.out.println(edibler.howToEat());
//            }
//        }
    }
}
