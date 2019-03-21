package ro.ubb.dp1819.lab1.exercises.coffeeshop.entity;

public class Espresso implements Drinkable{
    public Espresso() {
        System.out.println("Making an espresso.");
    }

    @Override
    public void prepare() {
        System.out.println("An espresso is being prepared...");
    }

}
