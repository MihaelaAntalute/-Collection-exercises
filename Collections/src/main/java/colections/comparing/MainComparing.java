package colections.comparing;

import java.util.*;

import static java.util.Collections.sort;

public class MainComparing {
    public static void main(String[] args) {
        Coin coin = new Coin(350,2010);
        Coin coin1 = new Coin(10,2019);
        Coin coin2 = new Coin(150,2012);
        Coin coin3 = new Coin(200,2013);
        Coin coin4 = new Coin(250,2017);
        List<Coin> coins = new ArrayList<>();
        coins.add(coin);
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        System.out.println(coins);
        //nu ma lasa altfel
        sort(coins);
        System.out.println(coins);
        coins.sort(new MintYearComparator());
        System.out.println(coins);

        Set<Coin> coinSet = new TreeSet<>();
        coinSet.add(coin1);
        coinSet.add(coin3);
        coinSet.add(coin);
        coinSet.add(coin2);
        System.out.println(coinSet);
        Set<Coin>coinsOrderedByMindYear = new TreeSet<>(new MintYearComparator());
        coinsOrderedByMindYear.addAll(coinSet);
        System.out.println(coinsOrderedByMindYear);

    }
}
