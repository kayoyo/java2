package com.kita.second.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

	// card 객체의 주소값 타입으로 ArrayList 생성
	private List<Card> arr = new ArrayList();

	public CardDeck() {
		init();
		shuffle();
	}
	
	public void shuffle() {
		Collections.shuffle(arr);
	}

	public void init() {
		for (int i = 0; i < Card.PATTERND.length; i++) {//0♠ 1♥ 2♣ 3◆
			for (int j = 1; j <= 13; j++)  { 
//				arr.add(new Card(Card.PATTERND[i],getDeno(j)));
				String pattern = Card.PATTERND[i];
				String deno = getDeno(j); // "J";
				int point = getPoint(j);
				Card c = new Card(pattern, deno, point);  // Card형의 ArrayList 이기 때문에 pattern, getDeno을 동시에 넣을 수 있음(기존 배열은 하나의 인덱스에 하나의 값을 넣을 수 있음)
				arr.add(c);
			}
			
		}
	}
	private int getPoint(int pp) {
		return pp > 10 ? 10 : pp;
		 
	}
	
	
	
	private String getDeno(int num) { //getDeno(j)
		switch (num) { 
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default : return String.valueOf(num);
		
	}
	}
	
	    @Override
		public String toString() {
	    	/* String str = "";
	    	 * for(Card c : arr) {
	    	 * str += (c+"\n")
	    	 * return str; }
	    	 */
	    	for(Card c : arr) {
	    		System.out.println(c);
	    	}	return "";
	    }

		public Card getCard() { //랜덤한 카드를 1장 리턴 후 카드덱에서 리턴한 카드 삭제 
			Card cc; //리턴할 값 생성
			int temp = (int)(Math.random()*arr.size()); //변수를 생성해서 난수를 넣어주는 이유는 값이 바뀌지 않게 하기 위해서   
			cc = arr.get(temp);
			arr.remove(temp); 
			return cc; 
			//return arr.remove((int)(Math.random()*arr.size()));
			

}
}

