package ro.ubb.dp1819.lab1.exercises.coffeeshop.factory;

import ro.ubb.dp1819.lab1.exercises.coffeeshop.entity.Drinkable;

import java.util.List;

public interface AbstractFactory {
    Drinkable createCoffee(List<String> ingredientsList); //line == qty, unit, ingredient, [adv]
}
