import java.util.List;

public class Order {
    String name;
    List<String> lineItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<String> lineItems) {
        this.lineItems = lineItems;
    }

    public Order(String name, List<String> lineItems) {
        this.name = name;
        this.lineItems = lineItems;
    }
}
