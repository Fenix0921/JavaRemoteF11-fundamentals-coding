package shopping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class ShoppingExercise {
    public static void main(String[] args) {


        ShoppingList firstShopping = new ShoppingList(LocalDate.of(2024, Month.JANUARY, 25),
                "Internet",
                List.of(
                        new Item("Iphone X", 1000.45),
                        new Item("drinks", 505.99)
                ));

        var firstShoppingTotalPrice = firstShopping.items()
                .stream()
                .map(Item::priceInEuros)
                .sum();

        System.out.println("Total price of first shopping: " + firstShoppingTotalPrice);

        ShoppingList secondShopping = new ShoppingList(LocalDate.of(2024, Month.FEBRUARY, 25),
                "Internet",
                List.of(
                        new Item("Galaxy X", 999.99),
                        new Item("drinks", 444.99)
                ));

        var myShoppings = List.of(firstShopping, secondShopping);
        var secondShoppingTotalPrice = secondShopping.items()
                .stream()
                .mapToDouble(item -> item.priceInEuros())
                .sum();

        //find total price for all items
        var totalShoppingPrice = firstShoppingTotalPrice + secondShoppingTotalPrice;
        System.out.println("Total price of all shoppings: " + totalShoppingPrice);

        // find total price of all items
        var myShoppings = List.of(firstShopping, secondShopping, firstShopping);
        myShoppings.stream()
                .map(shoppingList -> shoppingList.items())
                .map(items -> items.stream())
                .filter()
    }
}