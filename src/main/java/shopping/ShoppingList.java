package shopping;

import java.time.LocalDate;
import java.util.List;

public record ShoppingList(
        LocalDate dateOfShopping,
        String place,
        List<Item> items
) {
}
