package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Examples {

    static List<String> words = Arrays.asList("sadf","a","b");
    public static void main(String[] args) {
        //(lista de parametrii) -> {corpul functiei}
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;

        Function<String, Integer> convertToLength = s -> s.length();
        System.out.println(convertToLength.apply("sadfsadf"));

        Function<Integer, Integer> adder = x -> {
            x += 2;
            x += 3;
            return x;
        };

        Calculator calculator = new Calculator() {
            @Override
            public int computeOperation(int x, int y) {
                return x + y;
            }
        };
        System.out.println(calculator.computeOperation(2, 3));

        Calculator calculator1 = (x, y) -> x + y;
        Calculator calculator2 = (x, y) -> x - y;
        System.out.println(calculator1.computeOperation(2, 3));
        System.out.println(calculator2.computeOperation(4, 1));

        Function<String, Integer> function = s -> s.length();
        printResultOfLambda(function);

        printResultOfLambda(s -> s.length());
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });

        //functions
        //functiile primesc parametrii, returneaza rezultat
        // "2000" -> 2000
        Function<String, Integer> converter = s -> Integer.parseInt(s);
        System.out.println(converter.apply("2000"));

        BiFunction<Integer, Integer, Integer> compute = (x, y) -> x + y;
        System.out.println(compute.apply(3, 5));

        //operators
        //primesc parametri, returneaza rezultate de acelasi tip
        IntUnaryOperator square = y -> y * y;
        System.out.println(square.applyAsInt(4));
        BinaryOperator<String> concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.apply("mama", "tata"));

        //predicate
        //primesc parametrii, returneaza boolean
        Predicate<Character> isDigit = c -> Character.isDigit(c);
        System.out.println(isDigit.test('t'));

        IntPredicate isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        //consumers
        //primesc parametri, dar nu returneaza nimic
        Consumer<String> cons = s -> System.out.println(s);
        cons.accept("mere");
        BiConsumer<String, String> biCons = (s1, s2) -> System.out.println(s1+s2);
        biCons.accept("ana", "are");

        //suppliers
        //nu primesc parametri, dar returneaza ceva
        Supplier<String> word = ()-> "cuvant";
        System.out.println(word.get());
        BooleanSupplier booleanSupplier = () -> words.contains("sfdgsg");

        System.out.println(booleanSupplier.getAsBoolean());





    }

    public static void printResultOfLambda(Function<String, Integer> lambdaFunction) {
        System.out.println(lambdaFunction.apply("Programarea functionala este frumoasa 23"));
    }
}
