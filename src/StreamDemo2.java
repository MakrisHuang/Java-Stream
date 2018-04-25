import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String args[]){
        List<Order> orders = new ArrayList<>();
        List<String> items1 = new ArrayList<>(Arrays.asList("item1", "item2"));
        List<String> items2 = new ArrayList<>(Arrays.asList("item3", "item4"));
        orders.add(new Order("order1", items1));
        orders.add(new Order("order2", items2));
        List<String> list = orders.stream()
                .flatMap(order -> order.getLineItems().stream())
                .distinct()
                .map(String::new)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
