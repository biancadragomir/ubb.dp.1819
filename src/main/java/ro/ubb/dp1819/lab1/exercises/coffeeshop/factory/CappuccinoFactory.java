package ro.ubb.dp1819.lab1.exercises.coffeeshop.factory;

import ro.ubb.dp1819.lab1.exercises.coffeeshop.entity.Drinkable;

import java.util.List;

public class CappuccinoFactory implements AbstractFactory{
    public CappuccinoFactory() {

    }
    @Override
    public Drinkable createCoffee(List<String> ingredientsList) {
        return null;
    }
}
