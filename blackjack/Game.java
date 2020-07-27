package com.kita.second.blackjack;

public class Game {
	
	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck(); //52장의 카드
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
	
		gamer.openCards();
		
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		
		
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		dealer.openCards();
		
		
		
	
		Rule.whoIsWin(gamer, dealer);
		

	}

}
