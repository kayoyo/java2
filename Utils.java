package com.kita.second;

public class Utils {
/*
	public static int parseStringToInt(String str) {
		return parseStringToInt(str, 0);
	}

	public static int parseStringToInt(String str, int intd) {
		int result = intd;
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return result;
		}
	}

	public static void sort(int arr[], boolean asc) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = i + 1; z < arr.length; z++) {
				if (asc == arr[i] > arr[z]) {
				}
				int temp = arr[i];
				arr[i] = arr[z];
				arr[z] = temp;
			}
		}
	}

	public static void sortASC(int[] arr) {
		sort(arr, true);
	}

	public static void sortDESC(int[] arr) {
		sort(arr, false); 
	}*/
	

	public static void printArr(int[] rArr) {
		
		if(rArr == null) {
			System.out.println("arr은 null입니다");
		} else {
			for(int i=0; i<rArr.length; i++) {
				if(i == rArr.length -1) {
					System.out.println(rArr[i]);
				} else {
					System.out.println(rArr[i]+",");
				}
			}
		}
	}
	
	public static int[] createRandomArr(int y, int r, int e) { //5,15,10
			int[] rArr = new int[e]; // 10칸의 배열
			for (int i = 0; i<e; i++) { // 0123456789
				rArr[i] = (int) (Math.random() * (r - y + 1) + y); // Math.random 범위 : 0이상~1미만
				// 15 - 5 > 10+1=11(0~10 난수 발생) > 11+5 (5~15 난수 발생 )
			}
			return rArr;
	}
	
	public static int[] createRandomArrNoDuplication(int y, int r, int e) {
		if ((r - y) < e - 1) { 
			return null;
		}
		int[] rArr = new int[e]; 
		for (int i = 0; i < e; i++) { 
			rArr[i] = (int) (Math.random() * (r - y + 1) + y);
			for (int k = 0; k < i; k++) {
				if (rArr[i] == rArr[k]) {
					i--;
					break;
				}
			}
		} return rArr;
	}

	
	
	}


