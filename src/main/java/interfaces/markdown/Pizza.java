package interfaces.markdown;

import java.util.List;

/**
 * This class represents pizzas. A pizza has a name and a price as well as a
 * list of toppings. Each topping is represented by a string, which you can
 * assume is always in lower case.
 *
 * Your task is to implement the MarkdownExport interface in this class. The
 * exportMarkdown() method should return a markdown representation of the pizza
 * object. The markdown representation should look something like this:
 *
 *
 * # Hawaiian
 *
 * Toppings:
 * - ham
 * - pineapple
 * - mozarella
 *
 * Price: 10.90
 */
public class Pizza implements MarkdownExport{

    private final String name;
    private final double price;
    private final List<String> toppings;
    

    public Pizza(String name, double price, List<String> toppings, String exportMarkdown) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
        
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String exportMarkdown(){
        StringBuilder markDown = new StringBuilder();
        markDown.append("# ").append(name).append("\n\n");

        markDown.append("Toppings: \n");
        for (String topping : toppings) {
            markDown.append("- ").append(topping).append("\n");
        }
        markDown.append("\n");
        markDown.append("Price: ").append(price);

        
        return markDown.toString();
    }

    
}
