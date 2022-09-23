package colections.playingCards;

import java.util.ArrayList;
import java.util.List;

public class MainPlayerCards {
    public static void main(String[] args) {
         List<String> suit = new ArrayList<>();
        suit.add("trefla");
        suit.add("romb");
        suit.add("inima");
        suit.add("frunza");
        System.out.println(suit);

        List<String> rank = new ArrayList<>();
        rank.add("as");
        rank.add("2");
        rank.add("3");
        rank.add("4");
        rank.add("5");
        rank.add("6");
        rank.add("7");
        rank.add("8");
        rank.add("9");
        rank.add("10");
        rank.add("jalet");
        rank.add("dama");
        rank.add("popa");
        System.out.println(rank);
        List<String>deckCards = new ArrayList<>();
        Deck deck = new Deck();
        System.out.println(deck.generateDeck(suit,rank));
        System.out.println("Amestecare carti");
        deck.shuffleDeck();
        System.out.println(deckCards);
        Player player = new Player("Mihaela");
        int numbersOfCards = 4;
        System.out.println("Impartire carti");
        System.out.println(player.dealHand(deckCards,numbersOfCards));

    }
}
