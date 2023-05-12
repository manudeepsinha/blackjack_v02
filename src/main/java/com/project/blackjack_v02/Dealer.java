package com.project.blackjack_v02;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    private int score = 0;
    private List<Cards> cardsList = new ArrayList<Cards>();

    public int getScore() {
        int total = 0;
        for(Cards card: cardsList) {
            total += card.getRank().getValue();
        }
        return total;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public List<Cards> getCardsList() {
        return cardsList;
    }
    public void setCardsList(Cards card) {
        this.cardsList.add(card);
    }

}