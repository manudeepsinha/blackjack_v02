package com.project.blackjack_v02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Deck{

    //Deck is basically a list of cards.
    private List<Cards> cardsList = new ArrayList<Cards>();

    public Deck()
    {
        for(Suit suit : Suit.values())
        {
            for(Ranks rank : Ranks.values())
            {
                Cards card = new Cards(suit, rank);
                this.cardsList.add(card);
            }
        }
    }

    public void shuffle()
    {
        Collections.shuffle(cardsList);
    }

    public int deckSize()
    {
        return cardsList.size();
    }

    public Cards dealCard()
    {
        if(!cardsList.isEmpty())
        {
            return cardsList.remove(0);
        }
        else
        {
            System.out.println("The Deck is Empty");
            return  null;
        }
    }

}