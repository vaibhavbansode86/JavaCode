package com.atimsa.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int mid=9/2;
		for(int i=5;i>0;i--) {
			for(int j=0;j<9;j++) {
				if(j<(mid+i) && j>(mid-i)){
					if(i%2!=0) {
						System.out.print("1");
					}else {
						System.out.print("2");
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
