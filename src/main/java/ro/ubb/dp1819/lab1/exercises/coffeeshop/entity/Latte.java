package ro.ubb.dp1819.lab1.exercises.coffeeshop.entity;

public class Latte implements Drinkable{
    public Latte() {
        System.out.println("Making a latte.");
    }

    @Override
    public void prepare() {
        System.out.println("A latte is being prepared...");
    }
}
