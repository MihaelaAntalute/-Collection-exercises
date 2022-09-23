package colections.demo.comparingcollections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //sortarea unei liste
        Coin big = new Coin(25, 2006);
        Coin medium1 = new Coin(10, 2016);
        Coin medium2 = new Coin(10, 2001);
        Coin small = new Coin(2, 2000);

        List<Coin> coins = new ArrayList<>();
        coins.add(big);
        coins.add(medium1);
        coins.add(medium2);
        coins.add(small);

        Collections.sort(coins);
        System.out.println(coins);
        coins.sort(new MintYearComparator());
        System.out.println(coins);

        //sortarea unui set
        Set<Coin> coinsSet = new TreeSet<>();
        coinsSet.add(big);
        coinsSet.add(medium1);
        coinsSet.add(medium2);
        coinsSet.add(small);

        System.out.println(coinsSet);

        Set<Coin> coinOrderedByMintYear = new TreeSet<>(new MintYearComparator());
        coinOrderedByMintYear.addAll(coinsSet);
        System.out.println(coinOrderedByMintYear);
    }
}
