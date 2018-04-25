import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String args[]){
        Integer intArr[] = new Integer[] {1 ,20 ,30};
        List<Integer> list = Arrays.stream(intArr).filter(i -> i > 18).collect(Collectors.toList());
        System.out.println(list);
    }
}
