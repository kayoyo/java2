package com.kita.second;

public class Gugudan { // 자바 소스 파일 이름과 같은 class만 public 사용 가능

	public static void main(String[] args) {
		/*
		 * gugudan(2, 5);
		 * 
		 * int sum = sum(1, 2); sum = sum(1, 2, 3); sum = sum(1, 2, 3, 4, 5, 6, 7, 8, 9,
		 * 10);
		 */

		/*int result = Utils.parseStringToInt("10", 0);
		result = Utils.parseStringToInt("aa10", 0);
		result = Utils.parseStringToInt("aa10");
		result = Utils.parseStringToInt("9");
		
		int [] arr = {4, 5, 11, 223, 3, 10};
		
		Utils.sortASC(arr); //오름차순
		Utils.sortDESC(arr); //내림차순*/
		
		int[]rArr = Utils.createRandomArr(5,15,10);
		Utils.printArr(rArr);
		
		rArr = Utils.createRandomArrNoDuplication(5, 15, 11);
		Utils.printArr(rArr);
		
		
	}
	
	

	/*public static int sum(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
		}
		return sum;
	}

	// void형 gugudan 메소드 생성(객체화의 여부)
	public static void gugudan(int num, int num2) { // 2,5
		for (; num <= num2; num++) { // 2,3,4,5
			for (int i = 1; i < 10; i++) { // 1~9
				if ((num * i) % 2 == 0) {

				}
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
		}*/
	
}

