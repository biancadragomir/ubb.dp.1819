package ro.ubb.dp1819.lab1.exercises.coffeeshop.entity;

public class Cappuccino implements Drinkable{
    // cappuccino: 2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk
    public Cappuccino() {
        System.out.println("Making a cappuccino.");
    }

    @Override
    public void prepare() {
        System.out.println("A cappuccino is being prepared...");
    }
}
