package colections.demo.functionalprogramming;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        //(lista de parametrii) -> {corp}
        //1 exemple de functii lambda (expresii lambda)
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;
        isDivisible.apply(8, 2);

        Function<String, Integer> asd = x -> x.length();
        asd.apply("asdasd");

        Function<Integer, Integer> adder5 = (x) -> {
            x += 2;
            x += 3;
            return x;
        };


        //2 de fapt ce se intampla in spate?
        //        Calculator calculator = new Calculator() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };

        Calculator calculator = (a, b) -> a + b;
        calculator.add(2, 3);


        //3. pasarea expresiilor lambda ca parametrii
        //practic avem comportamente diferite in fuctie de expresia lambda
        //pasam o variabila de tip Function ca parametru
        Function<String, Integer> f = s -> s.length();
        printResultOfLambda(f);
        //sau direct o expresie lambda
        printResultOfLambda(s -> s.length());
        //sau alta expresie lambda
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });


        //6 vezi exemplul WellWisher
        //exemplul arata tranzitia de la OOP la programarea functionala, cu ajutorul interfetei functionale Greeting


        //7 categorii de interfete functionale
        // functions - exemple
        Function<String, Integer> converter = word -> Integer.parseInt(word);
        converter.apply("2000");
        Function<Integer, Integer> square = val -> val * val;
        square.apply(10);
        BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;
        System.out.println(sumFunction.apply(2, 3));


        //8 operators - exemple
        UnaryOperator<Long> longMultiplier = val -> 100_000 * val;
        System.out.println(longMultiplier.apply(2L)); // se afiseaza 200_000L (Long)

        // int to int operator
        IntUnaryOperator intMultiplier = val -> 100 * val;
        System.out.println(intMultiplier.applyAsInt(10)); // se afiseaza 1000 (int)

        // (String, String) to String operator
        BinaryOperator<String> appender = (str1, str2) -> str1 + str2;
        System.out.println(appender.apply("str1", "str2"));


        //9 predicates - exemple
        // Character to boolean predicate
        Predicate<Character> isDigit = c -> Character.isDigit(c);
        System.out.println(isDigit.test('h')); // se afiseaza false (boolean)

        // int to boolean predicate
        IntPredicate isEven = val -> val % 2 == 0;
        System.out.println(isEven.test(10));


        //10 suppliers - exemple
        Supplier<String> stringSupplier = () -> "Hello";
        System.out.println(stringSupplier.get()); // se afiseaza "Hello" (String)

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean()); // se afiseaza true (boolean)

        IntSupplier intSupplier = () -> 33;
        System.out.println(intSupplier.getAsInt());


        //11 consumers - exemple
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("!!!"); // se va afisa "!!!"
        BiConsumer<String, String> greet = (s1, s2) -> System.out.println(s1 + s2);
        greet.accept("Hello", "World");


        //12 comparator cu lambda, forEach cu lambda
        //vezi exemplul din PersonMain pentru a vedea cum pasam expresii lambda unor metode care sorteaza si care parcurg liste

    }

    public static boolean isDivisible(int x, int y) {
        return x % y == 0;
    }

    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY NEW YEAR 2023!"));
    }
}
