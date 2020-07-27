package com.kita.second.blackjack;

public class Rule {

	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		
		int WinScore = 21;
		int gamerScore = gamer.getTotalPoint();
		int dealerScore = dealer.getTotalPoint();
		
		if(gamerScore == dealerScore || (gamerScore > WinScore && dealerScore > WinScore)) {
			System.out.println("비김");
		} else if((gamerScore <= WinScore && gamerScore > dealerScore) || dealerScore > WinScore){
			System.out.println("게이머 승");
		} else {
			System.out.println("딜러 승");
		}
		
	}
}
	
	


