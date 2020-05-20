package ss5_advanced_object_oriented_design.thuc_hanh.animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoeat() {
        return "could be fried";
    }
}
