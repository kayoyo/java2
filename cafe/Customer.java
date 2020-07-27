package com.kita.second.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	
	List<MenuItem> bill =  new ArrayList<MenuItem>();

	public int orderMenu() {
		Scanner sc = new Scanner(System.in); 
		String temp = sc.next();
		try {
			return Integer.parseInt(temp);
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		} return orderMenu();
		
		}
	
	public void init() {
		System.out.println("메뉴 번호로 선택해 주세요. 0번 종료");
		int itemp = 0;
		while (true) {
			itemp = orderMenu();
		}
	}
	
	
	
	
	public void showBill() {
		int itemp = 0;
		for(int i=0; i<bill.size(); i++) {
			itemp += bill.get(i).getPrice();
		}
		myOder();
		System.out.printf("합계금액 : %,d원", itemp);
		
	} 
	
	public void myOder() {
		System.out.print("-----------------------------------\n");
		for(int i=0; i<bill.size(); i++) {
			System.out.printf("%d. %s\n", i+1, bill.get(i));;
		}
		System.out.print("-----------------------------------\n");
	}
	
	public void order(MenuBoard m) {
		m.showMenu();
	
		
	}
	
	}

	
	
	
	
	

