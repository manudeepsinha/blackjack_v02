package com.project.blackjack_v02;

public class Cards
{
    Suit suit;
    Ranks rank;

    public Cards(Suit suit, Ranks rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public Ranks getRank()
    {
        return rank;
    }
    
    @Override
	public String toString() {
		return "Cards [suit=" + suit + ", rank=" + rank + "]";
	}

}