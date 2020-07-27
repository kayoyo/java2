package com.kita.second.blackjack;

public class Card {
	
	//member field
	public final static String [] PATTERND = {"♠", "♥", "♣","◆"};
	private final String pattern; //값 넣을 때 : 생성자, setter > 값 가져올 때 : getter
    private final String denomination;
    private final int point;
    //member field
	
    //생성자: 클래스와 이름이 같다. return 타입을 적으면 안된다.
    //생성자로 값을 넣는 이유는 값을 바꾸지 못하게 위해서, setter를 쓰게 되면 값이 바뀔 수 있다.
    /*public Card() { 기본 생성자
   	
    }*/
    
    //constructor
	public Card(String pattern, String denomination, int point) { 
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	//constructor
	
	//getter
	public String getPattern() {
		return pattern;
	}
	public String getDenomination() {
		return denomination;
	}
	public int getPoint() {
		return point;
	}
	//getter
	
	@Override
	public String toString() {
		return String.format("%s, %s", pattern, denomination);
	}
	
	/*setter
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public void setDenomination(String denomination) {
		this.pattern = pattern;
	}*/


}
