package com.project.blackjack_v02;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
<<<<<<< HEAD

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
=======
	
	private int score = 0;
	private List<Cards> cardsList = new ArrayList<Cards>();
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<Cards> getCardsList() {
		return cardsList;
	}
	public void setCardsList(List<Cards> cardsList) {
		this.cardsList = cardsList;
	}
>>>>>>> 7439b37ff1f99af662b9728b36123d723877414d

}