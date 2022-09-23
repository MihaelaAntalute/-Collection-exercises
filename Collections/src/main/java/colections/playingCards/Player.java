package colections.playingCards;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO adaugarea k e lista goala
    //Ce face sublist?
    public List<String> dealHand(List<String> deckCards, int numberOfCardsGenerated) {
        List<String> cardsReceivedForPlayer = new ArrayList<>();
        for (int i = 0; i < deckCards.size() ; i++) {
            if(numberOfCardsGenerated>0){
                cardsReceivedForPlayer.subList(0, numberOfCardsGenerated);

            }
        }


//        for(String cards: deckCards)
//     if(numberOfCardsGenerated > 0) {
//                deckCards.subList(0, numberOfCardsGenerated);
//                cardsReceivedForPlayer.add(cards);
//            }
//        }
        return cardsReceivedForPlayer;
    }

}   //Primeste ca parametru un deck si numarul de carti care se vor generate intr-o “mana”
//De exemplu, daca numarul de carti este 4, atunci functia va returna o lista de genul:
// “[ace of clubs, 3 of clubs, 5 of hearts, 10 of hearts]”
//Aceasta lista de fapt este o sublista cu ultimele 4 carti din lista de carti (deckCards)
// a pachetului (deck) primit ca parametru.
// (folositi metoda subList)
