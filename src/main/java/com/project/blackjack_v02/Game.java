package com.project.blackjack_v02;

import java.util.ArrayList;
import java.util.List;

public class Game
{
	Deck deck = new Deck();
	Player sam = new Player();
	Dealer dealer = new Dealer();
//	private List<Cards> currCard = new ArrayList<Cards>();
	private final int BLACKJACK_VALUE = 21;

	public Game() {
		// TODO Auto-generated method stub

	}

	public void main()
	{
		deck.shuffle();
//		System.out.println(deck);
		dealCardsToPlayers();


	}
	private void dealCardsToPlayers()
	{
		givePlayerACard();
		giveDealerACard();
		givePlayerACard();
		giveDealerACard();

		System.out.println("Welcome to Blackjack");
		System.out.println("Sam Cards" + sam.getCardsList());
		System.out.println("Dealer has " + dealer.getCardsList());

		//getting score
		System.out.println(sam.getScore());
		System.out.println(dealer.getScore());
	}

	private void givePlayerACard()
	{
		sam.setCardsList(deck.dealCard());
	}

	private void giveDealerACard()
	{
		dealer.setCardsList(deck.dealCard());
	}

	private void gameLogic()
	{

//		check if either player has Blackjack with their initial hand and wins the game.
//		Blackjack is an initial score of 21 with two cards: A + [10, J, Q, K]
//		sam wins when both players starts with Blackjack

		if (sam.getScore() == BLACKJACK_VALUE )
		{
			System.out.println("Sam wins this round, Congratulations");
		}

		else if(dealer.getScore() == BLACKJACK_VALUE)
		{
			System.out.println("Dealer wins this round");
		}
//		dealer wins when both players starts with 22 (A + A)
//		sam has lost the game if their total is higher than 21

		else if (sam.getScore() > BLACKJACK_VALUE)
		{
			System.out.println("Sam has lost, Dealer Wins");
		}

		//the dealer has lost the game if their total is higher than 21
		else if(dealer.getScore() > BLACKJACK_VALUE)
		{
			System.out.println("Sam wins this round, Congratulations");
		}
		else
		{
			//sam can start drawing cards
			while(sam.getScore() < 17)
			{
				//sam will draw cards
			}

		}



	}
}
