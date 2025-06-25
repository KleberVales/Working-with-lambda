package withLambda;

import java.util.*;

public class LambdaSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // Usando lambda para filtrar animais que pulam
        print(animals, a -> a.canHop());

        // Outros exemplos (opcional):
        // print(animals, a -> a.canSwim()); // animais que nadam
        // print(animals, a -> !a.canSwim()); // animais que NÃO nadam
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}

