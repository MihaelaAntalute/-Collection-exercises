package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(2);
        prices.add(3);
        prices.add(5);
        System.out.println(prices);

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }

        prices.set(0,4);
        System.out.println(prices.get(0));
        //for each
        for(Integer price: prices){
            System.out.println(price*2);
        }
        //daca stergi un obiect de la indexul dat
        prices.remove(2);
        //daca vrei sa stergi un obiect
        // prices.remove(new Integer(5));
        System.out.println(prices);
        System.out.println(prices.indexOf(3));

        System.out.println(prices.contains(3));
        List<String> immutableList = Arrays.asList("asd","bcd","def");
        //immutableList.add("stf");

    }
}
