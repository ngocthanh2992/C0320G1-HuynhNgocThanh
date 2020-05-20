package ss5_advanced_object_oriented_design.thuc_hanh.animal;

import ss5_advanced_object_oriented_design.thuc_hanh.fruit.Apple;
import ss5_advanced_object_oriented_design.thuc_hanh.fruit.Fruit;
import ss5_advanced_object_oriented_design.thuc_hanh.fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoeat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1: fruit){
            System.out.println(fruit1.howtoeat());
        }
    }
}
