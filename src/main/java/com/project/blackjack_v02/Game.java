package com.project.blackjack_v02;

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

	private static void Game() 
  {
		// TODO Auto-generated method stub
		
	}
}
