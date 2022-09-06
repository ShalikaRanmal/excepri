import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        List<Integer> list2 = new ArrayList<>();

        cal.sum(list);
        cal.sum(list2);
        System.out.println("Hello world!");
    }
}