package com.kita.second.cafe;

public class MenuItem {
	
	//전역변수
	private String name;
	private int price;
	
	//생성자
	public MenuItem (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	//게터
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %,d원", name, price); //item1과 item2를 출력
	}
	
	

	
	
}
