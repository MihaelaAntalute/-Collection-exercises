package colections.playingCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<String> suit;//lista tipuri de carti
    List<String> rank;//lista nr de carti
    List<String> deckCards = new ArrayList<>();//lista de carti

    public Deck(List<String> suit, List<String> rank, List<String> deckCards) {
        this.suit = suit;
        this.rank = rank;
        this.deckCards = deckCards;
    }

    public Deck() {

    }

    public List<String> getSuit() {
        return suit;
    }

    public void setSuit(List<String> suit) {
        this.suit = suit;
    }

    public List<String> getRank() {
        return rank;
    }

    public void setRank(List<String> rank) {
        this.rank = rank;
    }

    public List<String> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(List<String> deckCards) {
        this.deckCards = deckCards;
    }

    //OK
    public List<String> generateDeck(List<String> suit, List<String> rank) {
        for (String suit1 : suit) {
            for (String rank1 : rank) {
                String cardsMixed = suit1 + " de " + rank1;
                deckCards.add(cardsMixed);
            }
        }
        return deckCards;
    }
//Va popula lista de carti (deckCards) in functie de rank si suit,
// adica va genera String-uri cu toate combinatiile posibile
// (ex: “2 de trefla”, “as de rosu”, etc.), pe care le va adauga in deckCards

//TODO metoda nu amesteca
    public void shuffleDeck() {
        Collections.shuffle(deckCards);
        //System.out.println(deckCards);
        //mixedCards.add()
        //System.out.println(deckCards);
        //Va amesteca lista de carti deckCards (Collections.shuffle).Folosim random
    }
}
