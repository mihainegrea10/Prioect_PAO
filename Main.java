import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aliment> alimente = new ArrayList<>();
        alimente.add(new Carne(10, "2023-03-20", "pui"));
        alimente.add(new Lapte(5, "2023-03-25", "vacă"));
        alimente.add(new Cereale(3, "2023-04-01", "ovăz"));
        alimente.add(new Carne(15, "2023-03-18", "vita"));

        // sortare dupa numarul de calorii
        alimente.stream()
                .sorted(Comparator.comparingDouble(Aliment::getCalorii))
                .forEach(System.out::println);
    }
}







