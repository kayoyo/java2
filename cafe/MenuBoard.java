package com.kita.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class MenuBoard {

	private List<MenuItem> items = new ArrayList<MenuItem>();

	public MenuBoard() {

		init();
	}

	public void init() {

		items.add(new MenuItem("아메리카노", 1500));
		items.add(new MenuItem("카푸치노", 1500));
		items.add(new MenuItem("에스프레소", 1500));
		items.add(new MenuItem("카라멜마끼야또", 2500));

	}

	@Override
	public String toString() {
		String temp = "";
		for (int i = 0; i < items.size(); i++) {
			temp += String.format("%s\n", items.get(i)); //items 리스트 배열에 값을 넣어줌
		}
		return temp;

	}

	public void showMenu() { 
		System.out.println("----- Menu -----");
		for(int i=0;i < items.size(); i++) {
			System.out.printf("%d. %s\n",i+1, items.get(i)); // board.showMenu 출력
		}
		
		}
		
	public MenuItem choose(int idx) {
		return items.get(idx);
		
	}
	}


