package com.kita.second.blackjack;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gamer {

	// 전역변수
	private List<Card> arr;

	public Gamer() {
		arr = new ArrayList();//LikedList();도 가능
		
	}
	// 전역변수

	public void receiveCard(Card card) {
		arr.add(card); //ArryList 객체에 add
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for (Card c : arr) {
			sum += c.getPoint();
		}
		return sum;
	}
	
	public void openCards() {
		for (Card c : arr) {
			System.out.println(c);
		}
		System.out.printf("점수 : %d\n",getTotalPoint());
	}
	
	
	public void moreCards(CardDeck cd) {
		//카드를 더 받을 것인지 입력 받기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("카드를 받으시겠습니까? (go)");
			String answer = sc.next();
			if(answer.equals("go")) { 
				break;
			}
			receiveCard(cd.getCard());
		} 
			sc.close();
		}

	
		
		
	}

	

	
	

//	public void openCards() {
//		String temp1 = ""; //pattern과 denomination를 가져올 String 변수
//		int temp2 = 0; // total point를 더해줄 int 변수
//		for (Card card : arr) { //getCard의 값을 가져와서 ArrayList()만큼 반복 후 값 나열
//			temp1 += card + "\n";  
//			temp2 += card.getPoint();
//		}
//		System.out.printf("%stotal : %d", temp1, temp2);
//	}


