package com.kita.second.blackjack;

public class Dealer extends Gamer {
	// Gamer가 가지고 있는 메소드 사용 가능(참조), 메소드 추가 가능, import 필요 없음
	
	@Override
	public void moreCards(CardDeck cd) {
		// 딜러가 가지고 있는 카드의 합계점수가 17점 이상이 될 때 까지 카드 뽑기
		
		while(true) { 
			if(getTotalPoint() >= 17) { 
				break;		
			} receiveCard(cd.getCard());
	   
	}

}
}
